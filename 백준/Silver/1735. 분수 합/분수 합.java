

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token;
		token = new StringTokenizer(br.readLine());
		int numerator = Integer.parseInt(token.nextToken());
		int denominator = Integer.parseInt(token.nextToken());
		token = new StringTokenizer(br.readLine());
		int numerator1 = Integer.parseInt(token.nextToken());
		int denominator1 = Integer.parseInt(token.nextToken());
		int numerator2 = denominator * numerator1 + denominator1 * numerator;
		int denominator2 = denominator * denominator1;
		HashSet<Integer> submultiple = new HashSet<>();
		int small = Math.min(denominator2, numerator2);
		int big = Math.max(denominator2, numerator2);
		int maxSubmultiple = 0;
		for (int i = 1; i <= small; i++) {
			if (small % i == 0 && big % i == 0) {
				maxSubmultiple = i;
			}
		}
		bw.write(numerator2 / maxSubmultiple + " " + denominator2 / maxSubmultiple + "\n");
		bw.flush();
	}
}