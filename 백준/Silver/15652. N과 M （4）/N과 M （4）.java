

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int arr[];

	public static void recursion(int n, int m, int depth) {
		if (depth == m) {
			if (arr.length == 1) {
				System.out.println(arr[0]);
				return;
			} else {
				for (int i = 1; i < arr.length; i++) {
					if (arr[i] < arr[i - 1]) {
						return;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
			arr[depth] = i + 1;
			recursion(n, m, depth + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		int depth = 0;
		for (int i = 0; i < n; i++) {
			arr = new int[m];
			arr[depth] = i + 1;
			recursion(n, m, depth + 1);
		}
	}
}