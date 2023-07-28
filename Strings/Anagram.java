import java.util.*;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st anagram word");
        System.out.println("Enter 2nd anagram word");
        String s = sc.nextLine();
        String a = sc.nextLine();
        s = s.replace(" ", "");
        a = a.replace(" ", "");
        s = s.toLowerCase();
        a = a.toLowerCase();
        char x[] = s.toCharArray();
        char y[] = a.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);

        Boolean result = Arrays.equals(x,y);
        if(result == true){
            System.out.println("Sring is  an anagram");

        }
        else{
            System.out.println("String is not an anagram ");
        }
    }
}
