package Array;

public class equilibrium {
    // function to find the equilibrium index
    static int eqbmindex(int array[], int n) {
        int i, j;
        // lsum denotes the left sum and rsum denotes the right sum
        int lsum, rsum;
        for (i = 0; i < n; ++i) {
            lsum = 0;
            // finds the sum upto current index (exclude)
            for (j = 0; j < i; j++)
                lsum = lsum + array[j];
            rsum = 0;
            // finds the sum from current index to last index (exclude)
            for (j = i + 1; j < n; j++)
                rsum = rsum + array[j];
            // if rsum and lsum are equal, returns i (equilibrium index), else returns -1
            if (lsum == rsum)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 9, 3, 7, 6, 8, 1, 10 };
        int arraysize = array.length;
        System.out.print("Equilibrium Index is: ");
        System.out.println(eqbmindex(array, arraysize));
    }
}
