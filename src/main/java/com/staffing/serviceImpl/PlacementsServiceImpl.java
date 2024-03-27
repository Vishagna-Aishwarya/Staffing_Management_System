package com.staffing.serviceImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Placements;
import com.model.UtilityConfig;
import com.staffing.service.PlacementsService;

public class PlacementsServiceImpl implements PlacementsService {

    public int insertPlacement(Placements pl) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(pl);
            transaction.commit();
            System.out.println("Placement details inserted successfully.");
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void updatePlacement(Placements pl) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(pl);
            transaction.commit();
            System.out.println("Placement details updated successfully.");
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public void deletePlacement(Placements pl) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(pl);
            transaction.commit();
            System.out.println("Placement details deleted successfully.");
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public void displayPlacements() {
        try (Session session = UtilityConfig.getSession()) {
            TypedQuery<Placements> tq = session.createQuery("from Placements", Placements.class);
            List<Placements> list = tq.getResultList();
            Iterator<Placements> itr = list.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void getPlacement(int placementId) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Placements placement = session.get(Placements.class, placementId);
            transaction.commit();
            System.out.println(placement.getPlacementId() + " " + placement.getStatus() + " " + placement.getCandidates() + " " + placement.getClient() + " " + placement.getJob() + " " + placement.getPlacementDate() + " " + placement.getSalaryOffered());
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

	@Override
	public void displayPlacements(Placements pl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPlacement(Placements pl) {
		// TODO Auto-generated method stub
		
	}

}
