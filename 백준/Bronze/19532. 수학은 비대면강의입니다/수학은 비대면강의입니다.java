

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
		StringTokenizer token;
		token = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		int c = Integer.parseInt(token.nextToken());
		int d = Integer.parseInt(token.nextToken());
		int e = Integer.parseInt(token.nextToken());
		int f = Integer.parseInt(token.nextToken());
		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if (a * i + b * j == c && d * i + e * j == f) {
					bw.write(i + " " + j + "\n");
				}
			}
		}
		bw.flush();
	}
}