package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.bridgelabz.EmployeePayrollService.IOService.FILE_IO;

public class EmployeePayrollServiceTest {

    @Test
    public void given3EmployeeWhenWrittenToFile_shouldMatchEmployeeEntries(){
        EmployeePayroll [] employeePayroll = {
                new EmployeePayroll(101,"Akshar",15000.00),
                new EmployeePayroll(102,"Yogesh",18000.00),
                new EmployeePayroll(103,"Swati",20000.00),
                new EmployeePayroll(104,"Kalyani",25000.00)
        };

        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(employeePayroll));
        employeePayrollService.writeEmployeePayrollData(FILE_IO);
        long entries = employeePayrollService.countEntries(FILE_IO);
        Assertions.assertEquals(4,entries);
    }

}
