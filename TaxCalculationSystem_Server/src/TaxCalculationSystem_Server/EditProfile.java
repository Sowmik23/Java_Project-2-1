
package TaxCalculationSystem_Server;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EditProfile {
    
    String un,fn,bd,nt,g,nid,e,pno,addr,m,ff,d,p;

    public EditProfile(String un,String fn,String bd,String nt,String g,String nid,String e,String m,String ff,String d,String p)
    {
        this.un = un;
        this.fn = fn;
        this.bd = bd;
        this.nt = nt;
        this.g = g;
        this.nid = nid;
        this.e = e;
        this.m = m;
        this.ff = ff;
        this.d = d;
	this.p = p;
    }

    void write() throws IOException
    {
        map mp;
        HashMap<String,map> hmp = new HashMap<String,map>();
        FileReader FR = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\NewAccount.txt");
        String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11;
        Scanner scan = new Scanner(FR);
        while(scan.hasNext())
        {
            s1 = scan.nextLine();
            s2 = scan.nextLine();
            s3 = scan.nextLine();
            s4 = scan.nextLine();
            s5 = scan.nextLine();
            s6 = scan.nextLine();
            s7 = scan.nextLine();
            s8 = scan.nextLine();
            s9 = scan.nextLine();
            s10 = scan.nextLine();
            s11 = scan.nextLine();
            mp = new map(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11);
            hmp.put(s2,mp);
        }
        mp = new map(fn,un,bd,nt,g,nid,e,m,ff,d,p);
        hmp.put(un,mp);
        Set set = hmp.entrySet();
        Iterator it = set.iterator();
        FileWriter FW = new FileWriter("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\NewAccount.txt");
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry)it.next();
            mp = (map)me.getValue();
            FW.write(mp.f);
            FW.write(System.lineSeparator());
            FW.write(mp.u);
            FW.write(System.lineSeparator());
            FW.write(mp.b);
            FW.write(System.lineSeparator());
            FW.write(mp.na);
            FW.write(System.lineSeparator());
            FW.write(mp.gn);
            FW.write(System.lineSeparator());
            FW.write(mp.ni);
            FW.write(System.lineSeparator());
            FW.write(mp.em);
            FW.write(System.lineSeparator());
            FW.write(mp.mb);
            FW.write(System.lineSeparator());
            FW.write(mp.ffq);
            FW.write(System.lineSeparator());
            FW.write(mp.ds);
            FW.write(System.lineSeparator());
            FW.write(mp.pw);
            FW.write(System.lineSeparator());
        }
	FW.close();
    }
}

class map
{
    String f,u,b,na,gn,ni,em,mb,ffq,ds,pw;
    public map(String f,String u,String b,String na,String gn,String ni,String em,String mb,String ffq,String ds,String pw)
    {
        this.f = f;
        this.u = u;
        this.b = b;
        this.na = na;
        this.gn = gn;
        this.ni = ni;
        this.em = em;
        this.mb = mb;
        this.ffq = ffq;
        this.ds = ds;
        this.pw = pw;
    }
}
