package org.CS5800.Inheritance;

// Driver Class
public class EmployeeTest {
    public static void main(String[] args) {
        // Create objects for each type of employee
        SalariedEmployee salariedEmployee = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        BasePlusCommissionEmployee baseEmployee = new BasePlusCommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000, 95000);

        // Output the details of each employee
        System.out.println("Salaried Employee: " + salariedEmployee.getFirstName() + " " + salariedEmployee.getLastName() + " - Salary: " + salariedEmployee.getWeeklySalary());
        System.out.println("Hourly Employee 1: " + hourlyEmployee1.getFirstName() + " " + hourlyEmployee1.getLastName() + " - Wage: " + hourlyEmployee1.getWage() + ", Hours worked: " + hourlyEmployee1.getHoursWorked());
        System.out.println("Hourly Employee 2: " + hourlyEmployee2.getFirstName() + " " + hourlyEmployee2.getLastName() + " - Wage: " + hourlyEmployee2.getWage() + ", Hours worked: " + hourlyEmployee2.getHoursWorked());
        System.out.println("Commission Employee: " + commissionEmployee.getFirstName() + " " + commissionEmployee.getLastName() + " - Commission Rate: " + commissionEmployee.getCommissionRate() + ", Gross Sales: " + commissionEmployee.getGrossSales());
        System.out.println("Base Plus Commission Employee: " + baseEmployee.getFirstName() + " " + baseEmployee.getLastName() + " - Base Salary: " + baseEmployee.getBaseSalary());
    }
}