

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i].charAt(0));
			System.out.println(arr[i].charAt(arr[i].length() - 1));
		}
	}
}
