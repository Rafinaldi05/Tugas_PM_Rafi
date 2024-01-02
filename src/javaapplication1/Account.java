
import static java.lang.System.out;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Account {
   String name;
   String address;
   double balance;
   
   public void display() {
       out.print(name);
       out.print(" (");
       out.print(address);
       out.print(") has $");
       out.print(balance);
   }
   
   public double getInterest(double percentageRate) {
       return balance * percentageRate / 100.00;
   }
}
