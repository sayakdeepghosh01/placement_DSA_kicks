import java.util.*;

public class upperToLower{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter a String - ");  
        String x = sc.nextLine();  
        
        char y[] = x.toCharArray();
        int size = y.length;
        
        int i = 0;
        while(i!=size){
            y[i] = (char) (y[i] +  32); // i use 32 because Capital and small letter ascii value difference is 32
            ++i;
        }
        System.out.println(x);
        System.out.println(y);
    }
}