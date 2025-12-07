
import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
        System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt()) { sc.close(); return; }
		int n = sc.nextInt(); sc.close();

		int temp = n, sum = 0;
		while (temp > 0) {
			int d = temp % 10;
			sum += fact(d);
			temp /= 10;
		}

		System.out.println(n + (sum == n ? " is a strong number" : " is not a strong number"));
	}

	static int fact(int x) {
		int f = 1;
		for (int i = 2; i <= x; i++) f *= i;
		return f;
	}
}

