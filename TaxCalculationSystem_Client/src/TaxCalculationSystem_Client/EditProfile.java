
package TaxCalculationSystem_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class EditProfile extends javax.swing.JFrame {

    String FullName,BirthDate,Nationnality,Gender,NIDno,Email,MobileNo,FFQuota,DisableQuota;
   
    static String username,Password;
    Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    
    public EditProfile(DataInputStream din,DataOutputStream dout,String name) {
        initComponents();
        this.din = din;
        this.dout = dout;
        this.username = name;
        //this.Password = pass;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phoneno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        birthdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FFSelect = new javax.swing.JComboBox<>();
        DisableSelect = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        GenderSelect = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Edit Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 192, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Full Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 87, 35));

        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        getContentPane().add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 179, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 97, 35));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 179, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Mobile No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 97, 35));

        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        getContentPane().add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 179, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Email ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 99, 35));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 190, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nationality");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 91, 35));

        nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityActionPerformed(evt);
            }
        });
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 190, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Date of Birth");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 35));

        birthdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        birthdate.setText("DD-MM-YY");
        birthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdateActionPerformed(evt);
            }
        });
        getContentPane().add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 179, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("National ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 99, 35));

        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });
        getContentPane().add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 190, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 72, 35));

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 110, 41));

        SaveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 110, 41));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Freedom Fighter Quota");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 190, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Disable");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 70, 30));

        FFSelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FFSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        FFSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FFSelectActionPerformed(evt);
            }
        });
        getContentPane().add(FFSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 190, 40));

        DisableSelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DisableSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        DisableSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisableSelectActionPerformed(evt);
            }
        });
        getContentPane().add(DisableSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 180, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Password");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 100, 30));
        getContentPane().add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 190, 40));

        GenderSelect.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        GenderSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        GenderSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderSelectActionPerformed(evt);
            }
        });
        getContentPane().add(GenderSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 190, 40));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void birthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdateActionPerformed

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
//        Menu m = new Menu(din, dout, username);
//        m.setVisible(true);
//        setVisible(false);
//        m.setResizable(false);
//        m.setLocationRelativeTo(null);
          Profile  p = new Profile(din, dout, username);
          p.setVisible(true);
          p.setResizable(false);
          p.setLocationRelativeTo(null);
          setVisible(false);

    }//GEN-LAST:event_BackButtonActionPerformed

    private void FFSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FFSelectActionPerformed
   
    }//GEN-LAST:event_FFSelectActionPerformed

    private void DisableSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisableSelectActionPerformed

    }//GEN-LAST:event_DisableSelectActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        
        FullName = "";
        BirthDate = "";
        Nationnality = "";
        Gender = "";
        NIDno = "";
        Email = "";
        MobileNo = "";
        FFQuota = "";
        DisableQuota = "";
        Password = "";
        FullName = fullname.getText();
        BirthDate = birthdate.getText();
        Nationnality = nationality.getText();
        Gender = (String) GenderSelect.getSelectedItem();
        NIDno = nid.getText();
        Email = email.getText();
        MobileNo = phoneno.getText();
        FFQuota = (String)FFSelect.getSelectedItem();
        DisableQuota = (String)DisableSelect.getSelectedItem();
        Password = Pass.getText();
        if(FullName.equals("") || BirthDate.equals("DD/MM/YYYY") || Nationnality.equals("") || Gender.equals("Select") || NIDno.equals("") || Email.equals("") || MobileNo.equals("") || FFQuota.equals("Select") || DisableQuota.equals("Select") || Password.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill all the fields","",JOptionPane.ERROR_MESSAGE);
        }
      
//        else {
//         Confirm c = new Confirm(Password);
//         c.setVisible(true);
//         c.setLocationRelativeTo(null);
//         if(c.Result()==false){
//             JOptionPane.showMessageDialog(null,"Wrong Password","",JOptionPane.ERROR_MESSAGE);
//         }
//        if(c.Result()==true)    
        else 
        {
            try
            {
                dout.writeUTF("EditProfile");
                dout.writeUTF(username);
                dout.writeUTF(FullName);
                dout.writeUTF(BirthDate);
                dout.writeUTF(Nationnality);
                dout.writeUTF(Gender);
                dout.writeUTF(NIDno);
                dout.writeUTF(Email);
                dout.writeUTF(MobileNo);
                dout.writeUTF(FFQuota);
                dout.writeUTF(DisableQuota);
                dout.writeUTF(Password);
                JOptionPane.showMessageDialog(null,"Done");
                Profile P = new Profile(din,dout,username);
                P.setVisible(true);
                P.setResizable(false);
                P.setLocationRelativeTo(null);
                setVisible(false);
            }
            catch (IOException ex)
            {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_SaveButtonActionPerformed
    
    private void GenderSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderSelectActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new UserProfile(din,dout,username).setVisible(true);
                EditProfile profile = new EditProfile(din,dout,username);
                profile.setVisible(true);
                profile.setResizable(false);
                profile.setLocationRelativeTo(null);
            }
        });
    }
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> DisableSelect;
    private javax.swing.JComboBox<String> FFSelect;
    private javax.swing.JComboBox<String> GenderSelect;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField birthdate;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.ButtonGroup myGroup;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
