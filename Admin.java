
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omarb
 */
public class Admin extends User {
    
    private static Admin admin = null;
    
    ArrayList<Clint> clints_list = new ArrayList<Clint>;
    ArrayList<Driver> drivers_list = new ArrayList<Driver>;
    ArrayList<Driver> pindingDrivers = new ArrayList<Driver>;
    
    
    private Admin(String user_name, String pass)
    {
        username = user_name;
        password = pass;
    }
    
    public static Admin getInstance ()
    {
        if (admin == null)
            admin = new Admin ("Omar", "123456789");
        return admin;
    }
    
    
    public void verify (Driver driver)
    {
        if (driver.getLincees())
            System.out.println("You have been added!!"); ///*****////
        else
            System.out.println("Failed!! Wrong lincees");
    }
    
    public void suspend (Users user)
    {
        if (user.getType == "driver")
        {
            for (int i = 0; i < drivers_list.size(); i++)
            {
                if (user.username == drivers_list.get(i)) ///*****////
                    drivers_list.remove(i);
            }
        }
        else 
        {
            for (int i = 0; i < clints_list.size(); i++)
            {
                if (user.username == clints_list.get(i))
                {   clints_list.remove(i);
                    System.out.println("User has been removed");
                }   
            }
             System.out.println("User not found");
        }
    }
    
    public Boolean validateDetiles(String userName, String pass)
    {
         for (int i = 0; i < drivers_list.size(); i++)
            {
                if (userName == drivers_list.get(i).username) 
                {
                    if (pass == drivers_list.get(i).password)
                        return true;
                    else
                    { 
                        System.out.println("wrong password");  
                        return false;
                    }
                }
            }
        
         for (int i = 0; i < clints_list.size(); i++)
         {
             if (userName == clints_list.get(i).username) 
                {
                    if (pass == clints_list.get(i).password)
                        return true;
                    else
                    { 
                        System.out.println("wrong password");  
                        return false;
                    }
                }
         }
         System.out.println("User not found");  
         return false;
    }
}
