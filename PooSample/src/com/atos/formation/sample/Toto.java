/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.formation.sample;

import java.util.Scanner;

/**
 *
 * @author formation
 */
public class Toto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String st = sc.nextLine();
        
        
        switch(st){
            case "zer":
                System.out.println("pas d'arguments");
                break;
            case "1":
                System.out.println("un argument " + args[0]);
                break;
            default:
                System.out.println("les arguments " );
                
                for (String arg : args) {
                    System.out.println("- " + arg);
                }
         
        }
        
    }
}
