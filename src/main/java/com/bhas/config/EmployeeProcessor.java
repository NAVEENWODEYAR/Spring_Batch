package com.bhas.config;

import com.bhas.modal.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements ItemProcessor<Employee,Employee>
{

    @Override
    public Employee process(Employee item) throws Exception
    {
        return item;
    }
}
