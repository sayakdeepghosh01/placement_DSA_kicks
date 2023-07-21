import java.util.*;
public class firstLetterCapS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String x = sc.nextLine();
        char y[] = x.toCharArray();
        int size = y.length;
        int i =1;
        y[0] = (char) (y[0] -32);
        while(i!= size){
            if(y[i] == ' '){
                y[i+1] = (char) (y[i+1] -  32);
            }
            ++i;
        }
        System.out.println("this is the input string : "+x);
        System.out.println("this is theconverted line: " +y);
    }
}

