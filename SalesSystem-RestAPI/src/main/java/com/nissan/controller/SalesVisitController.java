package com.nissan.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nissan.model.SalesVisit;
import com.nissan.service.ISalesVisitService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class SalesVisitController {
	@Autowired
	ISalesVisitService salesVisitService;
	//Get all list of Employee http://localhost:9091/api/salesVisit
	@GetMapping("salesVisit")
	public List<SalesVisit> getAllSalesVisit() {
		return salesVisitService.listAllSalesVisit();

	}
	
	
	@PostMapping("salesVisit")
	public SalesVisit inserSalesVisit(@RequestBody SalesVisit salesVisit) {
		return salesVisitService.addSalesVisit(salesVisit);
	}
	
	@GetMapping("salesVisit/{id}")
	public Optional<SalesVisit> searchSalesVisit(@PathVariable Integer id) {
		
		return salesVisitService.searchById(id);
	}
	
	@PutMapping("salesVisit")
	public SalesVisit inserSalesVisitById(@RequestBody SalesVisit salesVisit) {
		return salesVisitService.updateSalesVisitById(salesVisit);
	}

}
