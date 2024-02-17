

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int arr[][][];

	public static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		if (arr[a][b][c] != 0) {
			return arr[a][b][c];
		}
		if (a > 20 || b > 20 || c > 20) {
			return arr[a][b][c] = w(20, 20, 20);
		}
		if (a < b && b < c) {
			return arr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		} else {
			return arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token;
		arr = new int[51][51][51];
		while (true) {
			token = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			if (a == -1 && b == -1 && c == -1) {
				break;
			} else {
				w(a, b, c);
			}
			bw.write("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) + "\n");
		}
		bw.flush();
	}
}