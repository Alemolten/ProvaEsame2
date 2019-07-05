/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eseconfezionatore;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alessandro
 */
public class T1 extends Thread{
    DatiCondivisi d;
    Random r = new Random();
    
    public T1(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        d.waitSem1();
        System.out.println("INIZIO TRASPORTO pacco 1");
        int attesa = r.nextInt(1000) + 1000;
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException ex) {
            Logger.getLogger(T1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("FINE TRASPORTO pacco 1");
        d.signalSem2();
    }
}
