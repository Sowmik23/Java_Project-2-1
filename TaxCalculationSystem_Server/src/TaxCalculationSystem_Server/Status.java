package TaxCalculationSystem_Server;

import java.io.*;
import java.text.*;
import java.util.*;

public class Status {
    
    String username,houseTax,PropertyTax,IncomeTax,CompanyTax;
    
    public Status(String name)
    {
        this.username = name;
    }
    
    public Status(String name,String ht,String pt,String it,String ct)
    {
        this.username = name;
        this.houseTax = ht;
        this.PropertyTax = pt;
        this.IncomeTax = it;
        this.CompanyTax = ct;
    }
    
    void writeFirst() throws IOException
    {
        FileWriter fw = new FileWriter("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\PaymentStatus.txt",true);
        fw.write(username);
        fw.write(System.lineSeparator());
        fw.write("-----");
        fw.write(System.lineSeparator());
        fw.write("-----");
        fw.write(System.lineSeparator());
        fw.write("-----");
        fw.write(System.lineSeparator());
        fw.write("-----");
        fw.write(System.lineSeparator());
        fw.close(); 
    }
    
    void writeSecond() throws IOException 
    {
        userstatus mp;
        HashMap<String,userstatus>hmp = new HashMap<String, userstatus>();
        FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\PaymentStatus.txt");
        String s1,s2,s3,s4,s5;
        Scanner input = new Scanner(fr);
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date d = new Date();
        String str2 = (String ) df.format(d);
        System.out.println(str2);
        String str[] = str2.split("/");
        while(input.hasNext())
        {
            s1 = input.nextLine();
            s2 = input.nextLine();
            s3 = input.nextLine();
            s4 = input.nextLine();
            s5 = input.nextLine();
            System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
            if(s1.equals(username))
            {
                if(s2.equals("-----") && !houseTax.equals("0"))
                {
                    s2 = s2.valueOf(Integer.parseInt(houseTax) + Integer.parseInt(str[2]));
                }
                
                else if(!s2.equals("-----") && !houseTax.equals("0"))
                {
                    s2 = s2.valueOf(Integer.parseInt(s2) + Integer.parseInt(houseTax));
                }
                
                if(s3.equals("-----") && !PropertyTax.equals("0"))
                {
                    s3 = s3.valueOf(Integer.parseInt(PropertyTax) + Integer.parseInt(str[2]));
                }
                
                else if(!s3.equals("-----") && !PropertyTax.equals("0"))
                {
                    s3 = s3.valueOf(Integer.parseInt(s3) + Integer.parseInt(PropertyTax));
                }
                
                if(s4.equals("-----") && !IncomeTax.equals("0"))
                {
                    s4 = s4.valueOf(Integer.parseInt(IncomeTax) + Integer.parseInt(str[2]));
                }
                
                else if(!s4.equals("-----") && !IncomeTax.equals("0"))
                {
                    s4 = s4.valueOf(Integer.parseInt(s4) + Integer.parseInt(IncomeTax));
                }
                
                if(s5.equals("-----") && !CompanyTax.equals("0"))
                {
                    s5 = s5.valueOf(Integer.parseInt(CompanyTax) + Integer.parseInt(str[2]));
                }
                
                else if(!s5.equals("-----") && !CompanyTax.equals("0"))
                {
                    s5 = s5.valueOf(Integer.parseInt(s5) + Integer.parseInt(CompanyTax));
                }
            }
            mp = new userstatus(s1,s2,s3,s4,s5);
            hmp.put(s1,mp);
        }
        Set s= hmp.entrySet();
        Iterator it = s.iterator();
        System.err.println("payment status is recorded");
        
        FileWriter fw = new FileWriter("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\PaymentStatus.txt");
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            mp = (userstatus)me.getValue();
            fw.write(mp.uu);
            fw.write(System.lineSeparator());
            fw.write(mp.hh);
            fw.write(System.lineSeparator());
            fw.write(mp.pp);
            fw.write(System.lineSeparator());
            fw.write(mp.ii);
            fw.write(System.lineSeparator());
            fw.write(mp.cc);
            fw.write(System.lineSeparator());           
        }
        fw.close();
    }   
}

class userstatus {
    
    String uu,hh,pp,ii,cc;
    
    public userstatus(String uu,String hh,String pp,String ii,String cc)
    {
        this.uu = uu;
        this.hh = hh;
        this.pp = pp;
        this.ii = ii;
        this.cc = cc;
    }
}