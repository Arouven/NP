/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guru;

/**
 *
 * @author Oracle
 */
public class MyMain implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread gt1 = new Thread("Guru 1");
        Thread gt2 = new Thread("Guru 2");
        gt1.start();
        gt2.start();
        System.out.println("thread names are following:");
        System.out.println(gt1.getName());
        System.out.println(gt2.getName());
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
