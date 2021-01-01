/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec3Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author ar.poolian
 */
public class writeIntBMethodOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            OutputStream os = new FileOutputStream("C://Users/ar.poolian/Documents/NetBeansProjects/NetworkProgramming/src/Lec3Stream/test.txt");
            InputStream is = new FileInputStream("C://Users/ar.poolian/Documents/NetBeansProjects/NetworkProgramming/src/Lec3Stream/test.txt");
            os.write(65);
            os.write(66);
            os.write(67);
            System.out.println(is.read());
            for (int i = 0; i < 3; i++) {
                System.out.print("" + (char) is.read());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
