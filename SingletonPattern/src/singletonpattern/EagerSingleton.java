/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author xps
 */

/*  */
public class EagerSingleton {

    private static EagerSingleton eagersinglrton ;
    private EagerSingleton() {
       
    }

    public static EagerSingleton getEagersinglrton() {
        return eagersinglrton;
    }
    
}
