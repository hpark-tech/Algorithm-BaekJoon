

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (a == b && b == c) {
			System.out.println(10000 + a * 1000);
		} else if (a == b) {
			System.out.println(1000 + a * 100);
		} else if (c == b) {
			System.out.println(1000 + c * 100);
		} else if (a == c) {
			System.out.println(1000 + a * 100);
		} else {
			System.out.println(max*100);
		}
		sc.close();
	}
}
