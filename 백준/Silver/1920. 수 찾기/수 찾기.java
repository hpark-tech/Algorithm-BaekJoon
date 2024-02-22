

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static BufferedWriter bw;
	public static int arr[];

	public static void binarySearch(int startIndex, int endIndex, int k) throws IOException {
		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			if (arr[midIndex] == k) {
				bw.write("1" + "\n");
				return;
			} else if (k < arr[midIndex] && k >= arr[startIndex]) {
				endIndex = midIndex - 1;
			} else if (k > arr[midIndex] && k <= arr[endIndex]) {
				startIndex = midIndex + 1;
			} else {
				bw.write("0" + "\n");
				return;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token;
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int k = Integer.parseInt(token.nextToken());
			binarySearch(0, n - 1, k);
		}
		bw.flush();
	}
}