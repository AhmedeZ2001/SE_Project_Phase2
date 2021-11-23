/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

/**
 *
 * @author Ahmed Abdelnaser
 */
public class client extends User{

    public client(String userName, String pohne, String password) {
        super(userName, pohne, password);
    }
    
    public void request (String src, String des)
    {
        ride r = new ride (src, des);
        
    }
    
}