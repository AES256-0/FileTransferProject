/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetransfer.filetransfer;

import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class FIleTransferFrame extends javax.swing.JFrame {

    /**
     * Creates new form FIleTransferFrame
     */
    public FIleTransferFrame() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        setTitle("File Transfer");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        send = new javax.swing.JButton();
        receive = new javax.swing.JButton();
        ipaddress = new javax.swing.JTextField();
        portno = new javax.swing.JTextField();
        selectfile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new JList<String>(dlm);
        ;
        rport = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        receivedestination = new javax.swing.JTextField();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(72, 97, 206));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        send.setBackground(new java.awt.Color(60, 83, 189));
        send.setText("SEND");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        receive.setBackground(new java.awt.Color(56, 82, 197));
        receive.setText("RECEIVE");
        receive.setPreferredSize(new java.awt.Dimension(54, 33));
        receive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiveActionPerformed(evt);
            }
        });

        ipaddress.setBackground(new java.awt.Color(190, 49, 40));
        ipaddress.setForeground(new java.awt.Color(1, 233, 177));
        ipaddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ipaddress.setText("IP ADDRESS");

        portno.setBackground(new java.awt.Color(192, 49, 40));
        portno.setForeground(new java.awt.Color(1, 233, 177));
        portno.setText("PORT NUMBER");

        selectfile.setBackground(new java.awt.Color(190, 49, 40));
        selectfile.setForeground(new java.awt.Color(1, 233, 177));
        selectfile.setText("SELECT FILES");
        selectfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectfileActionPerformed(evt);
            }
        });

        info.setForeground(new java.awt.Color(1, 16, 135));
        jScrollPane1.setViewportView(info);

        jScrollPane2.setViewportView(jScrollPane1);

        rport.setBackground(new java.awt.Color(190, 49, 40));
        rport.setText("RECEIVE PORT (DEFAULT=65532)");
        rport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rportActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("src/main/java/com/filetransfer/filetransfer/send.png"));

    jLabel2.setIcon(new javax.swing.ImageIcon("src/main/java/com/filetransfer/filetransfer/recv.png"));

    receivedestination.setBackground(new java.awt.Color(190, 49, 40));
    receivedestination.setText("RECEIVE DESTINATION");
    receivedestination.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            receivedestinationActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(66, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(selectfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addComponent(portno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addComponent(ipaddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(send, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(receive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(receivedestination)
                    .addComponent(rport)))
            .addContainerGap(55, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(35, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(ipaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(portno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(selectfile, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(receivedestination, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rport, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(receive, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(result)
            .addContainerGap(59, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
        String ip = ipaddress.getText();
        int port = Integer.parseInt(portno.getText());
        new SocketClass().clientSocket(ip, port, filelist, dlm);
    }//GEN-LAST:event_sendActionPerformed

    private void selectfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectfileActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.showOpenDialog(null);
        File[] files = chooser.getSelectedFiles();
        for (File f : files) {
            dlm.addElement(f.getAbsolutePath());
            filelist.add(f);
        }
        for (File f : filelist) {
            System.out.println(f);

        }

    }//GEN-LAST:event_selectfileActionPerformed

    private void rportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rportActionPerformed

    private void receiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiveActionPerformed
        // TODO add your handling code here:

        //   receive.setText("STOP");
        result.setText("Receiving files...");
        String dest=receivedestination.getText().equals("RECEIVE DESTINATION")?System.getProperty("user.home"):receivedestination.getText();
        System.out.println("dest:"+dest);       
        int port = rport.getText().equals("") ? 65532 : Integer.parseInt(rport.getText());
        System.out.println(port);
        dlm.addElement("server starting");
        new SocketClass().serverConfig(port, dlm,dest);


    }//GEN-LAST:event_receiveActionPerformed

    private void receivedestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivedestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receivedestinationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FIleTransferFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIleTransferFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIleTransferFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIleTransferFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FIleTransferFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> info;
    private javax.swing.JTextField ipaddress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField portno;
    private javax.swing.JButton receive;
    private javax.swing.JTextField receivedestination;
    private javax.swing.JLabel result;
    private javax.swing.JTextField rport;
    private javax.swing.JButton selectfile;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel<String> dlm = new DefaultListModel<String>();
    private List<File> filelist = new ArrayList<File>();

}
