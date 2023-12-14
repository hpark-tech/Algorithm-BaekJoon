

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allStudent[] = new int[42];
		int count=0;
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt()%42;
			allStudent[num] = 1;
		}
		for (int i = 0; i < 42; i++) {
			if (allStudent[i] == 1) {
				count++;
			}
		}
			System.out.println(count);
		}
}