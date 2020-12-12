/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec5InternetAddresses;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author ar.poolian
 */
public class FindOutIPAddressOfTheCurrentMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            InetAddress localAddr = InetAddress.getLocalHost();
            System.out.print("IP address: ");
            System.out.println(localAddr.getHostAddress());
            System.out.println(localAddr.getHostName());
        } catch (UnknownHostException uhe) {
            System.out.println("Unable to resolve localhost");
        }
    }

}
