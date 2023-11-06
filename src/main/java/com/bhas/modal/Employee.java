package com.bhas.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMP_INFO")
public class Employee
{
    @Id
    @Column(name = "EMPLOYEE_ID")
    private int empId;

    @Column(name = "EMPLOYEE_FIRST_NAME")
    private String First_Name;

    @Column(name = "EMPLOYEE_LAST_NAME")
    private String Last_Name;

    @Column(name = "EMPLOYEE_EMAIL")
    private String Emp_Email;

    @Column(name = "EMPLOYEE_GENDER")
    private String Emp_Gender;

    @Column(name = "EMPLOYEE_IP")
    private long Emp_IP_Address;

    @Column(name = "EMPLOYEE_SALARY")
    private long Emp_Salary;

    @Column(name = "EMPLOYEE_COUNTRY")
    private String Emp_Country;

}
