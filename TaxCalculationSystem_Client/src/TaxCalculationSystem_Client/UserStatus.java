
package TaxCalculationSystem_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserStatus extends javax.swing.JFrame {

    static String username,Htax,propertyTax,IncomeTax,CompanyTax;
    
    Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    
    public UserStatus(DataInputStream din,DataOutputStream dout,String name) {
        System.out.println("I got it");
        initComponents();
        this.din = din;
        this.dout = dout;
        this.username = name;
        set();
        System.out.println("I represent it successfully ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HousTaxYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IncomeTaxYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PropertyTaxYear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CompanyTaxYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        Back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("User Status");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("House Tax Paid Upto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 179, 35));

        HousTaxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HousTaxYearActionPerformed(evt);
            }
        });
        getContentPane().add(HousTaxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 274, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Income Tax Paid Upto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 179, 35));

        IncomeTaxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomeTaxYearActionPerformed(evt);
            }
        });
        getContentPane().add(IncomeTaxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 276, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Property Tax Paid Upto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 35));

        PropertyTaxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertyTaxYearActionPerformed(evt);
            }
        });
        getContentPane().add(PropertyTaxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 276, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Company Tax Paid Upto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 35));

        CompanyTaxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyTaxYearActionPerformed(evt);
            }
        });
        getContentPane().add(CompanyTaxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 276, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("User Progress");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 118, 28));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 276, 30));

        Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 499, 120, 40));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IncomeTaxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomeTaxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IncomeTaxYearActionPerformed

    private void PropertyTaxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertyTaxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PropertyTaxYearActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Menu m = new Menu(din, dout,username);
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_BackActionPerformed

    private void HousTaxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HousTaxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HousTaxYearActionPerformed

    private void CompanyTaxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyTaxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyTaxYearActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new UserStatus(din,dout,username).setVisible(true);
                UserStatus status = new UserStatus(din,dout,username);
                status.setVisible(true);
                status.setResizable(false);
                status.setLocationRelativeTo(null);
            }
        });
    }
    
    void set()
    {
        Htax = "";
        propertyTax = "";
        IncomeTax = "";
        CompanyTax = "";
        try 
        {
            System.out.println("this is try block of set.");
            dout.writeUTF("UserStatus");
            dout.writeUTF(username);
            Htax = din.readUTF();
            propertyTax = din.readUTF();
            IncomeTax = din.readUTF();
            CompanyTax = din.readUTF();
            System.out.println("Successfully collected .");
            
            HousTaxYear.setText("   "+Htax);
            HousTaxYear.setFocusable(false);
            PropertyTaxYear.setText("   "+propertyTax);
            PropertyTaxYear.setFocusable(false);
            CompanyTaxYear.setText("    "+CompanyTax);
            CompanyTaxYear.setFocusable(false);
            IncomeTaxYear.setText("     "+IncomeTax);
            IncomeTaxYear.setFocusable(false);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField CompanyTaxYear;
    private javax.swing.JTextField HousTaxYear;
    private javax.swing.JTextField IncomeTaxYear;
    private javax.swing.JTextField PropertyTaxYear;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
