import java.util.Scanner;
// Panagram is a sentense using every letter of a given alphabet at least once

public class Pangram {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Panagram word");
        String s = sc.nextLine();
        s.replace(" ", "");
        s.toUpperCase();
        char y[] = s.toCharArray();

         int i = 0;
         while(i != 26){
            if(y[i] == 1){
                i++;

            }
            else{
                System.out.println("this is non PANAGRAM");
                System.exit(0);
            }
         }
         System.out.println("This is a PANAGRAM");

    }
}
