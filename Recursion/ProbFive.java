// Factorial of first N element-

import java.util.*;

public class ProbFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How far you want the factorial result: ");
        int n = sc.nextInt();
        facto(n, 1);
    }
    static void facto(int n, int result){
        if(n<1){
            System.out.println("Factorial of the number is : " + result);
            return;
        }
       //logic
        facto(n-1, result*n);
    }
}
