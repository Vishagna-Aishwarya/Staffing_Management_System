package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.model.Interviews;

@Entity
public class Interviews {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int interviewID;

	@Column(name="InterviewDate")
    private Date interviewDate;
	
	@Column(name="Interviewer")
    private String interviewer;
	
	@Column(name="InterviewLocation")
    private String interviewLocation;
	
	@Column(name="Feedback")
    private String feedback;
	
	@Column(name="Status")
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "CandidateID")
    private Candidates candidate;
    
    @ManyToOne
    @JoinColumn(name = "JobID")
    private Jobs job;

    public Interviews() {
        // Default constructor
    }

	public int getInterviewID() {
		return interviewID;
	}

	public void setInterviewID(int interviewID) {
		this.interviewID = interviewID;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}



	public String getInterviewLocation() {
		return interviewLocation;
	}



	public void setInterviewLocation(String interviewLocation) {
		this.interviewLocation = interviewLocation;
	}



	public String getFeedback() {
		return feedback;
	}



	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}

	public Interviews(int interviewID, Date interviewDate, String interviewer, String interviewLocation,
			String feedback, String status, Candidates candidate, Jobs jobs) {
		super();
		this.interviewID = interviewID;
		this.interviewDate = interviewDate;
		this.interviewer = interviewer;
		this.interviewLocation = interviewLocation;
		this.feedback = feedback;
		this.status = status;
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "Interviews [interviewID=" + interviewID + ", interviewDate=" + interviewDate + ", interviewer="
				+ interviewer + ", interviewLocation=" + interviewLocation + ", feedback=" + feedback + ", status="
				+ status + ", candidate=" + candidate + ", job=" + job + "]";
	}

	public void setInterviewDate(int idate) {
		// TODO Auto-generated method stub
		
	}

	

	
   
}
