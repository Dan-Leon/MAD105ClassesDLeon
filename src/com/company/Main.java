package com.company;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Sylvanis", "Windrunner", 3, "555-7734");
        Employee emp2 = new Employee(2, "Jenny", "NoobGamer", 1, "867-5309");
        Employee emp3 = new Employee(3, "Leroy", "Jenkins", 2, "468-7963");  // Phone:Got-PWND

        emp1.printAll();
        System.out.println("\n");
        emp2.printAll();
        System.out.println("\n");
        emp3.printAll();
    }
}
