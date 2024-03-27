package com.staffing.serviceImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Payments;
import com.model.UtilityConfig;
import com.staffing.service.PaymentsService;

public class PaymentsServiceImpl implements PaymentsService {

    public int insertPayment(Payments p) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(p);
            transaction.commit();
            System.out.println("Payment details inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Return appropriate error code or handle the exception as needed
        }
        return 1; // Return success code
    }

    public void updatePayment(Payments p) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(p);
            transaction.commit();
            System.out.println("Payment details updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletePayment(Payments p) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(p);
            transaction.commit();
            System.out.println("Payment details deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayPayments() {
        try (Session session = UtilityConfig.getSession()) {
            TypedQuery<Payments> tq = session.createQuery("from Payments", Payments.class);
            List<Payments> list = tq.getResultList();
            Iterator<Payments> itr = list.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getPayment(int paymentId) {
        try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Payments payment = session.get(Payments.class, paymentId);
            transaction.commit();
            System.out.println(payment.getAmount() + " " + payment.getContractID() + " " + payment.getPaymentID() + " " + payment.getPaymentMethod() + " " + payment.getStatus() + " " + " " + payment.getPaymentDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public int insertPayments111(Payments p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatePayments1(Payments p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePayments1(Payments p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayPayments1(Payments p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPayments1(Payments p) {
		// TODO Auto-generated method stub
		
	}
}
