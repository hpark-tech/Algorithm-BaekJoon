

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
		String arr[] = new String[n];
		String arr1[] = new String[m];
		int count = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		for (int k = 0; k < m; k++) {
			arr1[k] = br.readLine();
		}
		for (int h = 0; h < n; h++) {
			for (int j = 0; j < m; j++) {
				if (arr[h].equals(arr1[j])) {
					count++;
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
	}
}