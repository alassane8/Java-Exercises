/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author wadea
 */
public class Customer extends Person{
    private int customerNumber;
    private boolean mailingList;
    
    public Customer(String pn, String adr, int num, int cn, boolean ml){
        super(pn, adr, num);
        customerNumber = cn;
        mailingList = ml;
    }
    
    public boolean getMailingList(int a){
        if (a == 1){
            mailingList = true;
        }
        else if (a == 2){
            mailingList = false;
        }
        return mailingList;
    }
    
    public int getCustomerNumber(){
        return customerNumber;
    }
}
