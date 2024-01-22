package Array;

public class defineArray {
    public static void main(String[] args){
        //type[] arrayName = new type[size] - thi sis the array declaration structure
        int[]marks = new int[3];
        //another type of delcaration is - 
        // int marks[] = new int[3];
        marks[0] = 97;
        marks[1] = 80;
        marks [2] = 92;
        System.out.println("the marks are - "+ marks[0]);
        System.out.println("the marks are - "+ marks[1]);
        System.out.println("the marks are - "+ marks[2]);


        // using a loop print all elements from the aray
        for(int i=0; i<3;i++){
            System.out.println("the marks are - "+ marks[i]);
        }

    }
}