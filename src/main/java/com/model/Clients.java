package com.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.model.Clients;

@Entity
public class Clients {
	@Id
    private int clientID;
	
	@Column(name = "CompanyName")
    private String companyname;
	
	@Column(name = "ContactPerson")
    private String contactperson;
    
	@Column(name = "Email")
    private String email;
	
	@Column(name = "Phone")
    private String phone;
	
	@Column(name = "Address")
    private String address;
	
	public Clients() {
		super();
		// Default Constructor
	}
    
    public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Placements> getPlacements() {
		return placements;
	}

	public void setPlacements(Set<Placements> placements) {
		this.placements = placements;
	}

	public Set<Contracts> getContracts() {
		return contracts;
	}

	public void setContracts(Set<Contracts> contracts) {
		this.contracts = contracts;
	}

	@OneToMany(mappedBy = "client",cascade=CascadeType.ALL)
    private Set<Placements> placements=new HashSet<>();
    
    @OneToMany(mappedBy = "client",cascade=CascadeType.ALL)
    private Set<Contracts> contracts=new HashSet<>();

	public Clients(int clientID, String companyname, String contactperson, String email, String phone, String address,
			Set<Placements> placements, Set<Contracts> contracts) {
		this.clientID = clientID;
		this.companyname = companyname;
		this.contactperson = contactperson;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.placements = placements;
		this.contracts = contracts;
	}

	@Override
	public String toString() {
		return "Clients [clientID=" + clientID + ", companyname=" + companyname + ", contactperson=" + contactperson
				+ ", email=" + email + ", phone=" + phone + ", address=" + address + ", placements=" + placements
				+ ", contracts=" + contracts + "]";
	}

}
