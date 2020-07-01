/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee("Umair Ameen", 03, 500);
        PermanentEmployee emp2 = new PermanentEmployee("Usman Asif", 01, 1000);
        
        emp1.calculate_the_hourly_income();
        emp2.calculate_the_income();
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        
     
    }
    
}
