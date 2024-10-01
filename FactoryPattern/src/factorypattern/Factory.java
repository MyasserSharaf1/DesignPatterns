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

public class Factory {
    //User user ;
    public User CreateUser (String type){
        if (type.equals("admin") )
            return new Adminstrator();
        
        else  if (type.equals("regular") )
            return new Regular();
        else 
            return null ;
    }
}
