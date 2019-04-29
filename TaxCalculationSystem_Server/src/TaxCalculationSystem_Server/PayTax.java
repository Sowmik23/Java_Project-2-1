
package TaxCalculationSystem_Server;

import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PayTax {
    
    private String username,houseTax,CompanyTax,gender,e,ff,d,str,bdt;
    private double houseYear,PropertyYear,IncomeYear,CompanyYear,annualIncome,CompanyIncome,Property,tax;
    private int birthDate;
    
    public PayTax(String name,double h,double p,double i,double c){
        
        username = name;
        houseYear = h;
        PropertyYear = p;
        IncomeYear = i;
        CompanyYear = c;
        tax = 0.0;
        
        try {
            
            setpf();
            setpp();
            
        } catch (IOException ex) {
            
            Logger.getLogger(PayTax.class.getName()).log(Level.SEVERE,null,ex);
        }    
    }
    
    void setpp() throws IOException
    {
        FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\Property.txt");
        String s;
        Scanner input = new Scanner(fr);
        while(input.hasNext())
        {
            System.out.println("I am searching username");
            s = input.nextLine();
            if(s.equals(username))
            {
                System.out.println("I successfully got username and other...");
                houseTax = input.nextLine();
                Property = Double.parseDouble(input.nextLine());
                CompanyTax = input.nextLine();
                CompanyIncome = Double.parseDouble(input.nextLine());            
                annualIncome = Double.parseDouble(input.nextLine());
                System.out.println(annualIncome+" "+CompanyTax+" "+CompanyIncome+" "+Property+" "+houseTax);
                break;
            }
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
        }       
    }
    
    
    void setpf() throws IOException
    {
        FileReader fr = new FileReader("F:\\Java Codes\\JavaApplication25\\src\\javaapplication25\\NewAccount.txt");
        
        String s;
        Scanner input = new Scanner(fr);
        String bdt = "";
        while(input.hasNext())
        {
            s = input.nextLine();
            s = input.nextLine();
            if(s.equals(username))
            {
                bdt = input.nextLine();
                s = input.nextLine();
                gender = input.nextLine();
                s = input.nextLine();
                e = input.nextLine();
                s = input.nextLine();
                ff = input.nextLine();
                d = input.nextLine();
                s = input.nextLine();
                System.out.println(username+" "+bdt+" "+gender+" "+e+" "+ff+" "+d);
                break;
            }
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
            s = input.nextLine();
        }
        System.out.println(bdt);
        String str[] = bdt.split("/");
        birthDate = Integer.parseInt(str[2]);
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date d = new Date();
        String str2 = (String) df.format(d);
        System.out.println(str2);
        str = str2.split("/");
        birthDate = Math.abs(birthDate - Integer.parseInt(str[2]));
        System.out.println("Present age: "+birthDate);
    }
    
    
    String getHouseTax(){
        
        String str = "";
        if(houseTax.equals("Outside City Corporation"))
        {
            houseYear = houseYear*3000.0;
            tax+=houseYear;
            return str.valueOf(houseYear);
        }
        else 
        {
            houseYear = 5000.0*houseYear;
            tax+=houseYear;
            return str.valueOf(houseYear);
        }
    }
    
    String getCompanyTax()
    {
        String str = "";
        if(CompanyTax.equals("Publicly Trade Company"))
        {
            tax +=(CompanyIncome*0.25*CompanyYear);
            CompanyIncome = CompanyIncome*0.25*CompanyYear;
        }
        else if(CompanyTax.equals("None-Publicly Trade Company"))
        {
            tax += (CompanyIncome*0.35*CompanyYear);
            CompanyIncome = CompanyIncome*0.35*CompanyYear;
        }
        else if(CompanyTax.equals("Public Bank"))
        {
            tax += (CompanyIncome*0.40*CompanyYear);
            CompanyIncome = CompanyIncome*0.40*CompanyYear;
        }
        else if(CompanyTax.equals("Non-Public Bank"))
        {
            tax += (CompanyIncome*0.425*CompanyYear);
            CompanyIncome = CompanyIncome*0.425*CompanyYear;
        }
        else if(CompanyTax.equals("Merchant Bank"))
        {
            tax += (CompanyIncome*0.375*CompanyYear);
            CompanyIncome = CompanyIncome*0.375*CompanyYear;
        }
        else if(CompanyTax.equals("Mobile Phone: Public"))
        {
            tax += (CompanyIncome*0.40*CompanyYear);
            CompanyIncome = CompanyIncome*0.40*CompanyYear;
        }
        else if(CompanyTax.equals("Moblie Phone: Non-Public"))
        {
            tax += (CompanyIncome*0.45*CompanyYear);
            CompanyIncome = CompanyIncome*0.45*CompanyYear;
        }
        return str.valueOf(CompanyIncome);
    }
    
    
    String getPropertyTax()
    {
        String str = "";
        if(Property>22500000.0 && Property<=50000000.0)
        {
            Property = Property-22500000.0;
            Property = PropertyYear*(Property/10.0);
            tax+=Property;
            System.out.println(PropertyYear+"pppppppppp  1");
        }
        else if(Property>50000000.0 && Property<=100000000.0)
        {
            Property = Property-22500000.0;
            Property = PropertyYear*(Property*0.15);
            tax+=Property;
            System.out.println(PropertyYear+"pppppppppp  2");
        }
        else if(Property>100000000.0 && Property<=150000000.0)
        {
            Property = Property-22500000.0;
            Property = PropertyYear*(Property*0.20);
            tax+=Property;
            System.out.println(PropertyYear+"pppppppppp  3");
        }
        else if(Property>150000000.0 && Property<=200000000.0)
        {
            Property = Property-22500000.0;
            Property = PropertyYear*(Property*0.25);
            tax+=Property;
            System.out.println(PropertyYear+"pppppppppp  4");
        }
        else if(Property>200000000.0)
        {
            Property = Property-22500000.0;
            Property = PropertyYear*(Property*0.30);
            tax+=Property;
            System.out.println(PropertyYear+"pppppppppp  5");
        }
        else 
        {
            Property = 0;
            tax+=Property;
        }
        
        return str.valueOf(Property);
    }
    
    
    String getIncomeTax()
    {
        String str = "";
        if(ff.equals("Yes"))
        {
            if(annualIncome>425000 && annualIncome<=500000 && birthDate<65 && (gender.equals("Male") || gender.equals("Female")))
            {
                annualIncome = annualIncome-425000;
                annualIncome = IncomeYear*(annualIncome*0.15);
                tax+=annualIncome;
            }
            else if(annualIncome>500000 && annualIncome<=600000 && birthDate<65 && (gender.equals("Male") || gender.equals("Female")))
            {
                annualIncome = annualIncome-425000;
                annualIncome = IncomeYear*(annualIncome*0.20);
                tax+=annualIncome;
            }
            else if(annualIncome>600000 && annualIncome<=3000000 && birthDate<65 && (gender.equals("Male") || gender.equals("Female")))
            {
                annualIncome = annualIncome-425000;
                annualIncome = IncomeYear*(annualIncome*0.25);
                tax+=annualIncome;
            }
            else if(annualIncome>3000000 && birthDate<65 && (gender.equals("Male") || gender.equals("Female")))
            {
                annualIncome = annualIncome-425000;
                annualIncome = IncomeYear*(annualIncome*0.30);
                tax+=annualIncome;
            }
            else 
            {
                annualIncome = 0;
                tax+=annualIncome;
            }
        }
       
        else if(d.equals("Yes"))
        {
            if(annualIncome>375000 && annualIncome<=500000 && birthDate<65 && gender.equals("Male"))
            {
                annualIncome = annualIncome -375000;
                annualIncome = IncomeYear*(annualIncome*0.15);
                tax+=annualIncome;
            }
            else if(annualIncome>500000 && annualIncome<=600000 && birthDate<65 && gender.equals("Male"))
            {
                annualIncome = annualIncome -375000;
                annualIncome = IncomeYear*(annualIncome*0.20);
                tax+=annualIncome;
            }
            else if(annualIncome>600000 && annualIncome<=3000000 && birthDate<65 && gender.equals("Male"))
            {
                annualIncome = annualIncome -375000;
                annualIncome = IncomeYear*(annualIncome*0.25);
                tax+=annualIncome;
            }
            else if(annualIncome>3000000 && birthDate<65 && gender.equals("Male"))
            {
                annualIncome = annualIncome -375000;
                annualIncome = IncomeYear*(annualIncome*0.30);
                tax+=annualIncome;
            }
            else 
            {
                annualIncome =0;
                tax+=annualIncome;
            }
        }
        
        else if(annualIncome>250000 && annualIncome<=400000 && birthDate<65 && gender.equals("Male"))
        {
            annualIncome = annualIncome -250000;
            annualIncome = IncomeYear*(annualIncome/10);
            tax+=annualIncome;
        }
        
        else if(annualIncome>400000 && annualIncome<=500000 && birthDate<65 && gender.equals("Male"))
        {
            annualIncome = annualIncome -250000;
            annualIncome = IncomeYear*(annualIncome * 0.15);
            tax+=annualIncome;
        }
        else if(annualIncome>500000 && annualIncome<=600000 && birthDate<65 && gender.equals("Male"))
        {
            annualIncome = annualIncome -250000;
            annualIncome = IncomeYear*(annualIncome*0.20);
            tax+=annualIncome;
        }
        else if(annualIncome>600000 && annualIncome<=3000000 && birthDate<65 && gender.equals("Male"))
        {
            annualIncome = annualIncome -250000;
            annualIncome = IncomeYear*(annualIncome*0.25);
            tax+=annualIncome;
        }
        else if(annualIncome>3000000 && birthDate<65 && gender.equals("Male"))
        {
            annualIncome = annualIncome -250000;
            annualIncome = IncomeYear*(annualIncome*0.30);
            tax+=annualIncome;
        }
        
        
        else if(annualIncome>300000 && annualIncome<=400000 && (gender.equals("Female") || birthDate>65))
        {
            annualIncome = annualIncome-250000;
            annualIncome = IncomeYear*(annualIncome/10);
            tax+=annualIncome;
        }

        else if(annualIncome>400000 && annualIncome<=500000 && (gender.equals("Female") || birthDate>65))
        {
            annualIncome = annualIncome-250000;
            annualIncome = IncomeYear*(annualIncome*0.15);
            tax+=annualIncome;
        }
        else if(annualIncome>500000 && annualIncome<=600000 && (gender.equals("Female") || birthDate>65))
        {
            annualIncome = annualIncome-250000;
            annualIncome = IncomeYear*(annualIncome*0.20);
            tax+=annualIncome;
        }
        else if(annualIncome>600000 && annualIncome<=3000000 && (gender.equals("Female") || birthDate>65))
        {
            annualIncome = annualIncome-250000;
            annualIncome = IncomeYear*(annualIncome*0.25);
            tax+=annualIncome;
        }
        else if(annualIncome>3000000 && (gender.equals("Female") || birthDate>65))
        {
            annualIncome = annualIncome-250000;
            annualIncome = IncomeYear*(annualIncome*0.30);
            tax+=annualIncome;
        }
        else 
        {
            annualIncome = 0;
            tax+=annualIncome;
        }
        return str.valueOf(annualIncome);
        
    }
    
    String getTax()
    {
        String str="";
        return str.valueOf(tax);
    }
    
}
