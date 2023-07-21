import java.util.*;
public class firstLetterCapS {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String x = sc.nextLine();
        char y[] = x.toCharArray();
        int size = y.length;
        int i =0;

        while(i!= size){
            if(y[i]!=' '){
                y[i] = (char) (y[i]-32);
            }
            ++i;
        }
        System.out.println("this is the input string : "+x);
        System.out.println("this is theconverted line: " +y);
    }
}

