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
public class T4 extends Thread{
    DatiCondivisi d;
    
    public T4(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        d.waitSem3();
        ArrayList<Integer> array = d.getNumeriGenerati();
        int n = array.size();
        for(int i = 0; i < n; i++) {
            Object o = array.get(i);
            int num = Integer.parseInt(o.toString());
            if((num >= 25) && (num <= 36)) {
                int p = d.getLetti2536();
                p = p + 1;
                d.setLetti2536(p);
            }
        }
    }
}
