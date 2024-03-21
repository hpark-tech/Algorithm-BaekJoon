

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int arr[][];
	public static int n;
	public static int minus = 0;
	public static int zero = 0;
	public static int one = 0;

	public static void recursion(int x, int y, int size) {
		int same = 0;
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (arr[x][y] != arr[i][j]) {
					same = 1;
				}
			}
		}
		if (same == 0) {
			switch (arr[x][y]) {
			case -1:
				minus++;
				break;
			case 0:
				zero++;
				break;
			case 1:
				one++;
				break;
			}
		} else {
			int newSize = size / 3;
			recursion(x, y, newSize);
			recursion(x, y + newSize, newSize);
			recursion(x, y + newSize * 2, newSize);
			recursion(x + newSize, y, newSize);
			recursion(x + newSize, y + newSize, newSize);
			recursion(x + newSize, y + newSize * 2, newSize);
			recursion(x + newSize * 2, y, newSize);
			recursion(x + newSize * 2, y + newSize, newSize);
			recursion(x + newSize * 2, y + newSize * 2, newSize);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(token.nextToken());
			}
		}
		recursion(0, 0, n);
		bw.write(minus + "\n");
		bw.write(zero + "\n");
		bw.write(one + "\n");
		bw.flush();
	}
}