
package TaxCalculationSystem_Server;

import java.awt.color.ICC_Profile;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class EditProperty {
    
    String username,house,property,companyType,CompanyIncome,AnualIncome;
    
    public EditProperty(String name,String h,String p,String ct,String ci,String mi)
    {
        this.username = name;
        this.house = h;
        this.property = p;
        this.companyType = ct;
        this.CompanyIncome = ci;
        this.AnualIncome = mi;
    }
    
    void write() throws IOException
    {
        epmap mp;
        HashMap<String,epmap>hmp = new HashMap<String, epmap> ();
        FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\Property.txt");
        String s1,s2,s3,s4,s5,s6;
        Scanner input = new Scanner(fr);
        while(input.hasNext()){
            s1 = input.nextLine();
            s2 = input.nextLine();
            s3 = input.nextLine();
            s4 = input.nextLine();
            s5 = input.nextLine();
            s6 = input.nextLine();
            mp = new epmap(s1,s2,s3,s4,s5,s6);
            hmp.put(s1,mp);
        }
        mp = new epmap(username,house,property,CompanyIncome,companyType,AnualIncome);
        hmp.put(username, mp);
        Set s = hmp.entrySet();
        Iterator it = s.iterator();
        FileWriter fw = new FileWriter("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\Property.txt");
            
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            mp = (epmap)me.getValue();
            fw.write(mp.unm);
            fw.write(System.lineSeparator());
            fw.write(mp.ho);
            fw.write(System.lineSeparator());
            fw.write(mp.pp);
            fw.write(System.lineSeparator());
            fw.write(mp.icm);
            fw.write(System.lineSeparator());
            fw.write(mp.tcm);
            fw.write(System.lineSeparator());
            fw.write(mp.aim);
            fw.write(System.lineSeparator());
        }
        fw.close();
    }
    
    void writeEditProperty() throws IOException
    {
        FileWriter fw = new FileWriter("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\Property.txt",true);
        fw.write(username);
        fw.write(System.lineSeparator());
        fw.write(house);
        fw.write(System.lineSeparator());
        fw.write(property);
        fw.write(System.lineSeparator());
        fw.write(CompanyIncome);
        fw.write(System.lineSeparator());
        fw.write(companyType);
        fw.write(System.lineSeparator());
        fw.write(AnualIncome);
        fw.write(System.lineSeparator());
        
        fw.close();
    } 
}

class epmap{
    
    String unm,ho,pp,icm,tcm,aim;
    public epmap(String unm,String ho,String pp,String icm,String tcm,String aim){
        this.unm = unm;
        this.ho = ho;
        this.pp = pp;
        this.icm = icm;
        this.tcm = tcm;
        this.aim = aim;
    }
 
}