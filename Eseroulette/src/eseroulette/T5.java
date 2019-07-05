/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eseroulette;
import java.util.*;

/**
 *
 * @author Alessandro
 */
public class T5 extends Thread{
    DatiCondivisi d;
    
    public T5(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        d.waitSem4();
        System.out.println("Numeri inseriti da 1 a 12 " + d.getInseriti112());
        System.out.println("Numeri inseriti da 13 a 24 " + d.getInseriti1324());
        System.out.println("Numeri inseriti da 25 a 36 " + d.getInseriti2536());
        System.out.println("Numeri letti da 1 a 12 " + d.getLetti112());
        System.out.println("Numeri letti da 13 a 24 " + d.getLetti1324());
        System.out.println("Numeri letti da 25 a 36 " + d.getLetti2536());
        
        /*
        ArrayList<Integer> array = d.getNumeriGenerati();
        int l = array.size();
        for(int i = 0; i < l; i++) {
            Object o = array.get(i);
            int po = Integer.parseInt(o.toString());
            System.out.println(po);
        }
        */
    }
}
