
package TaxCalculationSystem_Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaxCalculationSystem_Client {

    static Socket s;
    static  DataInputStream din;
    static  DataOutputStream dout;
    
    public static void main(String[] args) {
       
        try {
            
            s = new Socket("localhost",1234);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            
        } catch (Exception ex) {
            
            Logger.getLogger(FrontPage.class.getName()).log(Level.SEVERE, null,ex);
        } 
        FrontPage fp = new FrontPage(din, dout);
        fp.setVisible(true);
        fp.setResizable(false);
        fp.setLocationRelativeTo(null);
                
    }    
}
