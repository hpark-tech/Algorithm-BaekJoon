

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Integer a = sc.nextInt();
			Integer b = sc.nextInt();
			System.out.println(a + b);
			if (sc.hasNext() == false) {break;
				
			}
		}
		sc.close();
	}
}
