package Array;
public class unionIntersection {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5,6};
        int arr2[] = {2,3,4,5,7};
        //int m = sizeof(arr1)/sizeof(arr2[0])
        //int m=0,n=0;
        int m = arr1.length;
        int n = arr2.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                //System.out.print(arr1[i++]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                //System.out.print(arr2[j++]);
                j++;
            }
            else{
                System.out.print(arr2[j++]);
                i++;
            }
        }
        // while(i<m){
        //     System.out.print(arr1[i++]);
        // }
        // while(j<n){
        //     System.out.print(arr2[j++]);
        // }
    }
}


