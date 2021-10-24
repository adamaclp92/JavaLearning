package com.adamrago;

public class Main {
    public static void main(String[] args) {
        Account adamsAccount = new Account("Adam");
        adamsAccount.deposit(1000);
        adamsAccount.withdraw(500);
        adamsAccount.withdraw(-200);
        adamsAccount.deposit(-20);
        adamsAccount.deposit(8000);
        adamsAccount.calculateBalance();

        System.out.println("Balance on account is " + adamsAccount.getBalance());

        //adamsAccount.balance = 10000; //ezt kell elkerülni az access modifyinggal. Ez azért lehetséges, mert public a balance, és így minden más osztály hozzáfér

        //Az alapértelmezett védelmi szint a package-private az osztályoknak (és az azon belüli cuccoknak) és interfaceknek. Az interfacek változóinak és metódusainak a public. Ezt nem is kell kiírni a változók elé. Azt jelenti, hogy a saját package-ben található cuccok érik el.
        //public: bármilyen más osztályból elérhető, még más package-ben is
        //private: a saját osztályában érhető el (meg az alosztályokban)
        //protected: bárhol a saját package-en belül, de még az alosztályokban is, ha azok más package-ben is vannak


    }
}
