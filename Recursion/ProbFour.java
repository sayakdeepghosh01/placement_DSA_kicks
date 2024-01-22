//Sum of first N numbers in Recursion- 

import java.util.*;

public class ProbFour {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth numebr: ");
        int n = sc.nextInt();
        sum(n,0);

    }
    static void sum(int n, int result){
       // int result =0;
        // for(int i =1; i<=n;i++){
        //     result += i;
            
        // }
        if(n<1){
            System.out.println("Sum of first " +n+"th element is : "+result);
            return;
        }
        //Function call to increment sum by i till i decrements to 1.
        sum(n-1,result+n);
        //System.out.println("Sum of "+n+"th element is : "+result);
        
    }
}
