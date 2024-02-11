

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
		int arr[] = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (m == 0) {
				break;
			} else if (arr[i] <= m) {
				count += m / arr[i];
				m %= arr[i];
			}
		}
		bw.write(count + "\n");
		bw.flush();
	}
}
