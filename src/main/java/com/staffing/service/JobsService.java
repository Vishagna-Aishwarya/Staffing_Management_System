package com.staffing.service;
import com.model.Jobs;

public interface JobsService {
	
	int insertJobs(Jobs jbs);
	void updateJobs(Jobs jbs);
	void deleteJobs(Jobs jbs);
	void displayJobs(Jobs jbs);
	void getJobs(Jobs jbs);

}