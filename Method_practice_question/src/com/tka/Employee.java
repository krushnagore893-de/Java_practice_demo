
package com.tka;

public class Employee {

    public double calculateSalary(double basic) {

        double hra = basic * 20 / 100;
        double da = basic * 10 / 100;

        double finalSalary = basic + hra + da;

        return finalSalary;
    }
}
