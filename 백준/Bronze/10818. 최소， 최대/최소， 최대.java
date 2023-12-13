import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for (int j = 0; j < length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}
		int min = arr[0];
		for (int j = 0; j < length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println(min + " " + max);
	}
}