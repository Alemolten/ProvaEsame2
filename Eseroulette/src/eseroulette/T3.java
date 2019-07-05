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
public class T3 extends Thread{
    DatiCondivisi d;
    
    public T3(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        d.waitSem2();
        ArrayList<Integer> array = d.getNumeriGenerati();
        int n = array.size();
        for(int i = 0; i < n; i++) {
            Object o = array.get(i);
            int num = Integer.parseInt(o.toString());
            if((num >= 13) && (num <= 24)) {
                int p = d.getLetti1324();
                p = p + 1;
                d.setLetti1324(p);
            }
        }
    }
}
