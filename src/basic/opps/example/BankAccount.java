package basic.opps.example;
///////   Encapsulation Example

public class BankAccount {
    private String accountNumber; // Encapsulated variable
    private double balance; // Encapsulated variable

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for balance
    public void setBalance(double newBalance) {
        // Additional logic for validation can be added here
        this.balance = newBalance;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Creating an instance of the BankAccount class
        BankAccount account = new BankAccount("123456789", 1000);

        // Accessing encapsulated data using getter methods
        System.out.println("Account Number: " + account.getAccountNumber()); // Output: Account Number: 123456789
        System.out.println("Balance: " + account.getBalance()); // Output: Balance: 1000

        // Trying to access encapsulated data directly (outside the class)
        // This will not work due to encapsulation
        // System.out.println(account.accountNumber); // This will result in a compile-time error

        // Trying to modify encapsulated data using setter method
        account.setBalance(1500);
        System.out.println("New Balance: " + account.getBalance()); // Output: New Balance: 1500
    }
}
