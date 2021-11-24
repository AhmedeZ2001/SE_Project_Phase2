/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 20190327-20190589-20190047-20190771
 */
package se;

/**
 *
 * @author Ahmed Abdelnaser
 */
public class SE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        driver d = new driver ("20148418", "lic2", "omar", "0109629", "123456", 4.3);
        driver d1 = new driver ("34334", "lic3", "ahmed", "011554", "3223", 1.3);
        driver d2 = new driver ("3232", "lic3", "noooooour", "012548", "233", 2.3);  
        client c = new client ("reko", "0158418", "password");
         client c1 = new client ("heh", "2324", "2222");
        d.Register();d1.Register();d2.Register();
        c.Register();
        
        d.addFavArea("elshobak");
        d1.addFavArea("elshobak");
        d2.addFavArea("elshobak");
       // c.request("elshobak", "giza");
        Admin.getInstance().suspend(c);   
      //  c.request("elshobak", "giza");
      
        c.giveRate(1, d);
        c1.giveRate(4, d);
            
 
         d.getAvgRate();
         
         System.out.println (d.rating_List);
         
    }
    
}
