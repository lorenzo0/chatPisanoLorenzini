/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorenzo Pisanò
 */
public class ThreadClient extends Thread{
    
    ClientClasse client1;
    ServerClasse server1;

    public ThreadClient(ClientClasse client1, ServerClasse server1) {
        this.client1 = client1;
        this.server1 = server1;
    }
    
    @Override
    public void run(){
        server1.getUsername();
        //client1.connessioneAlServer();
        
      /*while(client1.connessioneAperta()==true){
           client1.ricevoMessaggioDalServer();
           client1.inviaMessaggioAlServer();
      }*/
      
        while(client1.isOnline()==true)
        {
           client1.ricevoMessaggioDalServer(server1);
        }
        
    }
} 
