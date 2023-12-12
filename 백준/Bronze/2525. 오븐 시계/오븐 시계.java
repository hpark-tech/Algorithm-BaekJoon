

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		int hour = Integer.parseInt(arr[0]);
//		int min = Integer.parseInt(arr[1]);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cookMin = sc.nextInt();
		int deadHour = hour + (cookMin / 60);
		int deadMin = (cookMin % 60) + min;
		if (deadMin > 60) {
			deadMin -= 60;
			deadHour += 1;
		}
		if (deadMin == 60) {
			deadMin = 0;
			deadHour += 1;
		}
		if (deadHour > 23) {
			deadHour %= 24;
		}
		System.out.println(deadHour + " " + deadMin);
	}
}