package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.model.Submissions;
import com.staffing.service.SubmissionsService;
import com.staffing.serviceImpl.SubmissionsServiceImpl;

@Entity
@Table(name = "Submissions")
public class Submissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SubmissionId")
    private int submissionId;
    
    @Column(name = "SubmissionDate")
    private Date SubmissionDate;
    
    @Column(name = "Status")
    private String Status;
    
    @ManyToOne
    @JoinColumn(name = "CandidateID", insertable = false, updatable = false)
    private Candidates candidate;

    @ManyToOne
    @JoinColumn(name = "JobID", insertable = false, updatable = false)
    private Jobs job;
    
    


    public Submissions(int submissionId, int candidateID, int jobID, Date submissionDate, String status,
			Candidates candidate, Jobs job) {
		super();
		this.submissionId = submissionId;
		SubmissionDate = submissionDate;
		Status = status;
		this.candidate = candidate;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Submissions [submissionId=" + submissionId + ", SubmissionDate=" + SubmissionDate + ", Status=" + Status
				+ ", candidate=" + candidate + ", job=" + job + "]";
	}

	public int getSubmissionId() {
		return submissionId;
	}

	public void setSubmissionId(int submissionId) {
		this.submissionId = submissionId;
	}

	public Date getSubmissionDate() {
		return SubmissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		SubmissionDate = submissionDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Candidates getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidates candidate) {
		this.candidate = candidate;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public Submissions() {
		// TODO Auto-generated constructor stub
	}

	

	public void setSubmissionDate(int subdate) {
		// TODO Auto-generated method stub
		
	}

	public void setCandidateID(int cid11) {
		// TODO Auto-generated method stub
		
	}

	public void setJobID(int jid1) {
		// TODO Auto-generated method stub
		
	}

	public void setSubmissionDate(String subdate) {
		// TODO Auto-generated method stub
		
	}

	public void setSubmissionDate(SubmissionsServiceImpl submissionService) {
		// TODO Auto-generated method stub
		
	}

	public void setSubmissionDate(SubmissionsService submissionService) {
		// TODO Auto-generated method stub
		
	}

}   

