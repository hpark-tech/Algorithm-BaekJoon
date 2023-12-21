

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		for (int h = 0; h < m; h++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for (int p = i - 1; p < j; p++) {
				arr[p] = k;
			}
		}
		for (int h = 0; h < n; h++) {
			System.out.print(arr[h] + " ");
		}
	}
}