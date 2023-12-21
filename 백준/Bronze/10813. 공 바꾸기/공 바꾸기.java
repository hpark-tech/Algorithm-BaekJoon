

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n + 1];

		for (int h = 1; h <= n; h++) {
			arr[h] = h;
		}
		for (int h = 0; h < m; h++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int ii = arr[i];
			int jj = arr[j];
			arr[i] = jj;
			arr[j] = ii;
		}
		for (int h = 1; h < n + 1; h++) {
			System.out.print(arr[h] + " ");
		}
	}
}