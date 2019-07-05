/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eseroulette;
import java.util.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alessandro
 */
public class Eseroulette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi d = new DatiCondivisi();
        T1 t1 = new T1(d);
        T2 t2 = new T2(d);
        T3 t3 = new T3(d);
        T4 t4 = new T4(d);
        T5 t5 = new T5(d);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di valori da generare");
        int n = input.nextInt();
        while(n == 0) {
            System.out.println("Inserire il numero di valori da generare");
            n = input.nextInt();
        }
        
        if(n != 0) {
            d.setNumeriGenerare(n);
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            try {
                t1.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Eseroulette.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                t2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Eseroulette.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                t3.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Eseroulette.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                t4.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Eseroulette.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                t5.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Eseroulette.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Il numero zero letti " + d.getLetti0());
        }
    }
    
}
