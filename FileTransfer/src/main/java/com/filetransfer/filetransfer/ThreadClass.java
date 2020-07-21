/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetransfer.filetransfer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.DefaultListModel;
/**
 *
 * @author root
 */
public class ThreadClass implements Runnable{
    private Socket sock;
    private DefaultListModel<String> dlm;
    private String dest;
    public ThreadClass(Socket sock,DefaultListModel<String> dlm,String dest){
        this.sock=sock;
        this.dlm=dlm;
        this.dest=dest;
    }
    
    
    @Override
    public void run() {
        try{
                
             //   dlm.addElement("Receiving files:");
                BufferedReader bread=new BufferedReader(new InputStreamReader(sock.getInputStream()));           
                String filename=bread.readLine();
                String name;
                System.out.println(dest+File.separator+filename);
                BufferedWriter bwriter=new BufferedWriter(new FileWriter(dest+File.separator+filename));
                 while((name=bread.readLine())!=null){
                 //    System.out.println(name);
                //     s=s+name;
                    System.out.println(name);
                     bwriter.write(name+"\n");
                     bwriter.flush();
                 }
         //        System.out.println("here");
                 bwriter.flush();
                 bwriter.close();
           //      System.out.println("done");
                System.out.println("received:"+filename);
            //    dlm.addElement("file received:"+filename);
                sock.close();
                

        }    
        catch(IOException e){
            System.out.println("messg:"+e.getMessage());
            
        }
        
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
