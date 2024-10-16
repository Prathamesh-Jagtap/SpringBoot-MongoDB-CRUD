package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    private int empId;
    private String empName;
    private String empAddress;
    private long empContactNumber;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

}
