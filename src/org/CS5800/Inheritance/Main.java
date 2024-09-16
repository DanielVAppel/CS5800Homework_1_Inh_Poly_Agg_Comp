package org.CS5800.Inheritance;

// Base Employee Class
class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getter and Setter methods
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public void setSocialSecurityNumber(String socialSecurityNumber) { this.socialSecurityNumber = socialSecurityNumber; }
}

// Salaried Employee Class
class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    // Getter and Setter methods
    public double getWeeklySalary() { return weeklySalary; }
    public void setWeeklySalary(double weeklySalary) { this.weeklySalary = weeklySalary; }
}

// Hourly Employee Class
class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // Getter and Setter methods
    public double getWage() { return wage; }
    public void setWage(double wage) { this.wage = wage; }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }
}

// Commission Employee Class
class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    // Constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // Getter and Setter methods
    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }

    public double getGrossSales() { return grossSales; }
    public void setGrossSales(double grossSales) { this.grossSales = grossSales; }
}

// Base Employee Class
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    // Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }

    // Getter and Setter methods
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}