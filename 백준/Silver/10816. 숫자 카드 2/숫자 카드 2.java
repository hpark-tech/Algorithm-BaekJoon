


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
	public static int n;
	public static int nothing = 0;

	public static int binarySearchLowerBound(int startIndex, int endIndex, int k) {
		int lowerBound = 0;
		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			int mid = arr[midIndex];
			if (k <= mid) {
				endIndex = midIndex - 1;
				if (k == mid) {
					lowerBound = midIndex;
				}
			} else {
				startIndex = midIndex + 1;
			}
		}
		if (lowerBound == 0 && arr[lowerBound] != k) {
			nothing = 1;
		}
		return lowerBound;
	}

	public static int binarySearchUpperBound(int startIndex, int endIndex, int k) {
		int upperBound = n - 1;
		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			int mid = arr[midIndex];
			if (k >= mid) {
				startIndex = midIndex + 1;
				if (k == mid) {
					upperBound = midIndex;
				}
			} else {
				endIndex = midIndex - 1;
			}
		}
		if (upperBound == n - 1 && arr[upperBound] != k) {
			nothing = 1;
		}
		return upperBound;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			nothing = 0;
			int k = Integer.parseInt(token.nextToken());
			int lower = binarySearchLowerBound(0, n - 1, k);
			int upper = binarySearchUpperBound(0, n - 1, k);
			if (nothing == 1) {
				bw.write(0 + "\n");
			} else {
				int result = upper - lower + 1;
				bw.write(result + "\n");
			}
		}
		bw.flush();
	}
}
