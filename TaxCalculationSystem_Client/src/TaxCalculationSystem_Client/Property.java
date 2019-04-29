
package TaxCalculationSystem_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Property extends javax.swing.JFrame {

    String house,prop,cincome,ctype,aincome;
    static String uname;
    Socket s;
    static DataInputStream din;
    static DataOutputStream dout;

    public Property(DataInputStream din,DataOutputStream dout,String un)
    {
        initComponents();
        this.din = din;
        this.dout = dout;
        this.uname = un;
        
        house = "";
        prop = "";
        cincome = "";
        ctype = "";
        aincome = "";
        setProperty();
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
        AnnualIncomeField = new javax.swing.JTextField();
        CompanyTypeField = new javax.swing.JTextField();
        CompanyIncomeField = new javax.swing.JTextField();
        propertyField = new javax.swing.JTextField();
        houseField = new javax.swing.JTextField();
        editbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Properties");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Property");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Income From Company");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Type of Company");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Annual Income");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 150, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("House");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 40));
        getContentPane().add(AnnualIncomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 230, 30));
        getContentPane().add(CompanyTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 230, 30));
        getContentPane().add(CompanyIncomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 230, 30));
        getContentPane().add(propertyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 230, 30));
        getContentPane().add(houseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 230, 30));

        editbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(editbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 120, 40));

        backbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 120, 40));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        
        EditProperty ep = new EditProperty(din, dout, uname);
        ep.setVisible(true);
        ep.setResizable(false);
        ep.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_editbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        
        Menu m = new Menu(din, dout, uname);
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_backbuttonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property(din,dout,uname).setVisible(true);
            }
        });
    }
    
    public void setProperty()
    {
        try
        {
            dout.writeUTF("Property");
            dout.writeUTF(uname);
            house = din.readUTF();
            prop = din.readUTF();
            cincome = din.readUTF();
            ctype = din.readUTF();
            aincome = din.readUTF();
            
            houseField.setText(house);
            houseField.setFocusable(false);
            propertyField.setText(prop);
            propertyField.setFocusable(false);
            CompanyIncomeField.setText(cincome);
            CompanyIncomeField.setFocusable(false);
            CompanyTypeField.setText(ctype);
            CompanyTypeField.setFocusable(false);
            AnnualIncomeField.setText(aincome);
            AnnualIncomeField.setFocusable(false);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnnualIncomeField;
    private javax.swing.JTextField CompanyIncomeField;
    private javax.swing.JTextField CompanyTypeField;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JTextField houseField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField propertyField;
    // End of variables declaration//GEN-END:variables
}
