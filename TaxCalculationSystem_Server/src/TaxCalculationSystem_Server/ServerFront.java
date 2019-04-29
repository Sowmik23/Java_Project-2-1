
package TaxCalculationSystem_Server;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;


public class ServerFront extends javax.swing.JFrame {

   
    String pass;
    public ServerFront() {
        initComponents();
        pass = "";
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        SigninButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 80, 40));

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 213, 39));

        SigninButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SigninButton.setText("Sign in");
        SigninButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SigninButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 368, 130, 42));

        ExitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 367, 130, 43));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        
        int choice = JOptionPane.showConfirmDialog(null,"Do you want to quit the program ?","Attention!!!",JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else if(choice==JOptionPane.NO_OPTION){
            System.out.println("Yout have clicked NO option");
        }
        else if(choice==JOptionPane.CANCEL_OPTION){
            System.out.println("You have cancle to exit.");
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SigninButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninButtonActionPerformed
        
        pass = PasswordField.getText();
        if(pass.equals("12345"))
        {
            ServerUserStatus sus = new ServerUserStatus();
            sus.setVisible(true);
            setVisible(false);
            sus.setResizable(false);
            sus.setLocationRelativeTo(null);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Password");
            PasswordField.setText("");
        }
 
    }//GEN-LAST:event_SigninButtonActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ServerFront().setVisible(true);
                ServerFront sf = new ServerFront();
                sf.setVisible(true);
                sf.setResizable(false);
                sf.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SigninButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
