

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allStudent[] = new int[30];
		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			allStudent[num-1] = 1;
		}
		for (int i = 0; i < 30; i++) {
			if (allStudent[i] != 1) {
				System.out.println(i + 1);
			}
		}
	}
}