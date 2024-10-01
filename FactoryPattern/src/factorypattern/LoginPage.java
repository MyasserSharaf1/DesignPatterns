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
public class LoginPage {
    Factory factory = new Factory();
    
    public User loginUaser (String type ){
        
        User u;
        u = factory.CreateUser(type);
        u.display();
        
        return u ;
    }
}
