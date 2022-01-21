package no.cheatsheet.lambda.SalaryApplication;

public class Employee {

    private String name;
    private String lastName;
    private GenderEnum genderEnum;
    private String employeeRole;
    private int salary;

    // Employee constructor
    public Employee(String name, String lastName, GenderEnum genderEnum, String employeeRole, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.genderEnum = genderEnum;
        this.employeeRole = employeeRole;
        this.salary = salary;
    }

    // Get/Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMale() {
        return genderEnum == GenderEnum.MALE;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public GenderEnum getGenderEnum(){
        return genderEnum;
    }

    public void setGenderEnum(GenderEnum genderEnum){
        this.genderEnum = genderEnum;
    }

    @Override
    public String toString() {
        return "Employee [Name = " + name
                + ", Lastname = " + lastName
                + ", Gender = " + genderEnum
                + ", Position = " + employeeRole
                + ", Salary = "+ salary + "]\n";
    }
}

