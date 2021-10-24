package BankingApplication;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers =  new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //paraméterként a customer nevét, és egy kezdeti tranzakciót kell megadni. Ha ez a customer már létezik, akkor false,
    //különben hozzáadja a customert a list-hez
    public boolean newCustomer(String customerName, double transaction){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, transaction));
            System.out.println(customerName + " sikeresen hozzáadva a vevő listához. Kezdő tranzakció: " + transaction);
            return true;
        }
        System.out.println("Ez a vevő már szerepel a listában: " + customerName);
        return false;

    }

    //ha létezik a paraméterben megadott vevőnév, akkor hozzáadja a tranzakciót, különben nem
    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer existingCustomer = findCustomer(customerName);
       if(existingCustomer != null){
           existingCustomer.addTransaction(transaction);
           System.out.println("A tranzakció (" + transaction + ") sikeresen hozzáadva " + customerName + " vevőhöz.");
           return true;
        }
        System.out.println("Nincs ilyen nevű vevő: " + customerName);
        return false;
    }

    //ha megadjuk a customer nevét, akkor a customers arraylist-ben megvizsgálja, hogy megtalálható-e benne az a customer.
    //Ha igen, akkor azt az adott i-edik customert adja vissza, különben null-t.
    private Customer findCustomer(String customerName){
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if(customer.getName().equals(customerName))
                return customer;
        }
        return null;
    }
}
