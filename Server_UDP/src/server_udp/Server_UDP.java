/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_multithread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tattr
 */
public class Server_UDP {

    /**
     * @param args the command line arguments
     */
    int id = 1;
    
    public static void main(String[] args) {
            // TODO code application logic here
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        Runnable worker = new MyRunner(id);
        executor.execute(worker);
        
    }
    
}
