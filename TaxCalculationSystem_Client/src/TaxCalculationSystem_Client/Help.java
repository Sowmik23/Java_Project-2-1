
package TaxCalculationSystem_Client;

import java.awt.Desktop;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Help extends javax.swing.JFrame {
    Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    static String username;

    public Help(DataInputStream din,DataOutputStream dout,String username) {
        initComponents();
        this.din = din;
        this.dout = dout;
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HelpButton1 = new javax.swing.JButton();
        HelpButton2 = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setText("*Fill all the information in the given format");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 117, 353, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("#To know tax rule follow the link");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 179, 353, 29));

        HelpButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        HelpButton1.setText("NATIONAL BOARD OF REVINUE,BANGLADESH");
        HelpButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(HelpButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 255, 427, 38));

        HelpButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        HelpButton2.setText("Rate of Income Tax 2017-18");
        HelpButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(HelpButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 331, 250, 39));

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 404, 118, 47));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Help");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 11, 88, 56));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HelpButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpButton1ActionPerformed
        
        try {
            Desktop.getDesktop().browse(new URL("http://nbr.gov.bd/taxtypes/income-tax/income-tax-paripatra/eng").toURI());
            System.out.println("DONE...");
            //Desktop.getDesktop().browse(new URL("https://www.facebook.com/").toURI());
            
        } catch (IOException ex) {
            
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE,null,ex);
            
        } catch (URISyntaxException ex) {
            
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HelpButton1ActionPerformed

    private void HelpButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpButton2ActionPerformed
        
        try {
            Desktop.getDesktop().browse(new URL("http://nbr.gov.bd/uploads/paripatra/PARIPATRA_2017-18.pdf").toURI());
            System.out.println("DONE...2");
            
        } catch (IOException ex) {
            
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE,null,ex);
            
        } catch(URISyntaxException ex){
            
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }//GEN-LAST:event_HelpButton2ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
        Menu m = new Menu(din,dout,username);
        m.setVisible(true);
        setVisible(false);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_BackButtonActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Help(din,dout,username).setVisible(true);
                Help help = new Help(din,dout,username);
                help.setVisible(true);
                help.setResizable(false);
                help.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton HelpButton1;
    private javax.swing.JButton HelpButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
