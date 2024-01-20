

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
		int[] arr = { 1, 1, 2, 2, 2, 8 };
		StringTokenizer token = new StringTokenizer(br.readLine());
		for (int i = 0; i < 6; i++) {
			bw.write(arr[i] - Integer.parseInt(token.nextToken()) + " ");
		}
		bw.write("\n");
		bw.flush();
	}
}