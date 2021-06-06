package Constructors;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(1111, 1, "Default name", "Default email", "Default phone number");
        System.out.println("Empty constructor called!");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance= balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        System.out.println("Constructor with parameters called!");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(1111, 1, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int depositFunds(int funds){
        if(funds > 0)
            return this.balance += funds;
        else
            return this.balance;
    }

    public int withdrawFunds(int funds){
        if(funds > 0 && this.balance - funds >= 0)
            return this.balance -= funds;
        else
            return this.balance;
    }


}
