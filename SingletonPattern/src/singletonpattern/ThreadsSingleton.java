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
public class ThreadsSingleton {
      private volatile static ThreadsSingleton threadsingleton = null ;

    private ThreadsSingleton() {
    }
    
    public  static ThreadsSingleton getEagersinglrton() {
        if(threadsingleton == null)
            synchronized(ThreadsSingleton.class){
                   if(threadsingleton == null)
            threadsingleton = new ThreadsSingleton() ;
            }
            return threadsingleton;
        }
    
}
