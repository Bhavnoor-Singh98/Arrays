package optimized_code;

public class WavePrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3}, {11,12,13}, {21,22,23}, {31,32,33}};
		printRow(arr);
	}
	public static void printRow(int arr[][])
	{
		for(int row=0; row<arr.length; row++)
		{
			if(row%2==0)
			{
				for(int col=0;col<arr[row].length; col++)
				{
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
			else {
				for(int col=arr[row].length-1;col>=0; col--)
				{
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
		}
	}
}
