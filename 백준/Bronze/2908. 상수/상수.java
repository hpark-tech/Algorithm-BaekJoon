

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String arr[] = new String[2];
		for (int k = 0; k < 2; k++) {
			arr[k] = sc.next();
		}
		String arr1[] = new String[3];
		int arr2[] = new int[2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr1[j] = Character.toString(arr[i].charAt(j));
			}
			String aa = arr1[0];
			arr1[0] = arr1[2];
			arr1[2] = aa;
			arr2[i] = Integer.parseInt(arr1[0] + arr1[1] + arr1[2]);
		}
		if (arr2[0] > arr2[1]) {
			System.out.println(arr2[0]);
		} else {
			System.out.println(arr2[1]);
		}
	}
}