package optimized_code;
import java.util.*;

public class Bubblesort {
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
		//Bubble sort
		// no. of passes
		for(int i=0; i<n-1; i++)
		{
			int flag=0;
			
			// no. of comparisons
			for(int j=0; j<n-1-i;j++)
			{
				System.out.println(i+" "+ j);
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		System.out.println();
		// display ele
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}	
		sc.close();
		}

}
