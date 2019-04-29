
package TaxCalculationSystem_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class EditProperty extends javax.swing.JFrame {

   String House,Aproperty,TCompany,IncomeCom,AnnualIncome;
   static String username;
   Socket s;
   static DataInputStream din;
   static DataOutputStream dout;
 
    public EditProperty(DataInputStream din,DataOutputStream dout,String name) {
        initComponents();
        this.din = din;
        this.dout = dout;
        this.username = name;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HouseComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        AmountProperty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CompanyComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CompanyIncome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MIncome1 = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Properties");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 21, 177, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("House");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 136, 39));

        HouseComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HouseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Outside City Corporation", "Dhaka North City Corporation", "Dhaka Sorth City Corporation", "Gazipur City Corporation", "Barishal City Corporation", "Commilla City Corporation", "Chittagong City Corporation", "Rangupur City Corporation", "Jessore City Corporation", "Khulna City Corporation", "Dinajpur City Corporation", "Rajshahi City Corporation", "Mymensingh City Corporation", "Narayanganj City Corporation" }));
        getContentPane().add(HouseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 222, 39));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Amount of Property");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, 39));

        AmountProperty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AmountProperty.setText("0.0");
        getContentPane().add(AmountProperty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 222, 37));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Type of Company");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 156, 39));

        CompanyComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CompanyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Publicly Trade Company", "None-Publicly Trade Company", "Public Bank", "Non-Public Bank", "Merchant Bank", "Mobile Phone: Public", "Moblie Phone: Non-Public" }));
        getContentPane().add(CompanyComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 222, 39));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Income from Company");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, 39));

        CompanyIncome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CompanyIncome.setText("0.0");
        CompanyIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyIncomeActionPerformed(evt);
            }
        });
        getContentPane().add(CompanyIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 222, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Annual Income");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 144, 39));

        MIncome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MIncome1.setText("0.0");
        MIncome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIncome1ActionPerformed(evt);
            }
        });
        getContentPane().add(MIncome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 222, 39));

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 114, 48));

        SaveButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 114, 48));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CompanyIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyIncomeActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
//        Menu m = new Menu(din, dout, username);
//        m.setVisible(true);
//        setVisible(false);
//        m.setResizable(false);
//        m.setLocationRelativeTo(null);

          Property p = new Property(din, dout, username);
          p.setVisible(true);
          p.setResizable(false);
          p.setLocationRelativeTo(null);
          setVisible(false);

    }//GEN-LAST:event_BackButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        House="";
        Aproperty="";
        TCompany="";
        IncomeCom="";
        AnnualIncome="";
        
        House = (String)HouseComboBox.getSelectedItem();
        Aproperty = AmountProperty.getText();
        TCompany = (String) CompanyComboBox.getSelectedItem();
        IncomeCom = CompanyIncome.getText();
        AnnualIncome = MIncome1.getText();
        //AnnualIncome = (int)MonthlyIncome*12;
        
        try {
            dout.writeUTF("EditProperty");
            dout.writeUTF(username);
            dout.writeUTF(House);
            dout.writeUTF(Aproperty);
            dout.writeUTF(TCompany);
            dout.writeUTF(IncomeCom);
            dout.writeUTF(AnnualIncome);
            
            JOptionPane.showMessageDialog(null, "Done");
            Property p = new Property(din, dout, username);
            p.setVisible(true);
            setVisible(false);
            p.setResizable(false);
            p.setLocationRelativeTo(null);
            
        } catch (Exception e) {
            System.out.println(e);
        }  
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void MIncome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIncome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MIncome1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Property(din,dout,username).setVisible(true);
                EditProperty property = new EditProperty(din,dout,username);
                property.setVisible(true);
                property.setResizable(false);
                property.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountProperty;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> CompanyComboBox;
    private javax.swing.JTextField CompanyIncome;
    private javax.swing.JComboBox<String> HouseComboBox;
    private javax.swing.JTextField MIncome1;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
