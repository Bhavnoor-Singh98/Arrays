package optimized_code;

public class SpiralPrintClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{11,12,13,14}, {21,22,23,24}, {31,32,33,34}, {41,42,43,44}};
		SpiralPrintClockwise(arr);
		System.out.println("end");
	}
	private static void SpiralPrintClockwise(int arr[][])
	{
		int top=0;
		int bottom=arr.length-1;
		int left=top;
		int right=arr[top].length-1;
		int count=(bottom + 1) * (right + 1);
		int dir=1;
		while(left<=right && top<=bottom)
		{
			if(count>0)
			{
				if(dir==1)
				{
					// print left to right
					for(int i=left; i<=right;i++)
					{
						System.out.print(arr[top][i]+", ");
						count--;
					}
					top++;
					dir=2;
				}
			}
			if(count>0)
			{
				if(dir==2)
				{
					// top to bottom
					for(int i=top;i<=bottom;i++)
					{
						System.out.print(arr[i][right]+", ");
						count--;
					}
					right--;
					dir=3;
				}
			}
			if(count>0)
			{
				if(dir==3)
				{
					for(int i=right;i>=left;i--)
					{
						System.out.print(arr[bottom][i]+", ");
						count--;
					}
				}
				bottom--;
				dir=4;
			}
			if(count>0)
			{
				if(dir==4)
				{
					for(int i=bottom;i>=top;i--)
					{
						System.out.print(arr[i][left]+", ");
						count--;
					}
					dir=1;
				}
				left++;
			}
			
		}
	} 
}
