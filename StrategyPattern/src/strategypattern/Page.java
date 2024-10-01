/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author xps
 */
public class Page {
    Sorting S ;

    public void setS(Sorting S) {
        this.S = S;
    }
    
    public void View (){
        
        S.Sort();
        
    }
}
