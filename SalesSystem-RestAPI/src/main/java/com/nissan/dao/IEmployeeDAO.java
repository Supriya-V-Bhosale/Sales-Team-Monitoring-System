package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Employee;
@Repository
public interface IEmployeeDAO extends JpaRepositoryImplementation<Employee, Integer> {

}
