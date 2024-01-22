import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        for(int p = 0;p<size;p++){
             System.out.println("enter the element in th earray: ");
             arr[p] = sc.nextInt();
        }
        int i;
        int j;
        int f=0;
        for(i= 0; i<size; i++){
            f=1;
            for(j = i+1; j<size; j++){
                if(arr[j]==arr[i]){
                    //System.out.println("it consists duplicate");
                    f++;
                    break;
                }
                else{
                    //System.out.println("No duplicate");
                    break;
                }
           
            }
        //i=j-1;
        // if(f>0){
        //     //System.out.println(arr[i]+"-->"+f);
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("-1");
        // }
        if(f!=0){
            System.out.println("Duplicate value is"+ arr[j]);
        }
            
        }
        // if(f!=0){
        //     System.out.println("Duplicate found");
        // }

    }
}
