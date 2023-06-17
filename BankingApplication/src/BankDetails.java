import java.util.Scanner;

public class BankDetails {
    private String account_No;
    private String accountHolder_Name;
    private String account_type;
    private long balance;
    Scanner scanner=new Scanner(System.in);
    //Method to open new Account
    public void openAccount(){
        System.out.println("Enter Account Number:");
        account_No=scanner.next();
        System.out.println("Enter Account Type:");
        account_type=scanner.next();
        System.out.println("Enter Account Holder Name:");
        accountHolder_Name=scanner.next();
        System.out.println("Enter Balance:");
        balance=scanner.nextLong();

    }
    //method to display account Details
    public void showAccount(){
        System.out.println("Name of account holder: " + accountHolder_Name);
        System.out.println("Account no.: " + account_No);
        System.out.println("Account type: " + account_type);
        System.out.println("Balance: " + balance);

    }
    //method to deposit money
public void depositMoney() {
    long amount;
    System.out.println("Enter amount you want to deposit:");
    amount=scanner.nextLong();
    balance=balance+amount;

}
//method to withdraw amount
    public void withdrawAmount(){
        long amount;
        System.out.println("Enter the amount u want to withdraw:");
        amount=scanner.nextLong();
        if(balance>=amount){
            balance=balance-amount;
        System.out.println("Balance after Withdrawal:"+balance);
        }else{
            System.out.println("Insufficient funds" + amount  + "Transcation Failed:");
        }
    }
    //method to search account No
    public boolean search(String acc_No){
        if(account_No.equals(acc_No)){
           showAccount();
           return (true);
        }
        return (false);
    }

}

