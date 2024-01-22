package Array;
import java.util.*;

public class inputArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("put the size of the array");
        int size = sc.nextInt();
        int number[] = new int[size];
        
        for(int i =0; i<size; i++){
            System.out.println("put the values ");
            number[i] = sc.nextInt();
        }

        for(int i = 0; i<size; i++){
            System.out.println("the marks are - "+ number[i]);
            //if the value of the array are not initilize then by default java takes 0 in integer, 0.0 in float, false in boolen and " " - a empty string in case of string array

        }



    }
}
