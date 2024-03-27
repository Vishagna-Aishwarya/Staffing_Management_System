package com.staffing.service;
import com.model.Candidates;

public interface CandidatesService {
	
	int insertCandidates(Candidates cndt);
	void updateCandidates(Candidates cndt);
	void deleteCandidates(Candidates cndt);
	void displayCandidates(Candidates cndt);
	void getCandidates(Candidates cndt);

}
