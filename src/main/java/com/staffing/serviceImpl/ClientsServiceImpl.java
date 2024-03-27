package com.staffing.serviceImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.UtilityConfig;
import com.model.Clients;
import com.staffing.service.ClientsService;

public class ClientsServiceImpl implements ClientsService {

    public int insertClients(Clients client) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(client);
            transaction.commit();
            System.out.println("Client Details Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    public void updateClients(Clients client) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(client);
            transaction.commit();
            System.out.println("Client Details Updated Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteClients(Clients client) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(client);
            transaction.commit();
            System.out.println("Client Details Deleted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayClients() {
        try (Session session = UtilityConfig.getSession()) {
            TypedQuery<Clients> query = session.createQuery("from Clients", Clients.class);
            List<Clients> clients = query.getResultList();

            Iterator<Clients> itr = clients.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getClient(int clientID) {
        try (Session session = UtilityConfig.getSession()) {
            Clients client = session.get(Clients.class, clientID);
            if (client != null) {
                System.out.println(client);
            } else {
                System.out.println("Client not found with ID: " + clientID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public void updateClients() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClients() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getClients(Clients clientID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayClients(Clients clnt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getClients() {
		// TODO Auto-generated method stub
		
	}

}
