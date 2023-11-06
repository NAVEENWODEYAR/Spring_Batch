package com.bhas.config;

import com.bhas.dao.EmployeeRepo;
import com.bhas.modal.Employee;
import lombok.AllArgsConstructor;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

@Configuration
@EnableBatchProcessing
@AllArgsConstructor
public class EmployeeBatchConfig
{

    private JobBuilder jobBuilder;
    private StepBuilder stepBuilder;
    private EmployeeRepo employeeRepo;


    // 1. File/Item Reader.
    @Bean
    public FlatFileItemReader<Employee> reader()
    {
        FlatFileItemReader<Employee> fileReader = new FlatFileItemReader<>();

            fileReader.setResource(new FileSystemResource("src/main/resource/Employee.csv"));
            fileReader.setName("csv-reader");
            fileReader.setLinesToSkip(1);
            fileReader.setLineMapper(lineMapper());

        return fileReader;
    }

    private LineMapper<Employee> lineMapper()
    {
        DefaultLineMapper<Employee> lineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
                                delimitedLineTokenizer.setDelimiter(" ");
                                delimitedLineTokenizer.setStrict(false);
                                delimitedLineTokenizer.setNames("eId","First_Name","Lirst_Name","Emp_Email","Emp_Gender","Emp_IP_Address","Emp_Salary","Emp_Country");

        BeanWrapperFieldSetMapper<Employee> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
                                            fieldSetMapper.setTargetType(Employee.class);

        lineMapper.setLineTokenizer(delimitedLineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);

        return lineMapper;
    }

    // 2. File/Item Processor.
}
