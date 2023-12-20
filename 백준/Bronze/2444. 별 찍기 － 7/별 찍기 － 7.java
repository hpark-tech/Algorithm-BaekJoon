import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = num-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = -1; k < i; k++) {
				System.out.print("*");
			}
			for (int h = 0; h < i; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < num-1; i++) {
			for (int k = -1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = num- 2; j > i; j--) {
				System.out.print("*");
			}
			for (int h = num- 1; h > i; h--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
