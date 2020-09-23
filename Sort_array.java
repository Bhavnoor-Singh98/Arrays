//Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
//
//Input:
//The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.
//
//Output: 
//For each testcase, print the sorted array.
//
//Constraints:
//1 <= T <= 500
//1 <= N <= 106
//0 <= Ai <= 2
//
//Example:
//Input :
//2
//5
//0 2 1 2 0
//3
//0 1 0
//
//Output:
//0 0 1 2 2
//0 0 1
//
//Explanation:
//Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.

// 

package optimized_code; // remove this 
import java.util.*;

public class Sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		
		while(test_case-->0)
		{
		    int size=sc.nextInt();
		    int arr[]=new int[size];
		   for(int i=0; i<size; i++)
		   {
		       arr[i]=sc.nextInt();
		   }
		   
		   // applying insertion sort
		   int j;
		   for(int i=1; i<size; i++)
		   {
			int temp=arr[i];
			 j=i-1;
			
			// no. of comparisons
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
//			System.out.println(i+" "+j);
			arr[j+1]=temp;
		   }
		   //printing elements
		   for(int i=0; i<size; i++)
		   {
		       System.out.print(arr[i]+" ");
		   }
		   System.out.println();
		}
		sc.close();
	}

}
