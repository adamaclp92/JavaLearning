package Banking2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String branchName){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.newCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i < this.branches.size(); i++) {
            Branch existingBranch = this.branches.get(i);
            if(existingBranch.getName().equals(branchName)){
                return existingBranch;
            }
        }
        return null;
    }

    public void listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Fiók - " + branchName);
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Vevő: " + branchCustomer.getName());
                if(showTransactions){
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j <transactions.size(); j++) {
                        System.out.println("Érték: " + transactions.get(j));
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
