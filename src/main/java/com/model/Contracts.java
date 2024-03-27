package com.model;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Contracts {
	
    @Id
    private int contractID;
    @ManyToOne
    @JoinColumn(name = "clientID",referencedColumnName = "clientID") 
    private Clients client;

	@OneToMany(mappedBy = "ContractID",cascade=CascadeType.ALL)
    private Set<Placements> placements=new HashSet<Placements>();
 
	@OneToMany(mappedBy = "contractID",cascade=CascadeType.ALL)
    private Set<Payments> payments=new HashSet<Payments>();

	public Contracts() {
		//Default consctructor
	}

	public int getContractID() {
		return contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public Clients getClient() {
		return client;
	}
	
	

	public Contracts(int contractID, Clients client, Set<Placements> placements, Set<Payments> payments) {
		super();
		this.contractID = contractID;
		this.client = client;
		this.placements = placements;
		this.payments = payments;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Set<Placements> getPlacements() {
		return placements;
	}

	public void setPlacements(Set<Placements> placements) {
		this.placements = placements;
	}

	public Set<Payments> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payments> payments) {
		this.payments = payments;
	}

	public void Contracts1(int contractID, Clients client, Set<Placements> placements, Set<Payments> payments) {
		this.contractID = contractID;
		this.client = client;
		this.placements = placements;
		this.payments = payments;
	}

	@Override
	public String toString() {
		return "Contracts [contractID=" + contractID + ", client=" + client + ", placements=" + placements
				+ ", payments=" + payments + "]";
	}

	public void setClientID(int cnid) {
		// TODO Auto-generated method stub
		
	}

	public void StartDate(int sdate) {
		// TODO Auto-generated method stub
		
	}

	public void EndDate(int sdate1) {
		// TODO Auto-generated method stub
		
	}

	public void setEndDate() {
		// TODO Auto-generated method stub
		
	}

	public void setTerms(String terms) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus(String cstatus) {
		// TODO Auto-generated method stub
		
	}

	public void setEndDate(int sdate1) {
		// TODO Auto-generated method stub
		
	}
   
}