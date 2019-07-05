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
public class C2 extends Thread{
    DatiCondivisi d;
    Random r = new Random();
    
    public C2(DatiCondivisi d) {
        this.d = d;
    }
    
    @Override
    public void run() {
        d.waitSem4();
        System.out.println("INIZIO CONFEZIONE pacco 2");
        int attesa = r.nextInt(1000) + 1000;
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException ex) {
            Logger.getLogger(C2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("FINE CONFEZIONE pacco 2");
        d.signalSem3();
    }
}
