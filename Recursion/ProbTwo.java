// Print 1 to N using Recursion-  
import java.util.*;
public class ProbTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth number :" );
        int n = sc.nextInt();
        display(1, n);
    }
    static void display(int k, int n){
        
       if(k > n){
        return;
       }
       System.out.println(k);
       display(k+1, n);        
    }
}
