package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payments {
    
    @Id
    private int paymentID;
    
    private int contractID;
    private Date paymentDate;
    private double amount;
    private String paymentMethod;
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "contractID", insertable=false, updatable=false)
    private Contracts contract;
    
    public Payments() {
        // Default constructor
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contracts getContract() {
        return contract;
    }

    public void setContract(Contracts contract) {
        this.contract = contract;
    }

    public Payments(int paymentID, int contractID, Date paymentDate, double amount, String paymentMethod, String status,
            Contracts contract) {
        super();
        this.paymentID = paymentID;
        this.contractID = contractID;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Payments [paymentID=" + paymentID + ", contractID=" + contractID + ", paymentDate=" + paymentDate
                + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", status=" + status + ", contract="
                + contract + "]";
    }

	public void setPaymentID(Object object) {
		// TODO Auto-generated method stub
		
	}

	public void setPaymentDate(int payduedate) {
		// TODO Auto-generated method stub
		
	}
}
