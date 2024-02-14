

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int arrM[];
	public static BufferedWriter bw;

	public static void recursion(int n, int m, int depth) throws IOException {
		if (depth == m) {
			for (int k : arrM) {
				bw.write(k + " ");
			}
			bw.write("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			arrM[depth] = i + 1;
			recursion(n, m, depth + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		arrM = new int[m];
		int depth = 0;
		recursion(n, m, depth);
		bw.flush();
	}
}