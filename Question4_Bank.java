import java.io.Serializable;
import java.util.Scanner;




public class Question4_Bank {
    public static void main(String[] args) {
       Account a =  new Account(1234, 1111);
 
         try{
         new Perform().doOperations(a);
         
         }
         catch(Exception e){
            System.out.println(e.getMessage());
         }
        
    }
}
class Perform{
    public void doOperations(Account account) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account number::");
        int ac = sc.nextInt();
        System.out.println("Enter the pin:: ");
        int pin = sc.nextInt();

         if(ac!=account.getAccountNumber() || pin!=account.getPin())
         {
       
           sc.close();
           throw new RuntimeException("Wrong Credentials");
         }
        while(true){
        System.out.println("Enter the Choice of your Operation  \n1.Deposit \n2.Withdraw \n3.Check Balance \n4.exit");
        int option  = sc.nextInt();

        switch(option){
            case 1:
               System.out.println("Enter the amount to be deposited ?");
               double amount = sc.nextDouble();
               account.depositAmount(amount);
               break;
            case 2:
                System.out.println("Enter the amount to Withdraw");
                double cash = sc.nextDouble();
                account.withDrawMoney(cash);
                break;
            case 3:
                 System.out.println("The account Balance is::"+account.getBalance());
                 break;
            case 4:
                sc.close();
                System.exit(0);
            default:
              System.out.println("Nothing");
        }
        }
  
    }
}

class Account implements Serializable{

    private Integer accountNumber;
    private  Double balance;
    private Integer pin;

    Account(Integer accountNumber,Integer pin){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance =500.0;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }
    public  Double getBalance() {
        return balance;
    }
    public Integer getPin() {
        return pin;
    }

  public Double depositAmount(Double amount){      
        this.balance = this.balance + amount;
        return this.balance;
  }

  public Double withDrawMoney(Double amount){

   if(this.balance<=amount){
    throw new RuntimeException("Balance is Not sufficient");
   }
   this.balance = this.balance - amount;



    return this.balance;
  }

}
