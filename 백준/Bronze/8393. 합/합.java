

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 0;
		for (int i = 1; i <= num; i++) {
			k += i;
		}
		System.out.println(k);
		sc.close();
	}
}
