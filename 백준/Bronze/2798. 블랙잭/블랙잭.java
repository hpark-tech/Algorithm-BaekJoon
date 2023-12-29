

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		int arr[] = new int[n];
		int sum = 0;
		int max = 0;
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int h = Integer.parseInt(token.nextToken());
			arr[i] = h;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (sum > max && sum <= m) {
						max = sum;
					}
				}
			}
		}
		bf.write(max + "\n");
		bf.flush();
	}
}