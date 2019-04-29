
package TaxCalculationSystem_Client;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PayTax extends javax.swing.JFrame {
   
    String htax,ptax,itax,ctax,ttax;
    static String username,hy,py,cy,iy;
    Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
  
    public PayTax(DataInputStream din,DataOutputStream dout,String uname) {
        initComponents();
        this.din = din;
        this.dout = dout;
        username = uname;
        
        hy = "";
        py = "";
        cy = "";
        iy = "";
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        HTax = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ITax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CTax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PTax = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TTax = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        ReceiptButton = new javax.swing.JButton();
        cyear = new javax.swing.JTextField();
        pyear = new javax.swing.JTextField();
        iyear = new javax.swing.JTextField();
        hyear = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Pay Tax");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 145, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("House Tax");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Year");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 51, 33));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Amount");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 79, 34));

        HTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(HTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 141, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Property Tax");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 120, 34));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Year");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 51, 33));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Amount");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 79, 34));

        ITax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(ITax, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 141, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Company Tax");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 120, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Year");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 51, 33));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Amount");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 76, 35));

        CTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(CTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 141, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Income Tax");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 120, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Year");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 51, 33));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Amount");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 76, 34));

        PTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(PTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 141, 35));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Total Tax");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 120, 34));

        TTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTaxActionPerformed(evt);
            }
        });
        getContentPane().add(TTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 141, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText(":");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 36));

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 108, 44));

        ViewButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 108, 44));

        ReceiptButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReceiptButton.setText("Receipt");
        ReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReceiptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 108, 44));

        cyear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cyear.setText("0");
        getContentPane().add(cyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 100, 30));

        pyear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pyear.setText("0");
        getContentPane().add(pyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 100, 30));

        iyear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iyear.setText("0");
        getContentPane().add(iyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 100, 30));

        hyear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hyear.setText("0");
        getContentPane().add(hyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 30));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Menu m = new Menu(din, dout, username);
        m.setVisible(true);
        setVisible(false);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        
        htax = "";
        ptax = "";
        itax = "";
        ctax = "";
        ttax = "";
        hy = htax = hyear.getText();
        py = ptax = pyear.getText();
        iy = itax = iyear.getText();
        cy = ctax = cyear.getText();
        System.out.println(htax+" "+ptax+" "+itax+" "+ctax);
        if(htax.equals("Year")) hy = htax = "0";
        if(ptax.equals("Year")) py = ptax = "0";
        if(itax.equals("Year")) iy = itax = "0";
        if(ctax.equals("Year")) cy = ctax = "0";
        System.out.println(hy+" "+py+" "+iy+" "+cy);
        try
        {
            System.out.println("I got try block and send packet to server...");
            dout.writeUTF("PayTax");
            
            dout.writeUTF(username);
            dout.writeUTF(hy);
            dout.writeUTF(py);
            dout.writeUTF(iy);
            dout.writeUTF(cy);
            System.out.println("successfully send packet of data...");
            
//            dout.writeUTF(username);
//            dout.writeUTF(htax);
//            dout.writeUTF(ptax);
//            dout.writeUTF(itax);
//            dout.writeUTF(ctax);
//            if(htax.equals("0"))
//            {
//                htax = din.readUTF();
//                htax = "0.0";
//            }
//            else    htax = din.readUTF();
//            if(ptax.equals("0"))
//            {
//                ptax = din.readUTF();
//                ptax = "0.0";
//            }
//            else    ptax = din.readUTF();
//            if(itax.equals("0"))
//            {
//                itax = din.readUTF();
//                itax = "0.0";
//            }
//            else    itax = din.readUTF();
//            if(ctax.equals("0"))
//            {
//                ctax = din.readUTF();
//                ctax = "0.0";
//            }
//            else    ctax = din.readUTF();

          
            
            htax = din.readUTF();
            ptax =din.readUTF();
            itax = din.readUTF();
            ctax = din.readUTF();
            ttax = din.readUTF();
            System.out.println("I received packet from server .");
            System.out.println(htax+" "+ptax+" "+itax+" "+ctax);
            
            HTax.setText(htax);
            HTax.setFocusable(false);
            PTax.setText(ptax);
            PTax.setFocusable(false);
            ITax.setText(itax);
            ITax.setFocusable(false);
            CTax.setText(ctax);
            CTax.setFocusable(false);
            TTax.setText(ttax);
            TTax.setFocusable(false);
        }
        catch(IOException ex)
        {
            System.out.println(ex);
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void ReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptButtonActionPerformed
        
        Receipt R = new Receipt(din,dout,username,htax,ptax,itax,ctax,ttax,hy,py,iy,cy);
        R.setVisible(true);
        R.setResizable(false);
        R.setLocationRelativeTo(null);
        setVisible(false);
        
    }//GEN-LAST:event_ReceiptButtonActionPerformed

    private void TTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTaxActionPerformed

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new PayTax().setVisible(true);
               PayTax tax = new PayTax(din,dout,username);
               tax.setVisible(true);
               tax.setResizable(false);
               tax.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField CTax;
    private javax.swing.JTextField HTax;
    private javax.swing.JTextField ITax;
    private javax.swing.JTextField PTax;
    private javax.swing.JButton ReceiptButton;
    private javax.swing.JTextField TTax;
    private javax.swing.JButton ViewButton;
    private javax.swing.JTextField cyear;
    private javax.swing.JTextField hyear;
    private javax.swing.JTextField iyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pyear;
    // End of variables declaration//GEN-END:variables
}
