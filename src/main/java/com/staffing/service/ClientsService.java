package com.staffing.service;
import com.model.Clients;

public interface ClientsService {
	
	int insertClients(Clients clnt);
	void updateClients();
	void deleteClients();
	void displayClients();
	void getClients(Clients clientID);
	void displayClients(Clients clnt);
	void getClients();

}