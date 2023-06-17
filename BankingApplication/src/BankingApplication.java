import java.util.Scanner;

public class BankingApplication {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
           //create initial accounts
        System.out.println("How many number of customers do you want to input? ");
        int n=scanner.nextInt();
        BankDetails bankDetails[]   =new BankDetails[n];
        for (int i=0;i< bankDetails.length;i++){
            bankDetails[i]=new BankDetails();
            bankDetails[i].openAccount();
        }
        // loop runs until number 5 is not pressed to exit
        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Enter your choice: ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    for(int i=0;i<bankDetails.length;i++){
                        bankDetails[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = scanner.next();
                    boolean found = false;
                    for (int i = 0; i < bankDetails.length; i++) {
                        found = bankDetails[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter account No.:");
                     ac_no=scanner.next();
                     found=false;
                     for (int i=0;i<bankDetails.length;i++){
                         found=bankDetails[i].search(ac_no);
                         if(found){
                             bankDetails[i].depositMoney();
                             break;
                         }
                     }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = scanner.next();
                    found = false;
                    for (int i = 0; i < bankDetails.length; i++) {
                        found = bankDetails[i].search(ac_no);
                        if (found) {
                            bankDetails[i].withdrawAmount();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...");
                    break;
            }
        }
        while (ch != 5);

    }
}
