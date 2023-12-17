
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char arr[] = new char[123];
		for (char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i == s.charAt(j)) {
					System.out.print(j + " ");
					arr[i] = 1;
					break;
				}
			}
			if (arr[i] == 0) {
				System.out.print(-1 + " ");
			}
		}
	}
}