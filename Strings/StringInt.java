import java.util.*;
public class StringInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string which consist integers: ");
        String x = sc.nextLine();
        // char y[] = x.toCharArray();
        // int size = y.length;
        int size = x.length();

        int i = 0;
        while(i!=size){
            if(x.charAt(i) >= '0' && x.charAt(i) <= '9'){
                ++i;

            }
            else{
                System.out.println("Not an integer found ");
                System.exit(0);
            }
           
        }
         System.out.println("Integer Found");

    }
}
