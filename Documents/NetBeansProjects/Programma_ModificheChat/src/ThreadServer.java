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
public class ThreadServer extends Thread{
    
    ServerClasse server1;
    ClientClasse client1;

    public ThreadServer(ServerClasse server1, ClientClasse client1) {
        this.server1 = server1;
        this.client1 = client1;
    }
    
    @Override
    public void run(){
        client1.getUsername();
        //server1.iniziaAscolto();  
        
        /*while(server1.connessioneAperta()==true){
            server1.riceviMessaggiDalClient();
            server1.mandaMessaggiAlClient();
            server1.riceviMessaggiDalClient();*/
        //}
        
        while(server1.isOnline()==true){
            server1.riceviMessaggiDalClient(client1);
        }
        
    }
    
} 