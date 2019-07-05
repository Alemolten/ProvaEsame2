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
public class T1 extends Thread{
    DatiCondivisi d;
    
    public T1(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        Random r = new Random();
        int n = d.getNumeriGenerare();
        ArrayList<Integer> array = d.getNumeriGenerati();
        for(int i = 0; i < n; i++) {
            int nRandom = r.nextInt(36);
            array.add(nRandom);
            if((nRandom >= 1) && (nRandom <= 12)) {
                int p = d.getInseriti112();
                p = p + 1;
                d.setInseriti112(p);
            }
            if((nRandom >= 13) && (nRandom <= 24)) {
                int p = d.getInseriti1324();
                p = p + 1;
                d.setInseriti1324(p);
            }
            if((nRandom >= 25) && (nRandom <= 36)) {
                int p = d.getInseriti2536();
                p = p + 1;
                d.setInseriti2536(p);
            }
        }
        d.setNumeriGenerati(array);
        d.signalSem1();
        d.signalSem2();
        d.signalSem3();
        d.signalSem4();
    }
}
