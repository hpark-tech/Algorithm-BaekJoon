

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static BufferedWriter bw;
	public static int arr[][];

	public static void recursion(int x, int y, int size) throws IOException {
		int same = 0;
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (arr[i][j] != arr[x][y]) {
					same = 1;
				}
			}
		}
		if (same == 0) {
			if (arr[x][y] == 0) {
				bw.write("0" + "");
				return;
			} else {
				bw.write("1" + "");
				return;
			}
		} else {
			int newSize = size / 2;
			bw.write("(" + "");
			recursion(x, y, newSize);
			recursion(x, y + newSize, newSize);
			recursion(x + newSize, y, newSize);
			recursion(x + newSize, y + newSize, newSize);
			bw.write(")" + "");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			String k = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = k.charAt(j) - '0';
			}
		}
		if (n == 1) {
			if (arr[0][0] == 0) {
				bw.write("0" + "\n");
			} else {
				bw.write("1" + "\n");
			}
		} else {
			recursion(0, 0, n);
		}
		bw.flush();
	}
}