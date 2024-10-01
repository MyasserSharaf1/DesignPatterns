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
public class LazySingleton {
    private static LazySingleton laszysingleton = null ;

    private LazySingleton() {
    }

    public static LazySingleton getEagersinglrton() {
        if(laszysingleton == null)
            laszysingleton = new LazySingleton() ;
            return laszysingleton;
        }
}
