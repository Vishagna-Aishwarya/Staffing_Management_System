package com.staffing.serviceImpl;

import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.Submissions;
import com.model.UtilityConfig;
import com.staffing.service.SubmissionsService;

public class SubmissionsServiceImpl implements SubmissionsService {

    Session session = UtilityConfig.getSession();

    public int insertSubmission(Submissions subs) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(subs);
            transaction.commit();
            System.out.println("Submission details inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return 1;
    }

    public void updateSubmission(Submissions subs) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(subs);
            transaction.commit();
            System.out.println("Submission details updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteSubmission(Submissions subs) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(subs);
            transaction.commit();
            System.out.println("Submission details deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void displaySubmissions() {
        try (Session session = UtilityConfig.getSession()) {
            TypedQuery tq = session.createQuery("from Submission");
            List<Submissions> list = tq.getResultList();
            Iterator<Submissions> itr = list.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void getSubmission(int submissionId) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Submissions submission = session.get(Submissions.class, submissionId);
            transaction.commit();
            System.out.println(submission.getSubmissionId() + " "  + " " + submission.getStatus() + " " + submission.getSubmissionId() + " "  + " " + " " + submission.getSubmissionDate());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

	public int insertSubmissions1(Submissions subs) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateSubmissions1() {
		// TODO Auto-generated method stub
		
	}

	public void deleteSubmissions1() {
		// TODO Auto-generated method stub
		
	}

	public void displaySubmissions1() {
		// TODO Auto-generated method stub
		
	}

	public void getSubmissions() {
		// TODO Auto-generated method stub
		
	}

	public int insertSubmissions(Submissions subs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateSubmissions(Submissions subs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubmissions(Submissions subs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displaySubmissions(Submissions subs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSubmissions(Submissions subs) {
		// TODO Auto-generated method stub
		
	}
}
