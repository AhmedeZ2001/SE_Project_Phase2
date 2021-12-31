/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ahmed Abdelnaser
 */

public class driver extends User implements Register, Login 
{
    HashMap<String, Integer> rating_List = new HashMap<>();
    String Id;
    String license;
    float avgRate = 0;
    int sumRate = 0;

    
    public driver(String natinalId, String license, String userName, String pohne, String password) 
    {
        super(userName, pohne, password);
        this.Id =Id;
        this.license = license;  
    }
   
 public void addFavArea(String d)
 {
    dataBase.getInstance().favArea_List.add(d);

 }

    public String getId() {
        return Id;
    }
    public String getLincese() {
        return license;
    }
    public void setNatinalId(String natinalId) {
        this.Id = natinalId;
    }
    public void setLincese(String lincese) {
        this.license = lincese;
    }

        
   public void update()
   {
       int offer; 
      System.out.println("Hey " + this.getUserName() + " a client has requested a trip in your fav area");
      System.out.println("Enter your offer"); 
      Scanner n = new Scanner(System.in);
      offer = n.nextInt();
      System.out.println(  "Here's your offer \n" + "\n price: " + offer + "\n Name: " + this.getUserName() + "\n Ph: " + this.getPohne()); 
   }
   
    @Override
    public boolean Register()  //// API
    {
        for(int i=0 ; i<dataBase.getInstance().drivers_List.size();i++)
        {
            if(dataBase.getInstance().drivers_List.get(i).userName.equals(this.userName))
            {
                System.out.println("username is taken");
                return false ;
            }
        }
        
        dataBase.getInstance().pendingDrivers.add(this);
        Admin.getInstance().verify(this);
        return true;
    }

    @Override
    public User login(String name, String pass)
    {
        if (Admin.getInstance().validateDetiles(name, pass))
                 return this;
        else
             return null;    
    }

    
    
    public void setAvg(float avg_rate)
    {
        this.avgRate = avg_rate; 
    }
    
    public void printRate()
    {
         for (String i : rating_List.keySet()) 
      System.out.println(i +" " + rating_List.get(i));
    
    }
    
     public float getAvgRate()
     {
         return avgRate;
     }
}