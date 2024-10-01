/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author xps
 */
public class WebList implements Subject {
   
   ArrayList<Observer> list = new ArrayList();

    @Override
    public void register(Observer o) {
        
        list.add(o);
    }

    @Override
    public void unregister(Observer o) {
      int i=  list.indexOf(o);
      if(i>=0){
        list.remove(o);
    }
    
    }

    @Override
    public void notifyobserver(String msg) {
        
        for(Observer o : list){
            o.Update(msg);
        }
        
        
    }
   
   public void sale(String msg){
            
       notifyobserver( msg);
        }
    
}
