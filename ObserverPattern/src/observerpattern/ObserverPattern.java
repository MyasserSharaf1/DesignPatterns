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
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       User s1 = new User("Mohamed");
       User s2 = new User("Ahmed");
       User s3 = new User("Yasser");
      
      WebList wl = new WebList();
      wl.register(s3);
       wl.register(s2);
       wl.register(s1);
       wl.sale("50% offer");
       wl.unregister(s3);

       
    }
    
}
