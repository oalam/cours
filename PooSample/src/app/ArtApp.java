/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import arty.Actor;
import arty.Artist;
import arty.IBankable;
import arty.Impressario;
import arty.Movie;
import arty.Painter;
import arty.Singer;

/**
 *
 * @author formation
 */
public class ArtApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // love picasso
        Artist picasso = new Painter();
        picasso.makeArt();

        // create artist manager
        Impressario mike = new Impressario();
        IBankable brad = new Actor();
        IBankable mickael = new Singer();

        mike.bankable.add(brad);
        mike.bankable.add(mickael);
        mike.bankable.add(new Movie());
       // mike.bankable.add(picasso);


        // for classique
        for (int i = 0; i < mike.bankable.size(); i++) {
            IBankable tmp = mike.bankable.get(i);
            tmp.makeMoney();
        }

        // foreach
        for (IBankable ibnk : mike.bankable) {
            ibnk.makeMoney();
        }


    }
}
