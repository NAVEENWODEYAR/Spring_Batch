package com.bhas.dao;

import com.bhas.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// DAO
public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{

}
