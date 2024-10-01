package VariationThree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xps
 */
public class MacFactory extends AbstractUIFactory {

    @Override
    public Botton CreateBotton() {
        return new MacBotton();
    }

    @Override
    public Checkbox CreateCheckbox() {
        return new MacCheckbox();
    }
    
}
