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

        driver d = new driver("300201874562105", "lic1", "omar", "01109629", "pass1");
        driver d1 = new driver("301204865741851", "lic2", "ahmed", "01231554", "pass2");
        driver d2 = new driver("301040854884545", "lic3", "nour", "01255548", "pass3");
        driver d3 = new driver("301040854884545", "lic4", "rekoooooooo", "01255548", "pass4");

        client c1 = new client("Client1", "0158418", "password1");
        client c2 = new client("Client2", "0152324", "password2");
        client c3 = new client("Client3", "0152324", "password3");
        client c4 = new client("Client4", "0152324", "password3");

        d.Register();
        //d1.Register();
        d2.Register();
        d3.addFavArea("Giza");
        //d3.Register();

        c1.Register();
        c2.Register();
        c3.Register();
        c4.Register();

        d.addFavArea("Giza");
        d1.addFavArea("Giza");
        d2.addFavArea("Giza");

        //c1.request("Giza", "cairo");
        c1.giveRate(5, "omar");
        c2.giveRate(2, "omar");
        c3.giveRate(3, "omar");
        c4.giveRate(1, "Ahh");

        d.printRate();
        System.out.println("Avg Rate: " + d.getAvgRate());
    }

}
