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
public class User {
   String userName;
   String pohne;
   String password;

    public User(String userName, String pohne, String password) {
        this.userName = userName;
        this.pohne = pohne;
        this.password = password;
    }
    
    public String getUserName() {
        return userName;
    }

    public String getPohne() {
        return pohne;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPohne(String pohne) {
        this.pohne = pohne;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
}
