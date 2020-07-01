/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;



public class Employee {
    public String name;
    public int empID;
    
    public Employee(String name, int empID){
        this.name = name;
        this.empID = empID;
        
    }
    
    @Override
    public String toString(){
        return String.format("%s ID: %d ",name, empID);
    }
    
}
