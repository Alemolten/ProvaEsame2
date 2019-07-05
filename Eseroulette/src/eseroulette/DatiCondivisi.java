/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eseroulette;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alessandro
 */
public class DatiCondivisi {
    private ArrayList<Integer> numeriGenerati;
    private int inseriti112;
    private int inseriti1324;
    private int inseriti2536;
    private int numeriGenerare;
    private int letti112;
    private int letti1324;
    private int letti2536;
    private int letti0;
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;
    
    public DatiCondivisi() {
        this.numeriGenerati = new ArrayList<Integer>();
        this.inseriti112 = 0;
        this.inseriti1324 = 0;
        this.inseriti2536 = 0;
        this.numeriGenerare = 0;
        this.letti112 = 0;
        this.letti1324 = 0;
        this.letti2536 = 0;
        this.letti0 = 0;
        this.sem1 = new Semaphore(0);
        this.sem2 = new Semaphore(0);
        this.sem3 = new Semaphore(0);
        this.sem4 = new Semaphore(0);
    }

    public ArrayList<Integer> getNumeriGenerati() {
        return numeriGenerati;
    }

    public int getInseriti112() {
        return inseriti112;
    }

    public int getInseriti1324() {
        return inseriti1324;
    }

    public int getInseriti2536() {
        return inseriti2536;
    }

    public void setNumeriGenerati(ArrayList<Integer> numeriGenerati) {
        this.numeriGenerati = numeriGenerati;
    }

    public void setInseriti112(int inseriti112) {
        this.inseriti112 = inseriti112;
    }

    public void setInseriti1324(int inseriti1324) {
        this.inseriti1324 = inseriti1324;
    }

    public void setInseriti2536(int inseriti2536) {
        this.inseriti2536 = inseriti2536;
    }

    public int getNumeriGenerare() {
        return numeriGenerare;
    }

    public void setNumeriGenerare(int numeriGenerare) {
        this.numeriGenerare = numeriGenerare;
    }

    public int getLetti112() {
        return letti112;
    }

    public int getLetti1324() {
        return letti1324;
    }

    public int getLetti2536() {
        return letti2536;
    }

    public void setLetti112(int letti112) {
        this.letti112 = letti112;
    }

    public void setLetti1324(int letti1324) {
        this.letti1324 = letti1324;
    }

    public void setLetti2536(int letti2536) {
        this.letti2536 = letti2536;
    }

    public int getLetti0() {
        return letti0;
    }

    public void setLetti0(int letti0) {
        this.letti0 = letti0;
    }
    
    public void waitSem1() {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitSem2() {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitSem3() {
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitSem4() {
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void signalSem1() {
        sem1.release();
    }
    
    public void signalSem2() {
        sem2.release();
    }
    
    public void signalSem3() {
        sem3.release();
    }
    
    public void signalSem4() {
        sem4.release();
    }
}
