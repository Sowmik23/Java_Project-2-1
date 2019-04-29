
package TaxCalculationSystem_Server;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Balance {
    
    String bank,account,password;
    
    public Balance(String bnk,String ac,String p)
    {
        this.bank = bnk;
        this.account = ac;
        this.password = p;
    }
    
    String BankCheck() throws FileNotFoundException
    {
        FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\Bank.txt");
        
        String s1,s2,s3,s4;
        Scanner input = new Scanner(fr);
        while(input.hasNext())
        {
            s1 = input.nextLine();
            s2 = input.nextLine();
            s3 = input.nextLine();
            s4 = input.nextLine();
            if(s1.equals(bank) && s2.equals(account) && s3.equals(password))
            {
                return s4;
            }
        }
        return null;
    }
  
}
