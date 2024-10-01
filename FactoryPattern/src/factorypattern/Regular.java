/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author xps
 */
public class Regular extends User  {

    public Regular() {
        
        name ="regular user";
     
    }

    @Override
    public void display() {
       System.out.println(" display Regular");
    }
    
}
