
package TaxCalculationSystem_Server;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Pay {
    
    int total;
    String bank,account,pin;
    public Pay(int total,String bk,String ac,String p){
        this.total = total;
        this.bank = bk;
        this.account = ac;
        this.pin = p;
    }
    
    void UpdateBalance() throws IOException
    {
        Bankmap1 bmap1;
        Bankmap2 bmap2;
        HashMap<Bankmap1,Bankmap2>hmp = new HashMap<Bankmap1, Bankmap2>();
        FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\Bank.txt");
        String s1,s2,s3,s4;
        Scanner input = new Scanner(fr);
        while(input.hasNext())
        {
            s1 = input.nextLine();
            s2 = input.nextLine();
            s3 = input.nextLine();
            s4 = input.nextLine();
            if(s1.equals(bank) && s2.equals(account) && s3.equals(pin)){
                int x = Integer.parseInt(s4);
                x = x - total;
                s4 = s4.valueOf(x);
            }
            bmap1 = new Bankmap1(s1,s2,s3);
            bmap2 = new Bankmap2(s1,s2,s3,s4);
            hmp.put(bmap1,bmap2);
        }
        
        Set s = hmp.entrySet();
        Iterator it = s.iterator();
        FileWriter fw = new FileWriter("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\Bank.txt");
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            bmap2 = (Bankmap2)me.getValue();
            fw.write(bmap2.bn);
            fw.write(System.lineSeparator());
            fw.write(bmap2.acn);
            fw.write(System.lineSeparator());
            fw.write(bmap2.pn);
            fw.write(System.lineSeparator());
            fw.write(bmap2.b);
            fw.write(System.lineSeparator());
            System.out.println("System is Running");
        }
        fw.close();
    }
}

class Bankmap1{
    
    String bn,acn,pn;
    public Bankmap1(String bn,String acn,String pn){
        this.bn = bn;
        this.acn = acn;
        this.pn = pn;
    }
}

class Bankmap2{
    
    String bn,acn,pn,b;
    public Bankmap2(String bn,String acn,String pn,String b){
        this.bn = bn;
        this.acn = acn;
        this.pn = pn;
        this.b = b;
    }
}