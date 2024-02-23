

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			token = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(token.nextToken());
			int h = Integer.parseInt(token.nextToken());
			for (int j = k - 1; j < h; j++) {
				int hh = (h--) - 1;
				if (hh > j) {
					int temp = arr[hh];
					arr[hh] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int result : arr) {
			System.out.print(result + " ");
		}
	}
}