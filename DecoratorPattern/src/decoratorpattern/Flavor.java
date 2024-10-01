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
public abstract class Flavor extends Drink {
    Drink dr ;

    public Flavor(Drink dr) {
        this.dr = dr;
    }
    
}
