/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariationThree;

/**
 *
 * @author xps
 */
public class main {
    public static void main(String[] args) {
    
        AbstractUIFactory windows = new WindowsFactory();
        Botton b = windows.CreateBotton();
        b.Click();
        Checkbox cb = windows.CreateCheckbox();
        cb.Click();
        
        System.out.println("\n");
        AbstractUIFactory mac = new MacFactory();
        Botton b2 = mac.CreateBotton();
        b.Click();
        Checkbox cb2 = mac.CreateCheckbox();
        cb.Click();
    }
}
