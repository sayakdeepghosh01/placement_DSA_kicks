import java.util.*;
//for each loop example, this loop is only work on java


public class forEach {
    public static void main(String[] args){
       int a[] = {10,20,30,40,50};
       int size = a.length;

       int sum = 0;
        for(int data : a){
            sum = sum + data;
        }
        System.out.println("Sum of digits are : "  + sum);
    }
}
