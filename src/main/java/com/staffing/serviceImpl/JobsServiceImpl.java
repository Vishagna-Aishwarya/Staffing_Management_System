package com.staffing.serviceImpl;

import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.UtilityConfig;
import com.model.Jobs;

import com.staffing.service.JobsService;

public class JobsServiceImpl implements JobsService {

    Session session = UtilityConfig.getSession();

    public int insertJob(Jobs jbs) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(jbs);
            transaction.commit();
            System.out.println("Job details inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return 1;
    }

    public void updateJob(Jobs jbs) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(jbs);
            transaction.commit();
            System.out.println("Job details updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteJob(Jobs jbs) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(jbs);
            transaction.commit();
            System.out.println("Job details deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void displayJobs() {
        try (Session session = UtilityConfig.getSession()) {
            TypedQuery tq = session.createQuery("from Job");
            List<Jobs> list = tq.getResultList();
            Iterator<Jobs> itr = list.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void getJob(int jobId) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Jobs job = session.get(Jobs.class, jobId);
            transaction.commit();
            System.out.println(job.getJobID() + " " + job.getDescription() + " " + job.getSkillsRequired() + " " + job.getLocation() + " " + job.getSalaryRange() + " " + job.getSkillsRequired() + " " + job.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

	public int insertJobs1(Jobs jbs) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateJobs1(Jobs jbs) {
		// TODO Auto-generated method stub
		
	}

	public void deleteJobs() {
		// TODO Auto-generated method stub
		
	}

	
	public void displayJobs1() {
		// TODO Auto-generated method stub
		
	}

	public void getJobs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertJobs(Jobs jbs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateJobs(Jobs jbs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteJobs(Jobs jbs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayJobs(Jobs jbs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getJobs(Jobs jbs) {
		// TODO Auto-generated method stub
		
	}
}
