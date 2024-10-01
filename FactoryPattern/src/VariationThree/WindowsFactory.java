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
public class WindowsFactory extends AbstractUIFactory {

    @Override
    public Botton CreateBotton() {
        return new WindowsBotton();
    }

    @Override
    public Checkbox CreateCheckbox() {
        return new WindowsCheckbox();
    }
    
}
