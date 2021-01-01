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
public class ResolvesHostnamesToIPaddressesAndReverseLookupOfTheIPaddress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String host;
        System.out.println("Syntax: NetworkResolverDemo host");
        Scanner myInput = new Scanner(System.in);
        host = myInput.next();
        try {
            InetAddress addr = InetAddress.getByName(args[0]);
            System.out.print("IP address: ");
            System.out.println(addr.getHostAddress());
            System.out.print("Hostname: ");
            System.out.println(addr.getHostName());
        } catch (UnknownHostException uhe) {
            System.out.println("Unable to resolve hostname");
        }
    }
}

