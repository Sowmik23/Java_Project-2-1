
package TaxCalculationSystem_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    String FName,FUName,FEmail,FPhoneN,FPass,FConfPass,check;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    
    public SignUp(DataInputStream din,DataOutputStream dout) {
        initComponents();
        this.din = din;
        this.dout = dout;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UName = new javax.swing.JTextField();
        EmailAdd = new javax.swing.JTextField();
        PhoneNo = new javax.swing.JTextField();
        FullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ConfPassword = new javax.swing.JPasswordField();
        SPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        SignUpB = new javax.swing.JButton();
        BackButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Full name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 99, 111, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 153, 98, 33));

        UName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNameActionPerformed(evt);
            }
        });
        getContentPane().add(UName, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 156, 244, 33));

        EmailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddActionPerformed(evt);
            }
        });
        getContentPane().add(EmailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 212, 244, 33));

        PhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 273, 244, 33));

        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });
        getContentPane().add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 102, 244, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Email Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 207, 114, 37));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Phone No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 270, 98, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 332, 98, 36));

        ConfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(ConfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 396, 244, 35));
        getContentPane().add(SPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 332, 244, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 393, -1, 35));

        SignUpB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignUpB.setText("Sign Up");
        SignUpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 481, 113, 43));

        BackButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton1.setText("Back");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 481, 114, 43));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Create a new Account");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 11, 276, 47));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void PhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNoActionPerformed

    private void UNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UNameActionPerformed

    private void EmailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddActionPerformed

    private void ConfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfPasswordActionPerformed

    private void SignUpBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBActionPerformed
        FName ="";
        FUName ="";
        FEmail ="";
        FPhoneN ="";
        FPass ="";
        FConfPass ="";
        
        FName = FullName.getText();
        FUName = UName.getText();
        FEmail = EmailAdd.getText();
        FPhoneN = PhoneNo.getText();
        FPass = SPassword.getText();
        FConfPass = ConfPassword.getText();
        
        System.out.println(FName+" "+FUName+" "+FEmail+" "+FPhoneN+" "+FPass+" "+FConfPass+" is true");
        
        if(FName.equals("") || FUName.equals("") || FEmail.equals("") || FPhoneN.equals("") || FPass.equals("") || FConfPass.equals("")){
            JOptionPane.showMessageDialog(null,"Please fill all the fields","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                check = "";
                dout.writeUTF("Sign Up");
                dout.writeUTF(FName);
                dout.writeUTF(FUName);
                dout.writeUTF(FEmail);
                dout.writeUTF(FPhoneN);
                dout.writeUTF(FPass);
                dout.writeUTF(FConfPass);
                //check = "true";
                check = din.readUTF();
                System.out.println(FName+" "+FUName+" "+FEmail+" "+FPhoneN+" "+FPass+" "+FConfPass+" checking here");
                if(check.equals("false")){
                    JOptionPane.showMessageDialog(null,"This user name already exists");
                }
                else if(check.equals("true")){
                    JOptionPane.showMessageDialog(null,"Successfully Registered!!!Please Sign in and complete your profile informations");
                    FrontPage fp = new FrontPage(din, dout);
                    fp.setVisible(true);
                    fp.setResizable(false);
                    fp.setLocationRelativeTo(null);
                    setVisible(false);
                        
//                        Menu m  = new Menu(din, dout, FUName);
//                        m.setVisible(true);
//                        m.setResizable(false);
//                        m.setLocationRelativeTo(null);
//                        setVisible(false);
                }
       
            } catch (IOException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE,null,ex);
            }
            
        }
 
    }//GEN-LAST:event_SignUpBActionPerformed

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        FrontPage fp = new FrontPage(din, dout);
        fp.setVisible(true);
        setVisible(false);
        fp.setResizable(false);
        fp.setLocationRelativeTo(null);
    }//GEN-LAST:event_BackButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SignUp(din,dout).setVisible(true);
                SignUp sign = new SignUp(din,dout);
                sign.setVisible(true);
                sign.setResizable(false);
                sign.setLocationRelativeTo(null);
   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton1;
    private javax.swing.JPasswordField ConfPassword;
    private javax.swing.JTextField EmailAdd;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField PhoneNo;
    private javax.swing.JPasswordField SPassword;
    private javax.swing.JButton SignUpB;
    private javax.swing.JTextField UName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
