
package arrays;
import java.util.Scanner;
class BankAccount 
{
    double balance=0;
    public BankAccount(double amount){
        balance=amount;
    }

  double deposit(int depAmount)throws NegativeNumberException
    {
        if(depAmount<0)
        {
            throw new NegativeNumberException("enter a valid amount");
            
        }
        balance+=depAmount;
        return balance;
    }   
  double withdraw(int withAmount)throws InsufficientFundException,NegativeNumberException
   {
        if(withAmount<0)
           {
            throw new NegativeNumberException("enter a valid amount");
           }
        if(withAmount>balance)
           {
          throw new InsufficientFundException("please check balance before withdraw");  
           }
        balance-=withAmount;
        return balance;
      
    }
}
class NegativeNumberException extends RuntimeException
{
  NegativeNumberException(String msg){
  super(msg);
}
}
class InsufficientFundException extends RuntimeException
{
    InsufficientFundException(String msg){
      super(msg);  
    } 
}
public class Customer{
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        BankAccount b = new BankAccount(1000);
        System.out.println("Bank Account Created succesfully");
       System.out.println("your total Available balance:"+b.balance);
        
        while (true) {
            System.out.println("Enter transaction type:");
            System.out.println("1.Deposit 2.Withdraw 3.Check balance 4.Exit");
            System.out.println("Enter your choice: ");
            int ch = scan.nextInt();
        switch(ch)
            {
            case 1:
                System.out.println("Enter Deposite Amount:");
                int depAmount=scan.nextInt();
               // b.deposit(depAmount);
                b.balance = b.deposit(depAmount);

                System.out.println("Deposite successfully Available balance:"+b.balance);
                break;
            case 2:
                System.out.println("Enter withdraw Amount :");
                int withAmount=scan.nextInt();
                b.balance=b.withdraw(withAmount);
                System.out.println("withdraw successfully Available balance:"+b.balance);
                break;
            case 3:
                System.out.println("check balance :"+b.balance);
                break;
            case 4:
               System.out.println("Exiting...");
                break;
            default:
                System.out.println("select valid option");
        
    }
        
        
    }

    }  
}
