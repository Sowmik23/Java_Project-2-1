
package TaxCalculationSystem_Client;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.IOException;
import javafx.scene.control.ButtonBar;


public class FrontPage extends javax.swing.JFrame {
    
    String UserName,Parrword,check;
    public static String user;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
   
    public FrontPage(DataInputStream din,DataOutputStream dout) {
        
        initComponents();
        //getContentPane().setBackground(Color.MAGENTA);
        this.din = din;
        this.dout = dout;
        user = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LUserName = new javax.swing.JTextField();
        LPassword = new javax.swing.JPasswordField();
        SignIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LUserName1 = new javax.swing.JTextField();
        LPassword1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        SignIn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Sign in");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(26, 13, 152, 60);

        LUserName.setText("Phone number,user name or email");
        jPanel3.add(LUserName);
        LUserName.setBounds(134, 94, 198, 43);

        LPassword.setText("Password"); // NOI18N
        LPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(LPassword);
        LPassword.setBounds(134, 170, 198, 41);

        SignIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignIn.setText("Sign in");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });
        jPanel3.add(SignIn);
        SignIn.setBounds(26, 257, 133, 47);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(26, 167, 90, 41);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("User Name");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(26, 91, 90, 43);
        jPanel3.add(jLabel7);
        jLabel7.setBounds(240, 30, 490, 300);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 171, 0, 0));

        Exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 128, 47));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Sign in");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 90, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("User Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 90, 43));
        getContentPane().add(LUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 263, 198, 40));

        LPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPassword1ActionPerformed(evt);
            }
        });
        getContentPane().add(LPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 331, 198, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Password");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 90, 41));

        SignIn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignIn1.setText("Sign in");
        SignIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn1ActionPerformed(evt);
            }
        });
        getContentPane().add(SignIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 133, 47));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Don't have an account?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 258, 49));

        SignUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 138, 47));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel1.setText("Easy Tax Payment System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 539, 66));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LPasswordActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       
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
    }//GEN-LAST:event_ExitActionPerformed

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
//        UserName = "";
//        Parrword = "";
//        UserName = LUserName.getText();
//        Parrword = LPassword.getText();
//        if(UserName.equals("") || Parrword.equals("")) JOptionPane.showMessageDialog(null,"Please Enter User Name and Password");
//        else {
//            try {
//                System.out.println(UserName+" "+Parrword);
//                check = "";
//                dout.writeUTF("Sign In");
//                dout.writeUTF(UserName);
//                dout.writeUTF(Parrword);
//                check = din.readUTF();
//                System.out.println(check);
//                if(check.equals("false"))
//                {
//                    JOptionPane.showMessageDialog(null,"Wrong User Name and Password","Warning",JOptionPane.ERROR_MESSAGE);
//                    LUserName.setText("");
//                    LPassword.setText("");
//                }
//                else if(check.equals("true"))
//                {
//                    JOptionPane.showMessageDialog(null,"Please fillup your Profile data","Instructions",JOptionPane.PLAIN_MESSAGE);
//                    user=UserName;
//                    System.out.println(user);
//                    LUserName.setText("");
//                    LPassword.setText("");
//                    Menu m = new Menu(din,dout,UserName);
//                    m.setVisible(true);
//                    setVisible(false);
//                    m.setResizable(false);
//                    m.setLocationRelativeTo(null);
//                }
//            } catch (IOException ex) {
//                
//                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE,null,ex);
//            }
//        }
    }//GEN-LAST:event_SignInActionPerformed

    private void LPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LPassword1ActionPerformed

    private void SignIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn1ActionPerformed
        UserName = "";
        Parrword = "";
        UserName = LUserName1.getText();
        Parrword = LPassword1.getText();
        if(UserName.equals("") || Parrword.equals("")) JOptionPane.showMessageDialog(null,"Please Enter User Name or Password");
        else {
            try {
                System.out.println(UserName+" "+Parrword+" i dont know");
                check = "";
                dout.writeUTF("Sign In");
                dout.writeUTF(UserName);
                dout.writeUTF(Parrword);
                check = din.readUTF();
                System.out.println(check);
                if(check.equals("false"))
                {
                    JOptionPane.showMessageDialog(null,"Wrong User Name and Password","Warning",JOptionPane.ERROR_MESSAGE);
                    LUserName1.setText("");
                    LPassword1.setText("");
                }
                else if(check.equals("true"))
                {
                   // JOptionPane.showMessageDialog(null,"Please fillup your Profile data","Instructions",JOptionPane.PLAIN_MESSAGE);
                    user=UserName;
                    System.out.println(user);
                    LUserName1.setText("");
                    LPassword1.setText("");
                    Menu m = new Menu(din,dout,UserName);
                    m.setVisible(true);
                    setVisible(false);
                    m.setResizable(false);
                    m.setLocationRelativeTo(null);
                }
            } catch (IOException ex) {

                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }//GEN-LAST:event_SignIn1ActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        
        SignUp su = new  SignUp(din,dout);
        su.setVisible(true);
        su.setResizable(false);
        su.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_SignUpActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                //new FrontPage(din,dout).setVisible(true);
                FrontPage page = new FrontPage(din,dout);
                page.setVisible(true);
                page.setResizable(false);
                page.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JPasswordField LPassword;
    private javax.swing.JPasswordField LPassword1;
    private javax.swing.JTextField LUserName;
    private javax.swing.JTextField LUserName1;
    private javax.swing.JButton SignIn;
    private javax.swing.JButton SignIn1;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
