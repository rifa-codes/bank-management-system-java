import java.util.Scanner;

class BankAccount{
    String name;
    int accountNumber;
    double balance;
    BankAccount(String n,int accNo,double bal){
        name=n;
        accountNumber=accNo;
        balance=bal;
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount Deposited:"+amount);
    }
    void withdraw(double amount){
        if (amount>balance){
            System.out.println("insufficient balance");

        }
        else{
            balance=balance-amount;
            System.out.println("BAlance:"+balance);
        }
    }
    void checkBalance(){
        System.out.println("Balance:"+balance);
    }


}
public class Banksystem {
    static void main() {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=t.nextLine();
        System.out.println("Enter account number:");
        int accNo=t.nextInt();
        System.out.println("Enter the balance:");
        double balance= t.nextDouble();
        BankAccount obj=new BankAccount(name,accNo,balance);
        int choice;
        do {
            System.out.println("\n1.Deposit 2.withdraw 3.check Balance 4.Exit");
            System.out.println("enter choice:");
            choice = t.nextInt();
            if (choice == 1) {
                System.out.println("Enter amount: ");
                double amt = t.nextDouble();
                obj.deposit(amt);
            } else if (choice == 2) {
                System.out.println("Enter the amount:");
                double amt = t.nextDouble();
                obj.withdraw(amt);
            } else if (choice == 3) {
                obj.checkBalance();
            }

        }while (choice!=4);
            t.close();

    }
}
