

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String all = sc.next();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += Integer.parseInt(all.substring(i, i + 1));
		}
		System.out.println(sum);
	}
}