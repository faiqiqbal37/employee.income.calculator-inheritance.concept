/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;


import java.util.Scanner;
public class HourlyEmployee extends Employee {
  
    private double hourlyIncome;
    private int totalHours;
    Scanner input = new Scanner(System.in);

    public HourlyEmployee(String name, int empID, double hourlyIncome) {
        
        super(name, empID);
        this.hourlyIncome = hourlyIncome;
        
        System.out.println("Please Enter The Total Hours Of Employee: ");
        totalHours = input.nextInt();
    }
    
    public double calculate_the_hourly_income(){
        double totalIncome = totalHours * hourlyIncome;
        return totalIncome;
    }
    
    
    public String toString(){
       
        return super.toString() + "\n" + "This month salary = " + totalHours + "* " + hourlyIncome + "= " + calculate_the_hourly_income();  
    }
    
    
    
  
        
        
    
    
}
