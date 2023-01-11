package com.nissan.service;

import java.util.List;
import java.util.Optional;

import com.nissan.model.SalesVisit;

public interface ISalesVisitService {
	
	// list of all SalesVisit
	List<SalesVisit> listAllSalesVisit();
	
		
	// Add a new SalesVisit
	SalesVisit addSalesVisit(SalesVisit salesVisit);
		
	// find by id
	Optional<SalesVisit> searchById(Integer id);
		
	// Update SalesVisit
	SalesVisit updateSalesVisitById(SalesVisit salesVisit);

}
