
package TaxCalculationSystem_Client;

import java.awt.Color;
import java.awt.Container;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


public class Menu extends javax.swing.JFrame {

    Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    static  String username;
    private Container c;
    
    public Menu(DataInputStream din,DataOutputStream dout,String username) {
        
        initComponents();
        //getContentPane().setBackground(Color.red);
        this.din = din;
        this.dout = dout;
        this.username = username;        
    }

//    public void initComponent(){
//        c = this.getContentPane();
//        c.setLayout(null);
//        c.setBackground(Color.PINK);
//    }
//    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Help = new javax.swing.JButton();
        UserProfiles = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserStatus = new javax.swing.JButton();
        UserProperties = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PayTax = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Main Menu");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 11, 199, 54));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("User Profiles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 117, 33));

        Help.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Help.setText("Click Here");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        getContentPane().add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 112, 41));

        UserProfiles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserProfiles.setText("Click Here");
        UserProfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserProfilesActionPerformed(evt);
            }
        });
        getContentPane().add(UserProfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 112, 41));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("User Status");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 119, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User Properties");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 33));

        UserStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserStatus.setText("Click Here");
        UserStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserStatusActionPerformed(evt);
            }
        });
        getContentPane().add(UserStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 112, 41));

        UserProperties.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserProperties.setText("Click Here");
        UserProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPropertiesActionPerformed(evt);
            }
        });
        getContentPane().add(UserProperties, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 112, 41));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Pay Tex");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 117, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Need Any Help?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 135, 33));

        PayTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PayTax.setText("Click Here");
        PayTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayTaxActionPerformed(evt);
            }
        });
        getContentPane().add(PayTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 112, 41));

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 112, 41));

        SignOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignOut.setText("Sign Out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        getContentPane().add(SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 112, 41));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Help h = new Help(din, dout, username);
        h.setVisible(true);
        h.setResizable(false);
        h.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_HelpActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
        Menu m = new Menu(din, dout, username);
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        
        FrontPage fp = new FrontPage(din, dout);
        fp.setVisible(true);
        fp.setResizable(false);
        fp.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_SignOutActionPerformed

    private void PayTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayTaxActionPerformed
       
        PayTax pt = new PayTax(din,dout,username);
        pt.setVisible(true);
        pt.setResizable(false);
        pt.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_PayTaxActionPerformed

    private void UserPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPropertiesActionPerformed
       
        Property p = new Property(din,dout,username);
        p.setVisible(true);
        p.setResizable(false);
        p.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_UserPropertiesActionPerformed

    private void UserStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserStatusActionPerformed
        
        UserStatus us = new UserStatus(din,dout,username);
        us.setVisible(true);
        us.setResizable(false);
        us.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_UserStatusActionPerformed

    private void UserProfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserProfilesActionPerformed
       
        Profile up = new Profile(din,dout,username);
        up.setVisible(true);
        setVisible(false);
        up.setResizable(false);
        up.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_UserProfilesActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Menu(din,dout,username).setVisible(true);
                Menu menu = new Menu(din,dout,username);
                menu.setVisible(true);
                menu.setResizable(false);
                menu.setLocationRelativeTo(null);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Help;
    private javax.swing.JButton PayTax;
    private javax.swing.JButton SignOut;
    private javax.swing.JButton UserProfiles;
    private javax.swing.JButton UserProperties;
    private javax.swing.JButton UserStatus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
