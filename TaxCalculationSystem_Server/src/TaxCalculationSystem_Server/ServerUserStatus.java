
package TaxCalculationSystem_Server;

public class ServerUserStatus extends javax.swing.JFrame {

   
    public ServerUserStatus() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SignOut = new javax.swing.JButton();
        Status = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("User Status");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 198, 40));

        SignOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignOut.setText("Sign Out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        getContentPane().add(SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 140, 50));

        Status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Status.setText("User Status");
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, 50));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        
        ShowUserStatus sus = new ShowUserStatus();
        sus.setVisible(true);
        setVisible(false);
        sus.setResizable(false);
        sus.setLocationRelativeTo(null);
    }//GEN-LAST:event_StatusActionPerformed

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        
        ServerFront sf = new ServerFront();
        sf.setVisible(true);
        setVisible(false);
        sf.setResizable(false);
        sf.setLocationRelativeTo(null);
    }//GEN-LAST:event_SignOutActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ServerUserStatus().setVisible(true);
                ServerUserStatus sus = new ServerUserStatus();
                sus.setVisible(true);
                sus.setResizable(false);
                sus.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignOut;
    private javax.swing.JButton Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
