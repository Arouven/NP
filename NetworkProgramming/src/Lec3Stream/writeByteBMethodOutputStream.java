/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec3Stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author ar.poolian
 */
public class writeByteBMethodOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String data = "This is a line of text inside the file.";
        try {
            OutputStream out = new FileOutputStream("C://Users/ar.poolian/Documents/NetBeansProjects/NetworkProgramming/src/Lec3Stream/output.txt");
            // path is C:\Users\User\Documents\NetBeansProjects\myOutputStream
            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();
            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");
            // Closes the output stream
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
