
package TaxCalculationSystem_Server;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LoginCheck {
    String username,password;
    
    public LoginCheck(String name,String pass)
    {
        this.username = name;
        this.password = pass;
    }
    boolean Check() throws FileNotFoundException
    {
        FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\NewAccount.txt");
        String s1,s2;
        Scanner input = new Scanner(fr);
        while(input.hasNext())
        {
            s1 = input.nextLine();
            s1 = input.nextLine();
            s2 = input.nextLine();
            s2 = input.nextLine();
            s2 = input.nextLine();
            s2 = input.nextLine();
            s2 = input.nextLine();
            s2 = input.nextLine();
            s2 = input.nextLine();
            s2 = input.nextLine();
            s2 = input.nextLine();
            if(s1.equals(username) && s2.equals(password)) return true;
        }
        return false;
    }
    
}
