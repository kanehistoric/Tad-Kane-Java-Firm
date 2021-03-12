/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firm;

/**
 *
 * @author Tad Kane
 */
//abstract class - It does not represent a particular type of employee and is not
//meant to be instantitated. Rather it serves as the parent of all employee classes
//(Volunteer,  Employee, > Executive, > Hourly).
abstract public class StaffMember {
    
    private String name;
    private String address;
    private String phone;
    
    //--------------------------------------------------------------
    //  Sets up a staff member using the specified information
    //--------------------------------------------------------------
    public StaffMember (String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    
    //--------------------------------------------------------------
    //  Returns a string including the basic employee information
    //--------------------------------------------------------------
    public String toString()
    {
        String result = "Name: " + name + "\n";
        
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        
        return result;      
    }
    
    //--------------------------------------------------------------
    //  Derived classes must define the pay method for each type of employee
    //--------------------------------------------------------------
    public abstract double pay();   
    //make the classes that inherit StaffMember write the pay() method for their
    //particular needs.  In other words, each of the classes that extend
    //StaffMember will ahve their own version of pay() method.
    
    //The invocation of the pay method is POLYMORPHIC because each class has its
    //own version of the pay method.
                                
}
