public class Equals {
    public static void main(String[] args) {
        // to use .equals() on a String, using . and pass it to the String 
        // to compare against in paranthese: 
        String person1 = "Paul";
        String person2 = "John"; 
        String person3 = "Paul";

        System.out.println(person1.equals(person2));
        // prints false b/c "Paul" != "John"

        System.out.println(person1.equals(person3));
        // prints true since "Paul" == "Paul"
    }
    
}

// With objects like strings, we can't use primitive equality operators
// To test equality with objects, we use a built-in method called .equals()
// .equals() is used to match strings (ex - verify usernames match, etc)
// When comparing objects, == will work occasionally, but the reaso why it 
// sometimes works has to do with how objects are stored in memory and 
// this isn't something to rely on - USE .equals()

