/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariationTwo;

/**
 *
 * @author xps
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        LoginPage login = new RegularFactory();
           
        User u1 = login.CreateUser();
        u1.display();
        
        LoginPage login2 = new adminFactory();
           
        User u2 = login2.CreateUser();
        u2.display();
        
    }
}
