
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		int arr[][] = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			token = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				if (j > 1) {
					arr[i][j] = arr[i][j - 1] + Integer.parseInt(token.nextToken());
				} else {
					arr[i][j] = Integer.parseInt(token.nextToken());
				}
			}
		}
		for (int i = 0; i < m; i++) {
			int result = 0;
			token = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(token.nextToken());
			int x2 = Integer.parseInt(token.nextToken());
			int y1 = Integer.parseInt(token.nextToken());
			int y2 = Integer.parseInt(token.nextToken());
			for (int j = x1; j <= y1; j++) {
				if (arr[j][y2] != arr[j][x2 - 1]) {
					result += arr[j][y2] - arr[j][x2 - 1];
				} else {
					result = arr[j][y2];
				}
			}
			bw.write(result + "\n");
		}
		bw.flush();
	}
}
