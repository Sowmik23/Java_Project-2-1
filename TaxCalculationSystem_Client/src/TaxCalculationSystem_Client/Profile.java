
package TaxCalculationSystem_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Profile extends javax.swing.JFrame {

  String fname,bdate,nation,Gender,nid,email,mobile,ffq,disable,password;
    static String uname;
    Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    
    public Profile(DataInputStream din,DataOutputStream dout,String uname) 
    {
        initComponents();
        this.din = din;
        this.dout = dout;
        this.uname = uname;
        fname = "";
        bdate = "";
        nation = "";
        Gender = "";
        nid = "";
        email = "";
        mobile = "";
        ffq = "";
        disable = "";
        setProfile();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        GenderType = new javax.swing.JTextField();
        nationalid = new javax.swing.JTextField();
        eid = new javax.swing.JTextField();
        dis = new javax.swing.JTextField();
        fullName = new javax.swing.JTextField();
        mobileno = new javax.swing.JTextField();
        freedomq = new javax.swing.JTextField();
        birthDate = new javax.swing.JTextField();
        EditButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("User Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 200, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Date of Birth");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Disable");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nationality");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("National ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Email ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Mobile No");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Freedom Fighter Quota");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Full Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 30));
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 180, 30));
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 180, 30));
        getContentPane().add(GenderType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 180, 30));
        getContentPane().add(nationalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 180, 30));
        getContentPane().add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 180, 30));
        getContentPane().add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 180, 30));
        getContentPane().add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 30));
        getContentPane().add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 180, 30));
        getContentPane().add(freedomq, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 180, 30));
        getContentPane().add(birthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, 30));

        EditButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 120, 40));

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 120, 40));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        
       EditProfile up = new EditProfile(din, dout, uname);
       up.setVisible(true);
       up.setResizable(false);
       up.setLocationRelativeTo(null);
       setVisible(false);
        
    }//GEN-LAST:event_EditButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
        Menu m = new Menu(din, dout, uname);
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_BackButtonActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile(din,dout,uname).setVisible(true);
            }
        });
    }
    
    public void setProfile()
    {
        try 
        {
            dout.writeUTF("Profile");
            dout.writeUTF(uname);
            
            fname = din.readUTF();
            bdate = din.readUTF();
            nation = din.readUTF();
            Gender = din.readUTF();
            nid = din.readUTF();
            email = din.readUTF();
            mobile = din.readUTF();
            ffq = din.readUTF();
            disable = din.readUTF();
            password = din.readUTF();
            System.out.println("Password: "+password +" got it hehe!!!password is hacked!");
            
            fullName.setText(fname);
            fullName.setFocusable(false);
            userName.setText(uname);
            userName.setFocusable(false);
            birthDate.setText(bdate);
            birthDate.setFocusable(false);
            nationality.setText(nation);
            nationality.setFocusable(false);
            GenderType.setText(Gender);
            GenderType.setFocusable(false);
            nationalid.setText(nid);
            nationalid.setFocusable(false);
            eid.setText(email);
            eid.setFocusable(false);
            mobileno.setText(mobile);
            mobileno.setFocusable(false);
            freedomq.setText(ffq);
            freedomq.setFocusable(false);
            dis.setText(disable);
            dis.setFocusable(false);
        }
        catch (IOException ex) 
        {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField GenderType;
    private javax.swing.JTextField birthDate;
    private javax.swing.JTextField dis;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField freedomq;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobileno;
    private javax.swing.JTextField nationalid;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
