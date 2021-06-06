package Constructors;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 100.0, "Default email address");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default email address");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        if(creditLimit > 0)
            return creditLimit;
        return 1;
    }

    public String getEmail() {
        return email;
    }
}
