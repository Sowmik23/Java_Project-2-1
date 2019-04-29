
package TaxCalculationSystem_Server;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

public class TaxCalculationSystem_Server {

    static String fullName,username,email,mobileNo,password,command,BirthDate,nation,gender,nid,ffighter,disable,house,postcode,property,CompanyIncome,CompanyType,AnualIncome,bank,account,pin;
    static int flag=0;
    static int bd,hy,py,iy,cy;
    static String g,e,ff,d,ha,ct;
    static double pi,ai,ci,tax;

    public static void main(String[] args) {
        ServerSocket ss;
        Socket s;
        DataInputStream din = null;
        DataOutputStream dout = null;
        System.out.println("Server Started...");
        try {
            ss = new ServerSocket(1234);
            s =ss.accept();
            System.out.println("Client Connected...");
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        ServerFront sf = new ServerFront();
        sf.setVisible(true);
        sf.setResizable(true);
        sf.setLocationRelativeTo(null);
        while(true)
        {
            username = "";
            try {
                System.out.println(command+" 1");
                
                command = "";
                command = din.readUTF();
                System.out.println(command+" 2");
                
                if(command.equals("Sign Up"))
                {
                    fullName = din.readUTF();
                    username = din.readUTF();
                    email = din.readUTF();
                    mobileNo = din.readUTF();
                    password = din.readUTF();
                    System.out.println(fullName+" "+username+" "+email+" "+mobileNo+" "+password+" "+command);
                        
                    NewAccountCheck nac = new NewAccountCheck(username);
                    if(nac.Check()==false)
                    {
                        dout.writeUTF("false");
                    }
                    else 
                    {
                        System.out.println("Entering in else block");
                        Status us = new Status(username);
                        us.writeFirst();
                        System.out.println("Payment status write is done...");
                        
                        NewAccountWrite naw = new NewAccountWrite(fullName, username, "---", "---", "---","---",email,mobileNo,"---","---",password);
                        naw.Write();
                        System.out.println("New account write done.");
                        
                        EditProperty ep = new EditProperty(username, "---", "0.0","0.0" ,"---","0.0");
                        ep.writeEditProperty();
                        System.out.println("Edit property write done..");
                        
                        
                        
                        dout.writeUTF("true");
                    }
                }
                
                if(command.equals("Sign In"))
                {
                    username = din.readUTF();
                    password = din.readUTF();
                    System.out.println(username+" "+password);
                    
                    LoginCheck lc = new LoginCheck(username, password);
                    if(lc.Check())
                    {
                        dout.writeUTF("true");
                    }
                    else 
                    {
                        dout.writeUTF("false");
                    }
                }
                
                if(command.equals("Profile"))
                {
                    username = din.readUTF();
                    System.out.println(username);
                    FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\NewAccount.txt\\");
                    String str,str1;
                    Scanner input = new Scanner(fr);
                    while(input.hasNext())
                    {
                        fullName = input.nextLine();
                        str = input.nextLine();
                        if(str.equals(username))
                        {
                            dout.writeUTF(fullName);
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            str = input.nextLine();
                            break;
                        }
                        else 
                        {
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                            
                            str1 = input.nextLine();
                        }
                    }   
                }
    
                else if(command.equals("EditProfile"))
                {
                    username = din.readUTF();
                    fullName = din.readUTF();
                    BirthDate = din.readUTF();
                    nation = din.readUTF();
                    gender = din.readUTF();
                    nid = din.readUTF();
                    email = din.readUTF();
                    mobileNo = din.readUTF();
                    //postcode = din.readUTF();
                    ffighter = din.readUTF();
                    disable = din.readUTF();
                    password = din.readUTF();
                    System.out.println(username+" "+password);
                    EditProfile ep = new EditProfile(username, fullName, BirthDate, nation,gender,nid,email, mobileNo,ffighter,disable,password);
                    ep.write();
                }
                
                
                if(command.equals("Property"))
                {
                    username = din.readUTF();
                    System.out.println(username);
                    FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\Property.txt");
                    String str;
                    Scanner input = new Scanner(fr);
                    while(input.hasNext())
                    {
                        str = input.nextLine();
                        if(str.equals(username))
                        {
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            break;
                        }
                        else 
                        {
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                            str = input.nextLine();
                        }
                    } 
                }
               
                
                
                else if(command.equals("EditProperty"))
                {
                    username = din.readUTF();
                    house = din.readUTF();
                    property = din.readUTF();
                    CompanyIncome = din.readUTF();
                    CompanyType = din.readUTF();
                    AnualIncome = din.readUTF();
                    System.out.println(username+" "+house+" "+property+" "+CompanyIncome+" "+CompanyType+" "+AnualIncome);
                    EditProperty ep = new EditProperty(username, house, property, CompanyType, CompanyIncome, AnualIncome);
                    ep.write();
                }
                
                else if(command.equals("PayTax"))
                {
                    username = din.readUTF();
                    house = din.readUTF();
                    property = din.readUTF();
                    AnualIncome = din.readUTF();
                    CompanyIncome = din.readUTF();
                    System.out.println(house+" "+property+" "+AnualIncome+" "+CompanyIncome+"YEAR");
                    
                    PayTax pt = new PayTax(username,Double.parseDouble(house), Double.parseDouble(property), Double.parseDouble(AnualIncome),Double.parseDouble(CompanyIncome));
                    dout.writeUTF(pt.getHouseTax());
                    dout.writeUTF(pt.getPropertyTax());
                    dout.writeUTF(pt.getIncomeTax());
                    dout.writeUTF(pt.getCompanyTax());
                    dout.writeUTF(pt.getTax());
                    
                }
                
                
                else if(command.equals("Receipt"))
                {
                    bank = din.readUTF();
                    account = din.readUTF();
                    pin = din.readUTF();
                    System.out.println(bank+" "+account+" "+pin);
                    
                    Balance b = new Balance(bank, account, pin);
                    if(b.BankCheck()==null) dout.writeUTF("false");
                    else dout.writeUTF(b.BankCheck());
                }
                
                else if(command.equals("Pay"))
                {
                    username = din.readUTF();
                    tax = Double.parseDouble(din.readUTF());
                    bank = din.readUTF();
                    account = din.readUTF();
                    pin = din.readUTF();
                    hy = Integer.parseInt(din.readUTF());
                    py = Integer.parseInt(din.readUTF());
                    iy = Integer.parseInt(din.readUTF());
                    cy = Integer.parseInt(din.readUTF());
                    
                    Pay p = new Pay((int)tax, bank, account, pin);
                    p.UpdateBalance();
                    String str = "";
                    System.out.println("Balance Updated");
                    
                    Status us = new Status(username,str.valueOf(hy),str.valueOf(py),str.valueOf(iy),str.valueOf(cy));
                    us.writeSecond();
                    System.out.println("Status updated");
                    
                }
                
                else if(command.equals("UserStatus"))
                {
                    username = din.readUTF();
                    FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\PaymentStatus.txt");
                    String str = "";
                    Scanner input = new Scanner(fr);
                    System.out.println(username);
                    while(input.hasNext())
                    {
                        str = input.nextLine();
                        if(str.equals(username))
                        {
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            dout.writeUTF(input.nextLine());
                            System.out.println("done.");
                            break;
                        }
                        str = input.nextLine();
                        str = input.nextLine();
                        str = input.nextLine();
                        str = input.nextLine(); 
                    } 
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }        
        }      
    }    
}
