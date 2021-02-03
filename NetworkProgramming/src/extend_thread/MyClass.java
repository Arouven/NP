/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extend_thread;

/**
 *
 * @author Oracle
 */
public class MyClass extends Thread{
    @Override
    public void run(){
        System.out.println("myclass running");
    }
}
