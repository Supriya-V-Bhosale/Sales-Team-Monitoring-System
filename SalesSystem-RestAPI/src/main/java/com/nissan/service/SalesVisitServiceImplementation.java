package com.nissan.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IEmployeeDAO;
import com.nissan.dao.ISalesVisitDAO;
import com.nissan.model.Employee;
import com.nissan.model.SalesVisit;
@Service
public class SalesVisitServiceImplementation implements ISalesVisitService {
	
	@Autowired
	ISalesVisitDAO salesVisitDAO;
	
	@Override
	public List<SalesVisit> listAllSalesVisit() {
		// TODO Auto-generated method stub
		return salesVisitDAO.findAll();
				
	}

	@Override
	@Transactional
	public SalesVisit addSalesVisit(SalesVisit salesVisit) {
		// TODO Auto-generated method stub
		return salesVisitDAO.save(salesVisit);
	}
	

	@Override
	public Optional<SalesVisit> searchById(Integer id) {
		 Optional<SalesVisit>  salesVisit=salesVisitDAO.findById(id);
		 SalesVisit s=salesVisit.get();
		 if(s!=null) {
			 return salesVisit;
		 }
		 else
		 {
			 return null;
		 }
				
	}
	
	

	@Override
	public SalesVisit updateSalesVisitById(SalesVisit salesVisit) {
		// TODO Auto-generated method stub
		return salesVisitDAO.save(salesVisit);
	}

}
