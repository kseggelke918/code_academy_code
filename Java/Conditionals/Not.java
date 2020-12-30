package Conditionals;

public class Not {
   !false;
   // true 
   !true; 
   // false 
   
   boolean hasPrereq = false; 

   if (hasPrereq) {
       // do nothing
   } else {
       System.out.println("must complete prerequisite course!");
   }

   // the above code block is weird, but does what we want...a better 
   // way would be to use the NOT operator (!)

   if (!hasPrereq){ 
       System.out.println("Must complete prerequisite course!");
   }

}

// works on a single value
// evaluates to the opposite voolean to which it's applied

// useful for expressing our intent clearly in programs
// ex) sometimes we need the opposite behavior of an if-then: run 
// a code block only if the condition is false
