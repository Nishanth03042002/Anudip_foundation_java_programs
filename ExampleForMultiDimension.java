import java.util.Scanner;

public class ExampleForMultiDimension {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int arr[][][] = new int[2][2][5];
		
		for(int i=0;i<=arr.length-1;i++)//Branch
		{
			for(int j=0;j<=arr[i].length-1;j++)//batch
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the age of student " + k + " from batch " + j+ " from branch " + i);
					arr[i][j][k] = s.nextInt();
				}
			}

		}
		

	}

}
