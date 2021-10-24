package BankingApplication;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    //Osztály létrehozásakor a tranzakció kezdőértékének nagyobbat kell megadni, mint 0,
    // ez esetben történik meg az ArrayList-hez a hozzáadás
    public Customer(String name, double transaction) {
        this.name = name;
        if(transaction > 0)
            addTransaction(transaction);
        else
            addTransaction(0);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}
