

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int arr[] = new int[k];
		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();
			if (num == 0) {
				for (int t = 1; t < k + 1; t++) {
					if (arr[i - t] > 0) {
						arr[i - t] = 0;
						break;
					}
				}
			} else if (num != 0) {
				arr[i] = num;
			}
		}
		int result = 0;
		for (int j : arr) {
			result += j;
		}
		System.out.println(result);
	}
}