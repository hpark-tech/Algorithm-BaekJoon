

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int c = sc.nextInt();
			if (c >= 25) {
				System.out.println(
						c / 25 + " " + (c % 25) / 10 + " " + ((c % 25) % 10) / 5 + " " + (((c % 25) % 10) % 5) / 1);
			} else if (c < 25 && c >= 10) {
				System.out.println("0" + " "+c / 10 + " " + (c % 10) / 5 + " " + ((c % 10) % 5) / 1);
			} else if (c < 10 && c >= 5) {
				System.out.println("0" + " "+ 0 + " "+c / 5 + " " + (c % 5) / 1);
			} else if (c < 5 && c >= 1) {
				System.out.println("0" + " "+ 0 + " "+ 0+ " " +c / 1);
			}
		}
	}
}