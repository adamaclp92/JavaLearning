package BankingApplication;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    //ha nem talál a paraméterben megadott név alapján fiókot, akkor hozzáadja, különben pedig false
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            System.out.println(branchName + " fiók sikeresen hozzáadva " + this.name + " bankhoz.");
            return true;
        }
        System.out.println("Már létezik " + branchName + " nevű fiók.");
        return false;
    }

    //ha a paraméteben átadott fióknév létezik, akkor Branch osztály newCustomer
    public boolean addCustomer(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null)
            return branch.newCustomer(customerName,transaction);
        return false;
    }


    //a paraméterben átadott fióknév nem létezik, akkor Branch osztály addCustomerTransaction
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null)
            return branch.addCustomerTransaction(customerName,transaction);
        return false;
    }

    //az i-edik branch-el tér vissza, ha a branch arraylist neve megegyezik a paraméterben átadott névvel
    private Branch findBranch(String branchName){
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(branchName))
                return branch;
        }
        return null;
    }

  //Ha létezik a paraméterben átadott fiók, akkor végigmegyünk a fiókhoz tartozó vevőkön, és kiírjuk a neveiket
    //*ha a paraméter igaz, akkor a az adott ve3vőhöz tartozó tranzakciókon is végigmegyünk
    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Vevő: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Tranzakciók:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Érték "  + transactions.get(j));
                    }
                    System.out.println();
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
