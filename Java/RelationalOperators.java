public class RelationalOperators {
    public static void main(String[] args) {
        double balance = 20000.01; 
        double amountToWithdraw = 5000.01; 
        System.out.println(amountToWithdraw < balance);
        // would print true b/c amountToWithdraw is less than the balance
        // Can also store the true/false in a variable
        boolean enoughFunds = amountToWithdraw < balance;
        System.out.println(enoughFunds);

        // Use relational operator == to see if 2 variables are equal
        double paycheckAmount = 620; 
        double calculatedPaycheck = 15.50 * 40; 
        System.out.println(paycheckAmount == calculatedPaycheck);
        // prints true b/c they are equal

        // to check if 2 variables are not equal, use !=
        double secondBalance = 20000.0; 
        double amountToDeposit = 620; 
        double updatedBalance = secondBalance + amountToDeposit; 
        boolean balanceHasChanged = balance != updatedBalance;
        // holds true b/c balance does not equal the updated balance

        // much like < >, you can use <= and >= to be inclusive
        double secondPayCheckAmount = 620; 
        double secondCalculatedPaycheck = 15.50 * 40; 
        System.out.println(secondPayCheckAmount >= secondCalculatedPaycheck);
        // would return true since they are equal


    }
    
}

// Java has relational operators for numeric datatypes that 
// make boolean comparisons < > == != >= <=