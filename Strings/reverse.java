public class reverse {
    public static void main(String[] args){
        String x = "ABSDEFGHIJKLMNOPQRSTUVQXYZ";
        char y[] = x.toCharArray();
        int size = y.length;
        char a[] = new char[size];
        int i =0 ;
        int r = size;
        while(i != size){
            a[r-1-i] = y[i];
            ++i;
        }
        System.out.println(y);
        System.out.println(a);
    }
}
