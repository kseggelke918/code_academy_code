public class RelationalOperators {
    public static void main(String[] args) {
        double balance = 20000.01; 
        double amountToWithdraw = 5000.01; 
        System.out.println(amountToWithdraw < balance);
        // would print true b/c amountToWithdraw is less than the balance
        // Can also store the true/false in a variable
        boolean enoughFunds = amountToWithdraw < balance;
        System.out.println(enoughFunds)
    }
    
}

// Java has relational operators for numeric datatypes that 
// make boolean comparisons < > 