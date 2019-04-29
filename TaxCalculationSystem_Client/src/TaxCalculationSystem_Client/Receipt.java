
package TaxCalculationSystem_Client;

import java.awt.Font;
import sun.java2d.opengl.OGLSurfaceData;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Receipt extends javax.swing.JFrame {

    static String username,HouseTax,PropertyTax,CompanyTax,IncomeTax,TotalTax,Bank,AccountNo,Pin,CurrBallence,HouseYr,ProYr,IncomeYr,CompanyYr;
    Socket s;
    static DataInputStream din;
    static DataOutputStream dout;

    public Receipt(DataInputStream din,DataOutputStream dout,String uname,String ht,String pt,String it,String ct,String tt,String hy,String py,String iy,String cy) {
        initComponents();
        this.din = din;
        this.dout = dout;
        this.username = uname;
        HouseTax = ht;
        PropertyTax =pt;
        IncomeTax = it;
        CompanyTax = ct;
        TotalTax = tt;
        
        this.HouseYr = hy;
        this.ProYr = py;
        this.IncomeYr = iy;
        this.CompanyYr = cy;
        
        set();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SelectBank = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        AcNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PinNo = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        CurrentBalance = new javax.swing.JTextField();
        ViewButton = new javax.swing.JButton();
        PayButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Receipt");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 129, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Money Receipt");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Bank");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 81, 32));

        SelectBank.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SelectBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Janata Bank Limited", "Islami Bank Limited", "Sonali Bank Limited" }));
        getContentPane().add(SelectBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 210, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Account No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 105, 32));
        getContentPane().add(AcNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 210, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Pin No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 92, 32));
        getContentPane().add(PinNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 210, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Current Ballance");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, 32));

        CurrentBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CurrentBalance.setText("0.0");
        getContentPane().add(CurrentBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 210, 32));

        ViewButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 110, 45));

        PayButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PayButton.setText("Pay");
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 110, 45));

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 124, 45));

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 340));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
        PayTax p = new PayTax(din,dout,username);
        p.setVisible(true);
        setVisible(false);
        p.setResizable(false);
        p.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        
        String check = "";
        Bank = "";
        AccountNo = "";
        Pin = "";
        CurrBallence = "0.0";
        
        Bank = (String)SelectBank.getSelectedItem();
        AccountNo = AcNo.getText();
        Pin = PinNo.getText();
        
        try {
            dout.writeUTF("Receipt");
            dout.writeUTF(Bank);
            dout.writeUTF(AccountNo);
            dout.writeUTF(Pin);
            
            check = din.readUTF();
            System.out.println("Check "+check );
            if(check.equals("false")){
                JOptionPane.showMessageDialog(null,"Invalid Account number or Password","Warning",JOptionPane.ERROR_MESSAGE);
                //AcNo.setText("");
                //PinNo.setText("");
            }  
            
            else { 
                CurrBallence = check;
                CurrentBalance.setText(CurrBallence);
                CurrentBalance.setFocusable(false);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
        
        double x,y;
        x = Double.parseDouble(CurrBallence);
        y = Double.parseDouble(TotalTax);
        String str = "";
        System.out.println(x+" "+y);
        if(y>x)
        {
            JOptionPane.showMessageDialog(null,"Insufficient balance");
        }
        else
        {
            try
            {
                dout.writeUTF("Pay");
                dout.writeUTF(username);
                dout.writeUTF(TotalTax);
                dout.writeUTF(Bank);
                dout.writeUTF(AccountNo);
                dout.writeUTF(Pin);
                dout.writeUTF(HouseYr);
                dout.writeUTF(ProYr);
                dout.writeUTF(IncomeYr);
                dout.writeUTF(CompanyYr);
                
                set2();
                x = x-y;
                CurrentBalance.setText(str.valueOf(x));
                JOptionPane.showMessageDialog(null,"Tax Paid");
                
//                UserStatus US = new UserStatus(din,dout,username);
//                US.setVisible(true);
//                US.setResizable(false);
//                US.setLocationRelativeTo(null);
//                setVisible(false);
                  Menu m = new Menu(din, dout, username);
                  m.setVisible(true);
                  m.setResizable(false);
                  m.setLocationRelativeTo(null);
                  setVisible(false);
            }
            catch (IOException ex) 
            {
                Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_PayButtonActionPerformed

    
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Receipt(din, dout, username, HouseTax, PropertyTax, CompanyTax, IncomeTax,TotalTax, HouseYr, ProYr, IncomeYr, CompanyYr).setVisible(true);
                Receipt receipt = new Receipt(din, dout, username, HouseTax, PropertyTax, CompanyTax, IncomeTax,TotalTax, HouseYr, ProYr, IncomeYr, CompanyYr);
                receipt.setVisible(true);
                receipt.setResizable(false);
                receipt.setLocationRelativeTo(null);
            }
        });
    }

     void set()
    {
        TextArea.setText(null);
        TextArea.setFont(new Font("Serif", Font.BOLD, 15));
        TextArea.append("\tTax Receipt\n\n" + "    Name :               \t" + username + "\n\n    House Tax :    \t" + HouseTax + "\n\n    Property Tax :  \t"+PropertyTax+"\n\n    Anual Tax :      \t"+IncomeTax+"\n\n    Company Tax :  \t" + CompanyTax + "\n\n    Total :                \t"+TotalTax);
        TextArea.setFocusable(false);
        CurrentBalance.setFocusable(false);
    }
    
    void set2()
    {
        TextArea.setText(null);
        TextArea.append("\tTax Receipt\n\n" + "    Name :                \t" + username + "\n\n    House Tax :    \t" + HouseTax + "\n\n    Property Tax :  \t"+PropertyTax+"\n\n    Anual Tax :      \t"+IncomeTax+"\n\n    Company Tax :  \t" + CompanyTax + "\n\n    Total :                \t"+ TotalTax + "\n\n    Cash :                \t" + TotalTax + "\n\n    Due :                \t" + "0.0" +"\n\n    -------------------------------------------------------" + "\n\n                                 Paid");
        TextArea.setFocusable(false);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AcNo;
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField CurrentBalance;
    private javax.swing.JButton PayButton;
    private javax.swing.JPasswordField PinNo;
    private javax.swing.JComboBox<String> SelectBank;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
