package com.bhas.modal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @GetMapping("/test/{st}")
    public String testPoint(String st)
    {
        return "Hello,"+st+" welcome to Employee App.";
    }
}
