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
public class driver extends User implements Register, Login {
     HashMap<String, Integer> rating_List = new HashMap<>();
    String Id;
    String license;
    //ride r;
    double avgRate = 0;
    int sumRate = 0;
    dataBase MyDB;
    public driver(String natinalId, String license, String userName, String pohne, String password, double avgRate) {
        super(userName, pohne, password);
        this.Id =Id;
        this.license = license;
        this.avgRate=avgRate;
        //dataBase.getInstance().drivers_List.add(this);
    }
   
 public void addFavArea(String d){
    dataBase.getInstance().favArea_List.add(d);
  //  dataBase.getInstance().DriversWithFav.add(this);
   }

    
   public void update() {
       int offer; 
      System.out.println("Hey " + this.getUserName() + " a client has requested a trip in your fav area");
      System.out.println("Enter your offer"); 
      Scanner n = new Scanner(System.in);
      offer = n.nextInt();
      System.out.println(  "Here's your offer \n" + "\n price: " + offer + "\n Name: " + this.getUserName() + "\n Ph: " + this.getPohne()); 
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

    @Override
    public boolean Register() {
        for(int i=0 ; i<dataBase.getInstance().drivers_List.size();i++){
            if(dataBase.getInstance().drivers_List.get(i).userName.equals(this.userName) ){
                System.out.println("username is taken");
                return false ;
        }
        }
        dataBase.getInstance().pendingDrivers.add(this);
        Admin.getInstance().verify(this);
        return true;
    }

    @Override
    public User login(String name, String pass) {


        if (Admin.getInstance().validateDetiles(name, pass))
             {
                 return this;
             }
        else
             return null;    }

    
    public void setAvg(double avgRat)
    {
        this.avgRate = avgRate + avgRat;
    }
    
    public void getAvgRate()
    {
         rating_List.forEach((r, k) ->
         {
             sumRate += rating_List.get(r);    
         });
         
         avgRate = ((double) sumRate) / rating_List.size();
         System.out.println("avgRate: " + avgRate);
    }
}