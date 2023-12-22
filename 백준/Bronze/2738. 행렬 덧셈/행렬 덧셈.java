

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		int arr1[][] = new int[n][m];
		int arr2[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] = arr[i][j] + arr1[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			int arr3[] = arr2[i];
			for (int k : arr3) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
