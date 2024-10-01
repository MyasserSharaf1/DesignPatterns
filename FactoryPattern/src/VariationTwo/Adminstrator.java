/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariationTwo;

import factorypattern.*;

/**
 *
 * @author xps
 */
public class Adminstrator extends User {

    public Adminstrator() {
        
        name ="admin";
        
    }

    @Override
    public void display() {
       System.out.println(" display admin");
    }
    
}
