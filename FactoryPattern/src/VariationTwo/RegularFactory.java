/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariationTwo;

/**
 *
 * @author xps
 */
public class RegularFactory extends LoginPage {

    @Override
    public User CreateUser() {
       return new Regular();
    }
}
