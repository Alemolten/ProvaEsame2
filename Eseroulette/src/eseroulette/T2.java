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
public class T2 extends Thread{
    DatiCondivisi d;
    
    public T2(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        d.waitSem1();
        ArrayList<Integer> array = d.getNumeriGenerati();
        int n = array.size();
        for(int i = 0; i < n; i++) {
            Object o = array.get(i);
            int num = Integer.parseInt(o.toString());
            if((num >= 1) && (num <= 12)) {
                int p = d.getLetti112();
                p = p + 1;
                d.setLetti112(p);
            }
            if(num == 0) {
                int p = d.getLetti0();
                p = p + 1;
                d.setLetti0(p);
            }
        }
    }
}
