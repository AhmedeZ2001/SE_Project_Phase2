/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Ahmed Abdelnaser
 */
public class dataBase {
    private static dataBase MyDB=null;
    ArrayList<client> clients_List=new ArrayList<>();
    ArrayList<driver> drivers_List=new ArrayList<>();
    ArrayList<driver> pendingDrivers=new ArrayList<>();
    ArrayList<User> SusspendedList = new ArrayList<>();
        
    ArrayList<String> favArea_List=new ArrayList<>();
   
    private dataBase(){};
     public static dataBase getInstance ()
    {
        if (MyDB == null)
            MyDB = new dataBase ();
        return MyDB;
    }
     
}
