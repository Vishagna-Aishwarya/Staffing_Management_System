package com.staffing.service;
import com.model.Interviews;

public interface InterviewsService {
	
	int insertInterviews(Interviews Intw);
	void updateInterviews(Interviews Intw);
	void deleteInterviews(Interviews Intw);
	void displayInterviews(Interviews Intw);
	void getInterviews(Interviews Intw);

}