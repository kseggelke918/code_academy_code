package ExampleCode;

public class SavingsAccount {
    double balance; 

    // constructor 
    public SavingsAccount(double startingBalance) {
        balance = startingBalance; 
    }

    public void deposit(double amountToDeposit){
        // Add amount to the balance 
        double updatedBalance = balance + amountToDeposit;
        balance = updatedBalance; 
        System.out.println("You just deposited " + amountToDeposit + " so your balance is now " + balance);
    }

    public void withdraw(double amountToWithdraw) {
        // subtract amountToWithdraw from balance
        double updatedBalance = balance - amountToWithdraw;
        balance = updatedBalance; 
        System.out.println("You just withdrew " + amountToWithdraw + " so your new balance is now " + balance);
    }

    public static void main(String[] args){
        // create a new instance of the SavingsAccount class
        SavingsAccount myAccount = new SavingsAccount(2000);
        System.out.println(myAccount.balance); 
        // would print 2000
        
        // deposit funds into account with the deposit method
        myAccount.deposit(100);
        System.out.println(myAccount.balance); 
        // would print 2100

    }
}

// can reassign the balance variable by using the assignment operator, =, again
