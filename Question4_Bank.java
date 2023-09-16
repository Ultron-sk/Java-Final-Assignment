import java.io.Serializable;

public class Question4_Bank {
    
}
class Account implements Serializable{

    private Integer accountNumber;
    private static Double balance;
    private Integer pin;

    static{
        balance = 500.0;
    }
    Account(Integer accountNumber,Integer pin){
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }
    public static Double getBalance() {
        return balance;
    }
    public Integer getPin() {
        return pin;
    }

    

}
