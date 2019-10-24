/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GARCIA;

/**
 *
 * @author Chit
 */
import java.util.Scanner;

public class PLANET_AGE {
   public static void main(String[]args){
   }
   static {
        int seconds;
        double earthdays, earthyears;
        
       Scanner myObj = new Scanner(System.in);
       System.out.println("Pleas Enter Your Age In Seconds? ");
       seconds = myObj.nextInt();
       
       earthdays = seconds/86400.0;
       earthyears = earthdays/365.25;
       
       System.out.println("Earth Age= " + earthyears + " earth years");
       System.out.println("Mercury Age= " + earthyears*0.2408486 + " earth years");
       System.out.println("Venus Age= " + earthyears*0.61519726 + " earth years");
       System.out.println("Mars Age= " + earthyears*1.8808158 + " earth years");
       System.out.println("Jupiter Age= " + earthyears*11.862615 + " earth years");
       System.out.println("Staturn Age= " + earthyears*29.447498 + " earth years");
       System.out.println("Uranus Age= " + earthyears*84.016846 + " earth years");
       System.out.println("Neptune Age= " + earthyears*164.79132 + " earth years");
        
    }

}








    


