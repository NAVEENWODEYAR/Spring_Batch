package com.bhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
		System.out.println("Spring Batch provides classes and APIs to read/write resources, transaction management, " +
				"job processing statistics, job restart, and partitioning techniques to process high-volume data.");
	}

}
