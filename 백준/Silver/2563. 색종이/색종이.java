

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
		int arr[][] = new int[100][100];
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(token.nextToken());
			int y = Integer.parseInt(token.nextToken());
			for (int j = x; j <= x + 9; j++) {
				for (int k = y; k <= y + 9; k++) {
					if (arr[j][k] == 0) {
						arr[j][k] = 1;
						count++;
					}
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
	}
}