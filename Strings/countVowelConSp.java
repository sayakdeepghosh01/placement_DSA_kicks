import java.util.*;
public class countVowelConSp {
    public static void main(String[] args){
        int vowcnt = 0;
        int conscnt = 0;
        int splcnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the String: ");
        String x = sc.nextLine();
        x=x.toUpperCase(); 
        char y[] = x.toCharArray();
        int size = y.length;
        int i =0;
        while( i !=size ){
            if (y[i]>='A' && y[i]<='Z'){
                if(y[i] == 'A' || y[i] == 'E'|| y[i] == 'I' || y[i] == 'O'|| y[i] == 'U'){
                    ++vowcnt;
                }
                else{
                    ++conscnt;
                }
            }
            else{
                ++splcnt;
            }
        }
        System.out.println("the input String is : "+x);
        System.out.println("total number of vowel is "+vowcnt);
        System.out.println("total number of consonent is "+conscnt);
        System.out.println("total number of special charecter is "+splcnt);
    }
}
