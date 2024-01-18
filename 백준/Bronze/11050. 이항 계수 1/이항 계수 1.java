

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int factorial(int i) {
		if (i == 0) {
			return 1;
		} else {
			return factorial(i - 1) * i;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		bw.write(factorial(n) / (factorial(n - k) * factorial(k)) + "\n");
		bw.flush();
	}
}