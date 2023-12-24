/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;
import java.util.Scanner;

/**
 *
 * @author wadea
 */
public class Demo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definiton
        String pn;
        String adr; 
        int a;
        int num;
        int cn;
        boolean ml = false;
        int cp;
        double cd = 0;
        
        //Input customer informations
        System.out.println("Customer's name : ");
        pn = input.next();
        System.out.println("Customer's adress : ");
        adr = input.next();
        System.out.println("Customer's phone number: ");
        num = input.nextInt();
        System.out.println("Customer's number: ");
        cn = input.nextInt();
        System.out.println("Customer's mailing list : "
                + "\n1. YES"
                + "\n2. No");
        a = input.nextInt();
        System.out.println("Amount of purchases ? ");
        cp = input.nextInt();
        
        //Creating a customer
        PreferredCustomer custo = new PreferredCustomer(pn,adr,num,cn,ml,cp,cd);
        
        //Display customer informations
        System.out.println("CUSTOMER'S INFORMATIONS :");
        System.out.println("Customer's name         : " + custo.getName());
        System.out.println("Customer's adress       : " + custo.getAdress());
        System.out.println("Customer's phone number : " + custo.getNumber());
        System.out.println("Customer's number       : " + custo.getCustomerNumber());
        System.out.println("Customer's mailing list : " + custo.getMailingList(a));
        System.out.println("Amount of purchases     : $" + custo.getCustomerPurchases());
        System.out.println("Discount                : -" + custo.getCustomerDiscount()+"%");
    }
}
