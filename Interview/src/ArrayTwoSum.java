import java.util.Scanner;
public class ArrayTwoSum {

	public static int[] TwoSum(int nums[],int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					int a[]= {i, j};
					
					return a;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int n=sc.nextInt();
		int[] nums=new int[n];
		System.out.println("Enter the Array element: ");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("Enter the target :");
		int target=sc.nextInt();
		int[] arr=TwoSum(nums,target);
		if(arr.length==2) {
			 System.out.println("["+arr[0] + ", " + arr[1]+"]");
        } else {
            System.out.println("No solution found!");
        }
	}

}
