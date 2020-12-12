/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec5InternetAddresses;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author ar.poolian
 */
public class IPFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String host;
        Scanner input = new Scanner(System.in);
        InetAddress address;
        System.out.print("\n\nEnter host name: ");
        host = input.next();
        try {
            address = InetAddress.getByName(host);
            System.out.println("Ip address: " + address.toString());
        } catch (UnknownHostException uhEx) {
            System.out.println("could not find " + host);
        }
    }

}
