package com.company;

public class Employee {

    private int employeeID;
    private String firstName;
    private String lastName;
    private int empShift;
    private String cellPhone;

    public Employee(int employeeID, String firstName, String lastName, int empShift, String cellPhone) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.empShift = empShift;
        this.cellPhone = cellPhone;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpShift() {
        return empShift;
    }

    public void setEmpShift(int empShift) {
        this.empShift = empShift;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void printAll(){
        System.out.println("ID:\t\t" + employeeID + "\nName:\t" + firstName + " " + lastName + "\nPhone:\t" + cellPhone + "\nShift:\t" + empShift);
    }

}
