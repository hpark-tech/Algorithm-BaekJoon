package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int arrM[];
	public static boolean visit[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		arrM = new int[m];
		visit = new boolean[n];
		int depth = 0;
		int start = 0;
		recursion(n, m, depth, start);
	}

	public static void recursion(int n, int m, int depth, int start) {
		if (depth == m) {
			for (int k : arrM) {
				System.out.print(k + " ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i < n; i++) {
			if (visit[i] == false) {
				arrM[depth] = i + 1;
				visit[i] = true;
				recursion(n, m, depth + 1, i + 1);
				visit[i] = false;
			}
		}
	}

}
