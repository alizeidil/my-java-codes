/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socialmedia;

/**
 *
 * @author alizeidillazyuksel
 */

import java.util.*;

public class SocialMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date birthday = new Date();
        User u1 = new User("Dolce" , "ldld" , birthday , "valerie@gmail.com" , "dwdwffs");
        System.out.println(u1.getName());
        User u2 = new User("Lani" , "" , birthday , "hardtimes@gmail.com" , "dwdwffs");
        
        u1.AddFollower(u2); //u2 follows u1
        System.out.println(u2.getName() + " has followed " + u1.getName());
        u2.follow(u1); //u1 follows u2 back
        System.out.println(u1.getName() + " has followed " + u2.getName());
        
        
        u1.sendMessage("Bu bir mesajdir." , u2);
        u2.sendMessage("GOTCHA", u1);
        u1.showMessagefromOutbox(0);
        u2.showMessagefromInbox(0);
        u2.showMessagefromOutbox(0);
        u1.showMessagefromInbox(0);
    }
    
    
}
