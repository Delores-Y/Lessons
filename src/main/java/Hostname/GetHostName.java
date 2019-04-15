package Hostname;
//package

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetHostName {

    public static void main(String[] args) {

        try {
            System.out.println(InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
