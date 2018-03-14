/*
+ * To change this license header, choose License Headers in Project Properties.
+ * To change this template file, choose Tools | Templates
+ * and open the template in the editor.
+ */

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.util.Scanner;

/**
+ *
+ * @author Lorenzo Pisanò
+ * 
+ */
public class Client{
    /**
+     * @param args the command line arguments
+     */
    public static void main(String[] args){
        GestioneMessaggio g = new GestioneMessaggio();
        
        ServerClasse server1 = new ServerClasse(2000, g);
        
        ClientClasse client1 = new ClientClasse(2000,"localhost", g);
        ThreadClient tc = new ThreadClient(client1, server1);
        
        client1.connessioneAlServer();
        tc.start();
       
        
        while(client1.isOnline()==true)
        {
            client1.inviaMessaggioAlServer();
        }
       
    }
} 