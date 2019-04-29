
package TaxCalculationSystem_Server;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class NewAccountCheck {
    private String username;
    
    public NewAccountCheck(String name)
    {
        this.username = name;
    }
    
    boolean Check() throws IOException
    {
        FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\NewAccount.txt");
        String str;
        Scanner input = new Scanner(fr);
        while(input.hasNext())
        {
            str = input.nextLine();
            str = input.nextLine();
            if(str.equals(username)) return false;
            str = input.nextLine();
            str = input.nextLine();
            str = input.nextLine();
            str = input.nextLine();
            str = input.nextLine();
            str = input.nextLine();
            str = input.nextLine();
            str = input.nextLine();
            str = input.nextLine();
        }
        return true;
    }
        
}
