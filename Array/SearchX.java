package Array;
import java.util.*;

public class SearchX {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("put the array size");
        int size = sc.nextInt();
        int number[] = new int[size];
//taking input form user:
        for(int i =0;i<size;i++){
            System.out.println("put the value in arrays: ");
            number[i] = sc.nextInt();
        }
        System.out.println("The number you want to search--");
        int x = sc.nextInt();
// print the value of the array indix
        for(int i =0;i<number.length;i++){
            if(number[i] == x){
                System.out.println("the array index of X is : "+ i);
            }
            else if(number[i] !=x){
                System.out.println("the Value not found- ");
            }
        }
    }
}
