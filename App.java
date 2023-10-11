/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/**
 *
 * @author Ваня
 */
public class App {
    static final int PORT=80;
    static final int TIMEOUT=2500;
    static final String HOST_NAME="www.kst.tugab.bg";
    public static void main(String[] args) throws IOException {
        InetAddress ip;
        try{
            ip=InetAddress.getByName(HOST_NAME);
        }catch(UnknownHostException ex){
            System.out.println("Nerazpoznato ime na host!");
            return;
        }
        Socket socket=new Socket();
        try{
            socket.connect(new InetSocketAddress(ip, PORT),TIMEOUT);
            System.out.println("Port "+PORT+" e otvoren.");
        }catch(SocketTimeoutException ex){
            System.out.println("Servera ne otgovarq!");
        }catch(IOException ioe){
            System.out.println("Port "+PORT+" e zatvoren.");
        }
    }
}
