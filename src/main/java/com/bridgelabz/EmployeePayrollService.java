package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    static Scanner input = new Scanner(System.in);

    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_IO}

    private static List<EmployeePayroll> employeePayrollList;

    public EmployeePayrollService(){

    }

    public EmployeePayrollService(List<EmployeePayroll> employeePayrollList){
        EmployeePayrollService.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Payroll Service.");
        ArrayList<EmployeePayroll> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        employeePayrollService.readEmployeePayrollData();
        employeePayrollService.writeEmployeePayrollData();

    }

    private void readEmployeePayrollData(){
        System.out.println("Enter Employee ID: ");
        int id = input.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = input.next();
        System.out.println("Enter Employee Salary: ");
        double salary = input.nextDouble();
        employeePayrollList.add(new EmployeePayroll(id,name,salary));
    }

    private void writeEmployeePayrollData(){
        System.out.println("\n Writing Employee Payroll to Console\n "+ employeePayrollList);
    }
}
