

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static int white = 0;
	public static int blue = 0;
	public static int arr[][];

	public static void recursion(int x, int y, int size) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				hs.add(arr[i][j]);
			}
		}
		if (hs.size() == 1) {
			if (arr[x][y] == 0) {
				white++;
			} else {
				blue++;
			}
		} else {
			int newSize = size / 2;
			recursion(x, y, newSize);
			recursion(x + newSize, y, newSize);
			recursion(x, y + newSize, newSize);
			recursion(x + newSize, y + newSize, newSize);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token;
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			token = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(token.nextToken());
			}
		}
		recursion(0, 0, n);
		bw.write(white + "\n" + blue + "\n");
		bw.flush();
	}
}