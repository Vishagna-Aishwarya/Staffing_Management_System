package com.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.model.Placements;
import javax.persistence.*;

@Entity
@Table(name = "Placements")
public class Placements {
	@Id
    private int placementID;
   
    @ManyToOne
    @JoinColumn(name = "candidateID") 
    private Candidates candidate;

    @ManyToOne
    @JoinColumn(name = "jobID")
    private Jobs job;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Clients client;

    @ManyToOne
    @JoinColumn(name = "contractID")
    private Contracts ContractID;
    
    @Column(name="PlacementDate")
    private LocalDate placementDate;
        
    @Column(name="SalaryOffered")
    private BigDecimal salaryOffered;
    
    @Column(name="Status")
    private String status;

	public Placements() {
		super();
	}

	public int getPlacementId() {
		return placementID;
	}

	public void setPlacementId(int placementId) {
		this.placementID = placementId;
	}

	public Candidates getCandidates() {
		return candidate;
	}

	public void setCandidates(Candidates candidates) {
		this.candidate = candidates;
	}

	public Jobs getJob() {
		return job;
	}

	public int getPlacementID() {
		return placementID;
	}

	public void setPlacementID(int placementID) {
		this.placementID = placementID;
	}

	public Candidates getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}

	public Contracts getContractID() {
		return ContractID;
	}

	public void setContractID(Contracts contractID) {
		ContractID = contractID;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public LocalDate getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(LocalDate placementDate) {
		this.placementDate = placementDate;
	}

	public BigDecimal getSalaryOffered() {
		return salaryOffered;
	}

	public void setSalaryOffered(BigDecimal salaryOffered) {
		this.salaryOffered = salaryOffered;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public Placements(int placementID, Candidates candidate, Jobs job, Clients client, Contracts contractID,
			LocalDate placementDate, BigDecimal salaryOffered, String status) {
		super();
		this.placementID = placementID;
		this.candidate = candidate;
		this.job = job;
		this.client = client;
		ContractID = contractID;
		this.placementDate = placementDate;
		this.salaryOffered = salaryOffered;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Placements [placementID=" + placementID + ", candidate=" + candidate + ", job=" + job + ", client="
				+ client + ", ContractID=" + ContractID + ", placementDate=" + placementDate + ", salaryOffered="
				+ salaryOffered + ", status=" + status + "]";
	}

	public void setContractID(int caid) {
		// TODO Auto-generated method stub
		
	}

  
}
