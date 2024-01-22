import java.util.Scanner;

public class oorchard {
    static int combination(char[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            char firstChar = arr[i];

            for (int j = i + 1; j < n; j++) {
                char secondChar = arr[j];

                if (firstChar != arr[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (secondChar != arr[k]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ashok = scanner.nextLine();
        String anand = scanner.nextLine();

        char[] as = ashok.toCharArray();
        char[] an = anand.toCharArray();

        int combine_ashok = combination(as, ashok.length());
        int combine_anand = combination(an, anand.length());

        if (combine_ashok == 0 && combine_anand == 0)
            System.out.print("Invalid input");
        else if (combine_ashok > combine_anand)
            System.out.print("Ashok");
        else if (combine_anand > combine_ashok)
            System.out.print("Anand");
        else
            System.out.print("Draw");
    }
}
