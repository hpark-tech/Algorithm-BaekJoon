

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int c = sc.nextInt();
			System.out.print(c / 25 + " ");
			System.out.print(c % 25 / 10 + " ");
			System.out.print(c % 25 % 10 / 5 + " ");
			System.out.println(c % 25 % 10 % 5 / 1);
		}
	}
}