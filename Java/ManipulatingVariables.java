public class ManipulatingVariables {
    public static void main(String[] args) {
        // declare initial balance 
        double bankBalance = 2000.99;
        // declare deposit amount 
        double depositAmount = 100.00;
        // store result of calculation in new variable 
        double updatedBalance = bankBalance + depositAmount;

        // subtracting works the same
        double withdrawAmount = 500; 
        double updatedBalance = bankBalance - withdrawAmount;  
        
        // multiplication 
        double paycheckAmount = 40 * 15.50;
        // = 620.0

        // division 
        double balance = 20010.5; 
        double hourlyRate = 15.5; 
        double hoursWorked = balance / hourlyRate; 
        // hoursWorked = 1291.0
        // Division has different results with integers - the / operator
        // does integer division, which means that any remainder is lost
        int evenlyDivided = 10 / 5; 
        // evenlyDivded holds 2 b/c 10/5 == 2
        int unevenlyDivided = 10 / 4; 
        // INTS CANNOT STORE DECIMALS - DROPS REMAINDER, MAKES RESULT FIT INT TYPE
        // unevenlyDivided = 2 b/c 10 / 4 == 2.5 and the remainder drops

        // Modulo % gies us the remainder after 2 numbers are divided.
        int cookiesBaked = 10; 
        int cookiesLeftOver = 10 % 3; 
        // cookiesLeftOver == 1

        // Can use modulo to see if a number is even or odd
        // dividing an even number by 2 will have a remainder of 0, odd 
        // will have a remainder o 1
        int even = 8 % 2; 
        // == 0, even
        int odd = 7 % 2; 
        // == 1, odd  
    }
}

//Java has built in math operations that perform calculations on numberic 
// values
// math works with int and double
