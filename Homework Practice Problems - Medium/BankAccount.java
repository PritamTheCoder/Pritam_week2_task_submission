// Bank Account System Create a class BankAccount with attributes accountHolderName, accountNumber, and balance. Create a constructor to initialize them. 
// Create methods deposit(amount) and withdraw(amount) which modify the balance. Show messages if withdrawal amount exceeds balance.
public class BankAccount{
    String accountHolderName;
    int accountNumber;
    double balance;
public BankAccount(String accountHolderName, int accountNumber, double balance){
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    this.balance = balance;
}
public void deposit(double amount){
    if( amount > 0){
        balance += amount;
        System.out.println("Amount Successfully Deposited!!");
    }else{
        System.out.println("Invalid amount! Cannot deposit.");
    }
}
public void withdraw(double amount){
    if (amount > 0){
        if ( amount <=balance){
            balance -= amount;
            System.out.println("Balance Successfully withdrawed. ");
        }else{
            System.out.println("Insufficient balance. Cannot withdraw the requested amount.");
        }
    }else{
        System.out.println("Invalid amount!");
    }
}
public void displayAccountDetails(){
    System.out.println("Accound Holder: " + accountHolderName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account balance: " + balance);
}
public static void main(String[] args){
    BankAccount account = new BankAccount("John Leoman", 9846111, 1000.00);

    account.displayAccountDetails();
    account.deposit(500);
    account.withdraw(200);
    // this shows Insufficient Balance.
    account.withdraw(1500);
    account.displayAccountDetails();
}
}