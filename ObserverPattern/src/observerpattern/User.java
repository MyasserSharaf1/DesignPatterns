/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author xps
 */
public class User implements Observer {

    String name;

    public User(String name) {
        this.name = name;
    }
    
    @Override
    public void Update(String msg) {
        System.out.println(name + " " + msg);
    }
    
}
