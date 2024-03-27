// Jobs class
package com.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobID;
    private String title;
    private String description;
    private String skillsRequired;
    private int experienceRequired;
    private String salaryRange;
    private String location;
    private String status;
    
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private Set<Submissions> submissions = new HashSet<>();
    
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private Set<Interviews> interviews = new HashSet<>();
    
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private Set<Placements> placements = new HashSet<>();

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSkillsRequired() {
		return skillsRequired;
	}

	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public int getExperienceRequired() {
		return experienceRequired;
	}

	public void setExperienceRequired(int experienceRequired) {
		this.experienceRequired = experienceRequired;
	}

	public String getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Submissions> getSubmissions() {
		return submissions;
	}

	public void setSubmissions(Set<Submissions> submissions) {
		this.submissions = submissions;
	}

	public Set<Interviews> getInterviews() {
		return interviews;
	}

	public void setInterviews(Set<Interviews> interviews) {
		this.interviews = interviews;
	}

	public Set<Placements> getPlacements() {
		return placements;
	}

	public void setPlacements(Set<Placements> placements) {
		this.placements = placements;
	}

	public Jobs(int jobID, String title, String description, String skillsRequired, int experienceRequired,
			String salaryRange, String location, String status, Set<Submissions> submissions,
			Set<Interviews> interviews, Set<Placements> placements) {
		super();
		this.jobID = jobID;
		this.title = title;
		this.description = description;
		this.skillsRequired = skillsRequired;
		this.experienceRequired = experienceRequired;
		this.salaryRange = salaryRange;
		this.location = location;
		this.status = status;
		this.submissions = submissions;
		this.interviews = interviews;
		this.placements = placements;
	}

	public Jobs() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Jobs [jobID=" + jobID + ", title=" + title + ", description=" + description + ", skillsRequired="
				+ skillsRequired + ", experienceRequired=" + experienceRequired + ", salaryRange=" + salaryRange
				+ ", location=" + location + ", status=" + status + ", submissions=" + submissions + ", interviews="
				+ interviews + ", placements=" + placements + "]";
	}

	public void setExperienceRequired(String exre) {
		// TODO Auto-generated method stub
		
	}

    
}
