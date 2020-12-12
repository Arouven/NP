/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7Ex1;

import java.net.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author sting
 */
public class ClientServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("Waiting client to send request...");
            ServerSocket ss = new ServerSocket(6666); //create server socket
            System.out.println("Server Socket Created" + ss + "\n");
            Socket s = ss.accept();//establishes connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println("Cannot open socket" + e);
            System.exit(1);
        }

    }

}
