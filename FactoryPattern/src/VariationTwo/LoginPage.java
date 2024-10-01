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
public abstract class LoginPage {
   public abstract User CreateUser();
   
    
    public User loginUaser (String type ){
        
        User u = null;
        u.display();
        
        return u ;
    }
}
