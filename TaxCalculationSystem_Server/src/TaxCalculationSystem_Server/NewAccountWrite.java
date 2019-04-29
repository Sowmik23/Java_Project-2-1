
package TaxCalculationSystem_Server;

import java.io.FileWriter;
import java.io.IOException;


public class NewAccountWrite {
    
    private String FName,UsName,EID,PhNo,Pass,birthDate,nation,nid,ffquota,disable,gender;
    
    //fullName, username, "---", "---", "---","---",email,mobileNo,"---","---",password
    public NewAccountWrite(String fn,String un,String bd,String nation,String gender,String nid,String eid,String pno,String ffq,String disable,String pass)
    {
        this.FName = fn;
        this.UsName = un;
        this.birthDate = bd;
        this.nation = nation;
        this.gender = gender;
        this.EID = eid;
        this.PhNo = pno;
        this.nid = nid;
        this.ffquota = ffq;
        this.disable = disable;
        this.Pass = pass;
    }
    
    void Write() throws IOException
    {
        FileWriter fw = new FileWriter("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\NewAccount.txt",true);
        fw.write(FName);
        fw.write(System.lineSeparator());
        fw.write(UsName);
        fw.write(System.lineSeparator());
        fw.write(birthDate);
        fw.write(System.lineSeparator());
        fw.write(nation);
        fw.write(System.lineSeparator());
        fw.write(gender);
        fw.write(System.lineSeparator());
        fw.write(EID);
        fw.write(System.lineSeparator());
        fw.write(PhNo);
        fw.write(System.lineSeparator());
        fw.write(nid);
        fw.write(System.lineSeparator());
        fw.write(ffquota);
        fw.write(System.lineSeparator());
        fw.write(disable);
        fw.write(System.lineSeparator());
        fw.write(Pass);
        fw.write(System.lineSeparator());
        fw.close();
    }
    
}
