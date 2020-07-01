/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

public class PermanentEmployee extends Employee {

    private double hourlyIncome;
    
    public PermanentEmployee(String name, int empID, double hourlyIncome){
        super(name, empID);
        this.hourlyIncome  = hourlyIncome;
        
    }
    
    public double calculate_the_income(){
        double income;
        income = 180 * hourlyIncome;
        return income;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + String.format("This month salary @ %f PKR/Hour = %f", hourlyIncome, calculate_the_income());
    }
    
    
    
}
