
package firm;

import java.util.*;

/**
 *
 * @author Tad Kane
 */
public class Staff {
    
    //--------------------------------------------------------------
    //Sets up a list/array of staff members
    //--------------------------------------------------------------
    private StaffMember[] staffList;  //This is a state variable declaration.
    
    public Staff()  //This is your constructor.
    {
        staffList = new StaffMember[6];         //This setting the size of the state variable arraylist.  assume 6 employees
        
        staffList[0] = new Executive ("Elliot", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee ("Dr. Kelso", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee ("Turk", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly ("Dr. Cox", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer ("J.D.", "987 Suds //.", "555-8374");
        staffList[5] = new Volunteer ("Carla", "321 Duds Lane", "555-7282");
        
        //The objects above were created in the StaffMember class. 
        //Employee is a child of StaffMember
        //Volunteer, Executive, and Hourly are all children of Employee 
        //Normally, if an object is declared this way:  Parent reference = new Child(),then
        //the object can only use the Parent methods.  As you can see the objects above are
        //declared this way:  Parent staffList[_] = new Child(" ", " ", et.c).  So normally, these
        //objects wouldn't be able to use the Child methods. But you can access the Child methods for
        //these objects by CASTING the object as the Child Class:
        //in order to invoke the methods 
        ((Executive)staffList[0]).awardBonus (500.0);    //casted as an Executive, so object uses the child method .awardBonus(x);
        ((Hourly)staffList[3]).addHours (40);           //casted as an Hourly, so object can use the child method .addHours(x);
    }
        //--------------------------------------------------------
        //Pays all staff members.
        //--------------------------------------------------------
    public void payday()
    {
        double amount;
        for(int count = 0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);
                
            amount = staffList[count].pay(); //polymorphic because the pay() method
                                                 //will be dependent on which type of object in the staffList[] array
            if(amount == 0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: $" + amount);
                
                System.out.println("----------------------------------------------------------");
        }
    }                                      
}
