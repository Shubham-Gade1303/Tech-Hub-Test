//Q5. Write a Java program to create a banking application to withdraw money with    exception handling. 
// Description:Accept balance and withdraw amount. If the withdrawal amount is greater than the balance, 
// throw a custom exception.
//  Input:  Enter balance: 5000  
// Enter withdraw amount: 7000
//  Output:Insufficient Balance Exception 

import java.util.*;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String s){
        super(s);
    }
}
public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Balanace: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdraw balanace: ");
        double withdraw = sc.nextDouble();

        try{
            if(withdraw>balance){
                throw new InsufficientBalanceException("Insufficient Balanc eException ");
            }

            balance= balance-withdraw;
            System.out.println("Remaining Balance: "+ balance);
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

    }
}