public class BankAccount implements A {
    String accountHolderName ;
    String bankName;
    double accountBalance;
   //constructor
    BankAccount(String accountHolderName, String bankName, double initialBalance){
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }


    @Override
    public double getBalance() {
        double balance= accountBalance;
        return balance;
    }

    @Override
    public double deposit(double amt) {
        System.out.print("Balance after deposit: ");
        return accountBalance+amt;
    }

    @Override
    public double withdraw(double amt) {
        System.out.print("Balance after withdraw: ");
        return accountBalance-amt;
    }

    void display(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Balance: " + accountBalance);
    }

    public static void main(String[] args) {
     BankAccount b =  new BankAccount("deepak baghel", "union bank", 25000);
     b.display();
     System.out.println(b.deposit(2000));
     System.out.println(b.withdraw(2000));
        System.out.println("============================");

     BankAccount b1 = new BankAccount("Brijesh baghel", "HDFC", 27000);
        System.out.println("Initial Balance is : "+b1.deposit(2000));
        System.out.println(b1.deposit(2000));
        System.out.println(b1.withdraw(2000));
        System.out.println("============================");

     BankAccount b2 = new BankAccount("Shivam baghel", "SBI", 22000);
        System.out.println("Initial Balance is : "+b2.withdraw(2000));
        System.out.println(b2.withdraw(2000));
        System.out.println(b2.withdraw(2000));



    }
}
//interface
interface A {

    double getBalance();

    double deposit(double amt);

    double withdraw(double amt);
}