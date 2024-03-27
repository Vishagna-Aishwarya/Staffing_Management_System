package com.staffing.serviceImpl;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.UtilityConfig;

import com.model.Candidates;
import com.staffing.service.CandidatesService;

public class CandidatesServiceImpl implements CandidatesService {

	Session session;
	Transaction transaction;
	private Serializable candidateID;
	
	public int insertCandidates(Candidates candidate) {
	    Session session = null;
	    try {
	        session = UtilityConfig.getSession();
	        Transaction transaction = session.beginTransaction();
	        session.save(candidate);
	        transaction.commit();
	        System.out.println("Candidate details inserted successfully.");
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        if (session != null && session.isOpen()) {
	            session.close();
	        }
	    }
	    return 1;
	}

	public void updateCandidates(Candidates cndt) {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(cndt);
    		transaction.commit();
    		System.out.println("Candidate Details updated successfully for Marketing..");
        } catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			session.close();
		}
	}

	public void deleteCandidates(Candidates cndt) {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(cndt);
    		transaction.commit();
    		System.out.println("Candidate Details deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			session.close();
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void displayCandidates(Candidates cndt) {
		
		TypedQuery tq = session.createQuery("from candidates");
		List<Candidates> list = tq.getResultList();

		Iterator<Candidates> itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	
	public void getCandidates() {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Candidates cndt = session.get(Candidates.class, candidateID);
            transaction.commit();
            System.out.println(cndt.getCandidateID() + " " + cndt.getName() + " " + cndt.getEmail() + " " + cndt.getPhone() + " " + cndt.getSkills() + " " + cndt.getExperience() + " " + cndt.getResume());
        } catch (Exception e) {
            e.printStackTrace();
        }		
		finally {
			session.close();
		}
	}

	public void displayCandidate(Candidates cndt) {
		// TODO Auto-generated method stub
		
	}

	public void getCandidate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCandidates(Candidates cndt) {
		// TODO Auto-generated method stub
		
	}

}