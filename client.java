/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

/**
 * @author Ahmed Abdelnaser
 * @author Omar Abdallah 20190771
 * @author Abdallah Mohamed 20190327
 * @author Nour Hosny 20190589
 */
public class client extends User implements Register, Login {

    public client(String userName, String pohne, String password) {
        super(userName, pohne, password);

    }

    public boolean hasRight() {
        for (int i = 0; i < dataBase.getInstance().clients_List.size(); i++) {
            if (dataBase.getInstance().clients_List.get(i).equals(this)) {
                return true;
            }
        }
        return false;
    }

    public void request(String src, String des) {
        if (this.hasRight()) {
            ride r = new ride(src, des);
            dataBase.getInstance().clients_List.remove(this);
        } else {
            System.out.println("You're suspended or not registered");
        }
    }

    @Override
    public boolean Register() {
        for (int i = 0; i < dataBase.getInstance().clients_List.size(); i++) {
            if (dataBase.getInstance().clients_List.get(i).userName.equals(this.userName)) {
                System.out.println("username is taken");
                return false;
            }
        }
        dataBase.getInstance().clients_List.add(this);
        System.out.println("Client Registered Successfully");
        return true;
    }

    @Override
    public User login(String name, String pass) {

        if (Admin.getInstance().validateDetiles(name, pass)) {
            System.out.println("Client Login Successfully");
            return this;
        } else {
            return null;
        }

    }

    public void giveRate(int r, String driverName) 
    {
        if (this.hasRight())
        {
            Rate rate = new Rate(r, driverName, this);
        }
        else
            System.out.println("You'r not registered");
    }

}
