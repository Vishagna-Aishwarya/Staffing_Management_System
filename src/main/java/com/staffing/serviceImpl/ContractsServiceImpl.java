package com.staffing.serviceImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.UtilityConfig;
import com.model.Contracts;
import com.staffing.service.ContractsService;

public class ContractsServiceImpl implements ContractsService {

    public int insertContract(Contracts cnts) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(cnts);
            transaction.commit();
            System.out.println("Contract details inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    public void updateContract(Contracts contract) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(contract);
            transaction.commit();
            System.out.println("Contract details updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteContract(Contracts contract) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(contract);
            transaction.commit();
            System.out.println("Contract details deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayContracts() {
        try (Session session = UtilityConfig.getSession()) {
            TypedQuery<Contracts> tq = session.createQuery("from Contracts", Contracts.class);
            List<Contracts> list = tq.getResultList();
            Iterator<Contracts> itr = list.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getContract(int contractId) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Contracts contract = session.get(Contracts.class, contractId);
            transaction.commit();
            System.out.println(contract.getContractID() + " " + contract.getClient());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public int insertContracts(Contracts cnts) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateContracts(Contracts cnts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContracts(Contracts cnts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayContracts(Contracts cnts) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getContracts(Contracts cnts) {
		// TODO Auto-generated method stub
		
	}
}
