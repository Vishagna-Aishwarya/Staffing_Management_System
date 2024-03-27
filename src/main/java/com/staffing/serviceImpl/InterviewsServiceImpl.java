package com.staffing.serviceImpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.UtilityConfig;
import com.model.Interviews;
import com.staffing.service.InterviewsService;

public class InterviewsServiceImpl implements InterviewsService {

    public int insertInterview(Interviews interview) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(interview);
            transaction.commit();
            System.out.println("Interview details inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    public void updateInterview(Interviews interview) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(interview);
            transaction.commit();
            System.out.println("Interview details updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteInterview(Interviews interview) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(interview);
            transaction.commit();
            System.out.println("Interview details deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayInterviews() {
        try (Session session = UtilityConfig.getSession()) {
            TypedQuery<Interviews> query = session.createQuery("from Interviews", Interviews.class);
            List<Interviews> interviews = query.getResultList();

            for (Interviews interview : interviews) {
                System.out.println(interview);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getInterview(int interviewId) {
        try (Session session = UtilityConfig.getSession()) {
            Interviews interview = session.get(Interviews.class, interviewId);
            if (interview != null) {
                System.out.println(interview);
            } else {
                System.out.println("Interview not found with ID: " + interviewId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public int insertInterviews(Interviews Intw) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateInterviews(Interviews Intw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInterviews(Interviews Intw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayInterviews(Interviews Intw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInterviews(Interviews Intw) {
		// TODO Auto-generated method stub
		
	}
}
