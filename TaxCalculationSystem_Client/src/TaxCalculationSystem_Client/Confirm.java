
package TaxCalculationSystem_Client;


/**
 *
 * @author Sowmik_Sarker
 */
public class Confirm extends javax.swing.JFrame {

   static  String password,Input;
   
    public Confirm(String pass) {
        initComponents();
        this.password = pass;
        Input = "";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        Reset1 = new javax.swing.JButton();
        OkButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Enter Password to Confirm");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 290, 30));
        getContentPane().add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, 30));

        Reset1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Reset1.setText("Reset");
        Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset1ActionPerformed(evt);
            }
        });
        getContentPane().add(Reset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 40));

        OkButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 90, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        
       Input = passwordfield.getText();
            
    }//GEN-LAST:event_OkButtonActionPerformed

    private void Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset1ActionPerformed
        
         passwordfield.setText("");
         
    }//GEN-LAST:event_Reset1ActionPerformed

    
    
    
    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Confirm(password).setVisible(true);
                Confirm c = new Confirm(password);
                c.setVisible(true);
                c.setResizable(false);
                c.setLocationRelativeTo(null);
            }
        });
    }
    
    boolean Result() {
        if(Input.equals(password)){
            return true;
        }
        else return false;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OkButton;
    private javax.swing.JButton Reset1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordfield;
    // End of variables declaration//GEN-END:variables
}
