

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String a = "long ";
		String k ="";
		for (int i = 0; i < num/4; i++) {
			k += a;
		}
		System.out.println(k + "int");
		sc.close();
	}
}
