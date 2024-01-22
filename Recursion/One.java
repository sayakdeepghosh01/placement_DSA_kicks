// Introduction of recursion-
// Recursion is a process in which a method calls itself continuously.
// A method in java that calls itself is called recursive method.
// It makes the code compact but complex to understand.
// Base condtion- The condition when the recursion will stop.
// StackOverflowError- If the base condition is not reached or not defined, StackOverflowError is thrown.
// recursion tree- It is a tree in which each node represents a method call. The root of the tree represents the initial call and the branches of the tree represent subsequent calls.

// Code- 
public class One {
    private int count = 0;
    public static void main(String[] args) {
        One one = new One();
        one.hello();
    }
    void hello() {
        System.out.println(count);
        count++;
        while(count < 5){
            hello();
        }

        //hello();
    }
    // it will print unlimited "Hello" if we do not use any condition(here i use a while and a condition is count<5 that why it will print 0-4) and this is stack overflow;
}
