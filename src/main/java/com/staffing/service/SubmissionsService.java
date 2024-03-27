package com.staffing.service;
import com.model.Submissions;

public interface SubmissionsService {
	
	int insertSubmissions(Submissions subs);
	void updateSubmissions(Submissions subs);
	void deleteSubmissions(Submissions subs);
	void displaySubmissions(Submissions subs);
	void getSubmissions(Submissions subs);

}