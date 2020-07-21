/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetransfer.filetransfer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Paths;
import javax.swing.DefaultListModel;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class SocketClass {
    private  Socket sock;
    private  DataOutputStream dout;
    private DataInputStream din;
    private ServerSocket serverSocket;
    
  
   
    
    public void clientSocket(String ipaddress,int port,List<File> filelist,DefaultListModel<String> dlm){
       try{
           dlm.addElement("TRYING TO CONNECT:"+ipaddress+":"+port);
           dlm.addElement("CONNECTION ESTABLISHED SUCCESSFULLY");
       
        filelist.forEach((t)->{
          
               try{
                        sock=new Socket(ipaddress,port);
                        
                        PrintWriter bwriter=new PrintWriter(sock.getOutputStream(),true);
                  
                        System.out.println(t.toString());
                        bwriter.println(Paths.get(t.getAbsolutePath()).getFileName().toString());
                        BufferedReader bread=new BufferedReader(new FileReader(t));
                 
                        String s;
                        while((s=bread.readLine())!=null){
           
                            bwriter.println(s);
                        }
                     
                        bread.close();
                        bwriter.close();
                        
                        dlm.addElement(t.getAbsolutePath()+" successfully send");
                        sock.close();
               }
               catch(IOException e){
                   
               }
               
            
            
            
        });
            
            
            
            
            
            
      //   dout.close();
     //    sock.close();   
            
            
            
            
       }
       catch(Exception e){
           dlm.addElement(e.getMessage());
          
           System.out.println(e);
            e.printStackTrace();
       }
       
        
        
        
    }
    
    public void serverConfig(int portno,DefaultListModel<String> dlm,String dest){
        List<Socket> sock_array_list=new ArrayList<Socket>();
        try{
           
          //  dlm.addElement("Starting Server....");
            serverSocket=new ServerSocket(portno);
            System.out.println("server started");
            dlm.addElement("Listening on port..."+portno);
            dlm.addElement("Waiting for connection....");
            while(true){
            sock=serverSocket.accept();
            System.out.println("m here acceptin");
          //  dlm.addElement("Connection Established to:"+sock.getRemoteSocketAddress());
            ThreadClass ob=new ThreadClass(sock,dlm,dest);
            Thread t=new Thread(ob);
	    t.setDaemon(true);
            t.start();
        //    dlm.addElement("Starting thread...");
            
            }
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
