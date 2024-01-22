// Print N to 1 using Recursion-
import java.util.*;

public class ProbThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the Nth elemet: " );
        int n = sc.nextInt();
        display(1, n);

    }
    static void display(int k, int n){
        if(k>n){
            return;
        }
        System.out.println(n);
        display(k, n-1);

    }
}
