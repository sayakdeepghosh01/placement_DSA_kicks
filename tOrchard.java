import java.util.Scanner;

public class tOrchard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ashok = scanner.nextLine();
        String anand = scanner.nextLine();

        int countAshok = countPossibilities(ashok);
        int countAnand = countPossibilities(anand);

        if (countAshok == 0 && countAnand == 0) {
            System.out.println("Invalid input");
        } else if (countAshok > countAnand) {
            System.out.println("Ashok");
        } else if (countAnand > countAshok) {
            System.out.println("Anand");
        } else {
            System.out.println("Draw");
        }
    }

    private static int countPossibilities(String row) {
        int n = row.length();
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            char tree1 = row.charAt(i);
            char tree2 = row.charAt(i + 1);
            char tree3 = row.charAt(i + 2);

            if (isValidSet(tree1, tree2, tree3)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isValidSet(char tree1, char tree2, char tree3) {
        return (tree1 == 'M' && tree2 == 'M' && tree3 == 'L') ||
               (tree1 == 'L' && tree2 == 'M' && tree3 == 'M') ||
               (tree1 == 'M' && tree2 == 'L' && tree3 == 'L');
    }
}
