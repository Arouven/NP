/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec3Stream;

import java.io.FileInputStream;

/**
 *
 * @author ar.poolian
 */
public class  FileInputStreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Test 1 ");
        try {
            FileInputStream myInput = new FileInputStream("C://Users/ar.poolian/Documents/NetBeansProjects/NetworkProgramming/src/Lec3Stream/newfile.txt");
            System.out.println("Data in the file: ");
            // Reads the first byte
            int i = myInput.read();
            System.out.println(i);
            // int i = 0;
            while (i != -1) {
                System.out.print((char) i);
                // Reads next byte from the file
                i = myInput.read();
            }
            myInput.close();
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Test 2 ");
        }

    }    
}
