//print Name 5 times
import java.util.*;
public class ProbOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: " );
        String name = sc.nextLine();
        printName(name, 5);

    }
    static void printName(String name, int remaining){
        if(remaining == 0){
            return;
        }
        System.out.println(name);
        printName(name, remaining-1);
    }

}
