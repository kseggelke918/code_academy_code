public class StringConcatenation {
    public static void main(String[] args){
        String username = "PrinceNelson";
        System.out.println("Your username is: " + username)

        // can also use a primitive datatype as a second variable
        int balance = 10000; 
        String message = "Your balance is: " + balance;
        System.out.println(message);
    }
    
}

// ex) want to print out a variable but also want to describe what we print out.
// Like 'Your username is: <username>'
// with the value of username displayed
// the + that we use to add numbers can also be used to concatenate strings
