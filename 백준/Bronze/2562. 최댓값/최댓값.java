

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = arr[0];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < 9; i++) {
			if (arr[i] == max) {
				System.out.println(max);
				System.out.println(i+1);
			}
		}

	}
}