/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author xps
 */
public class Caramel extends Flavor {
    
    public Caramel(Drink dr) {
        super(dr);
    }
       public double getPrice() {
        return dr.getPrice() + 5.0;
    }

    public String getDiscription() {
        return dr.getDiscription() + " , caramel";
    }
}
