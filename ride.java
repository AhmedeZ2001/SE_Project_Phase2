/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

public class ride {

  private String source;
   private String destination;
   dataBase MyDB;
   

    public ride(String source, String destination) {
        this.source = source;
        this.destination = destination;
        
        notifyDriver();
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
  
   public void notifyDriver(){
       for (int i=0 ; i< dataBase.getInstance().drivers_List.size() ;i++) {
           if(dataBase.getInstance().favArea_List.get(i).equals(this.source))
               dataBase.getInstance().drivers_List.get(i).update(); 
       }
       }
   }