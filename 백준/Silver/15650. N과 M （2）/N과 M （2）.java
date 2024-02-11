
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
		reculsion(n, m, depth);
	}

	public static void reculsion(int n, int m, int depth) {
		int wrong = 0;
		if (depth == m) {
			for (int i = 1; i < arrM.length; i++) {
				if (arrM[i - 1] >arrM[i]) {
					wrong++;
					break;
				}
			}
			if (wrong > 0) {
				return;
			} else {
				for (int k : arrM) {
					System.out.print(k + " ");
				}
				System.out.println();
				return;
			}
		}
		for (int i = 0; i < n; i++) {
			if (visit[i] == false) {
				arrM[depth] = i + 1;
				visit[i] = true;
				reculsion(n, m, depth + 1);
				visit[i] = false;
			}
		}
	}

}