package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name = "tblsalesvisit")
public class SalesVisit {
	// Instance variable.
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer visitId;
		private String custName;
		private String contactPerson;
		private String contactNumber;
		private String interestProduct;
		private String visitSubject;
		private String description;
		@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
		private DateTime visitDateTime;
		private boolean isDisabled;
		private boolean isDeleted;
		private Integer empId;//FK
		// Object-Oriented class Model
		@JoinColumn(name = "empId", insertable = false, updatable = false)
		@ManyToOne
		private Employee employee;
		
		//Private Constructor
		public SalesVisit() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//Parameterized Constructor
		public SalesVisit(Integer visitId, String custName, String contactPerson, String contactNumber,
				String interestProduct, String visitSubject, String description, DateTime visitDateTime,
				boolean isDisabled, boolean isDeleted, Integer empId, Employee employee) {
			super();
			this.visitId = visitId;
			this.custName = custName;
			this.contactPerson = contactPerson;
			this.contactNumber = contactNumber;
			this.interestProduct = interestProduct;
			this.visitSubject = visitSubject;
			this.description = description;
			this.visitDateTime = visitDateTime;
			this.isDisabled = isDisabled;
			this.isDeleted = isDeleted;
			this.empId = empId;
			this.employee = employee;
		}
		
		//Setters and Getters
		public Integer getVisitId() {
			return visitId;
		}
		public void setVisitId(Integer visitId) {
			this.visitId = visitId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getContactPerson() {
			return contactPerson;
		}
		public void setContactPerson(String contactPerson) {
			this.contactPerson = contactPerson;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getInterestProduct() {
			return interestProduct;
		}
		public void setInterestProduct(String interestProduct) {
			this.interestProduct = interestProduct;
		}
		public String getVisitSubject() {
			return visitSubject;
		}
		public void setVisitSubject(String visitSubject) {
			this.visitSubject = visitSubject;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public DateTime getVisitDateTime() {
			return visitDateTime;
		}
		public void setVisitDateTime(DateTime visitDateTime) {
			this.visitDateTime = visitDateTime;
		}
		public boolean isDisabled() {
			return isDisabled;
		}
		public void setDisabled(boolean isDisabled) {
			this.isDisabled = isDisabled;
		}
		public boolean isDeleted() {
			return isDeleted;
		}
		public void setDeleted(boolean isDeleted) {
			this.isDeleted = isDeleted;
		}
		public Integer getEmpId() {
			return empId;
		}
		public void setEmpId(Integer empId) {
			this.empId = empId;
		}
		public Employee getEmployee() {
			return employee;
		}
		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		
		
		

}
