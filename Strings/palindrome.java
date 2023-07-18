import java.io.*;

class palindrome {
    public static void main(String[] args) {
        String  x = "rAR";
        x = x.replace(" ",""); // if the input string contain some space in between then replace it by null or elimineted;
        x = x.toUpperCase(); // if the string contain any upper case or lower case charecter in it then convert it fully in uppercase or lowercase withh these methods;

        char y[] = x.toCharArray();

        int size = y.length;
        int i = 0 ;
        char a[] =  new char[size]; 
        int r = size;
        while(i != size){
            a[r-1-i] = y[i];
            ++i;
        }
        System.out.println(y);
        System.out.println(a);
        System.out.println(x); 
        while(i!=size){
            
        if (a[i] != y[i]){
            System.out.println("This not is a palindrome");
            System.exit(0);
        }
        else{
            ++i;
            continue;
           
        }

        
    }
    System.out.println("This is a palindrome"); 
    }
}
