package optimized_code;

import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int arr[]=new int[n];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter " +n+" Array Elements:");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		//Insertion sort
		// no. of passes
		int j;
		for(int i=1; i<n; i++)
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
//		System.out.println();
		// display ele
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}	
		sc.close();
	}

}
