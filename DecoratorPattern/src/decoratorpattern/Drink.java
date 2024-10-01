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
//componenet
public abstract class Drink {
  double price;
  String discription;

    public double getPrice() {
        return price;
    }

    public String getDiscription() {
        return discription;
    }

   
}
