

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		int i;
		for (i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		int result = 0;
		int j;
		for (j = 0; j < length; j++) {
			if (num == arr[j]) {
				result += 1;
			}
		}
		System.out.println(result);
	}
}