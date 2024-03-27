package com.staffing.service;
import com.model.Contracts;

public interface ContractsService {
	
	int insertContracts(Contracts cnts);
	void updateContracts(Contracts cnts);
	void deleteContracts(Contracts cnts);
	void displayContracts(Contracts cnts);
	void getContracts(Contracts cnts);

}