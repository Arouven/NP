/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable_interface;

/**
 *
 * @author Oracle
 */
public class MyClass implements Runnable {
    @Override
    public void run(){
        System.out.println("this is using runnable interface");
    }
}
