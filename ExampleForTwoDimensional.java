import java.util.Scanner;

public class ExampleForTwoDimensional {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int arr[][] = new int[2][5];
		
		for(int i=0;i<=arr.length-1;i++)//Batches
		{
			for(int j=0;j<=arr[i].length-1;j++)//student
			{
				System.out.println("Enter the age of student " + j + " from batch " + i);
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("-------------------------------------------");
		
		System.out.println("The ages are : ");
		
		for(int i=0;i<=arr.length-1;i++)//Batches
		{
			for(int j=0;j<=arr[i].length-1;j++)//student
			{
				System.out.println("The age of student " + j + " from batch " + i + " is " + arr[i][j]);
				
			}
		}

	}

}
