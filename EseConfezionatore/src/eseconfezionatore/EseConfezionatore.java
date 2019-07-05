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
public class EseConfezionatore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi d = new DatiCondivisi();
        C1 c1 = new C1(d);
        C2 c2 = new C2(d);
        T1 t1 = new T1(d);
        T2 t2 = new T2(d);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire la lettera S per far paritire i confezionatori");
        String lettera = input.next();
        
        while(!lettera.equals("S")) {
            System.out.println("Inserire la lettera S per far partire i confezionatori");
            lettera = input.next();
        }
        
        if(lettera.equals("S")) {
            c1.start();
            c2.start();
            t1.start();
            t2.start();
            try {
                c1.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(EseConfezionatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                c2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(EseConfezionatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                t1.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(EseConfezionatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                t2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(EseConfezionatore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("FINE TRASPORTO");
    }
    
}