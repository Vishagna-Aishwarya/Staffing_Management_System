package com.staffing.service;
import com.model.Placements;

public interface PlacementsService {
	
	int insertPlacement(Placements pl);
	void updatePlacement(Placements pl);
	void deletePlacement(Placements pl);
	void displayPlacements(Placements pl);
	void getPlacement(Placements pl);

}