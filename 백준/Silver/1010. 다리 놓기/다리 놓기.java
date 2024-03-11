

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			BigInteger result = new BigInteger("0");
			int west = Integer.parseInt(token.nextToken());
			int east = Integer.parseInt(token.nextToken());
			BigInteger a = new BigInteger("1");
			for (int j = 1; j <= east; j++) {
				a = a.multiply(BigInteger.valueOf(j));
			}
			BigInteger b = new BigInteger("1");
			for (int j = 1; j <= west; j++) {
				b = b.multiply(BigInteger.valueOf(j));
			}
			BigInteger c = new BigInteger("1");
			for (int j = 1; j <= east - west; j++) {
				c = c.multiply(BigInteger.valueOf(j));
			}
			result = a.divide((b.multiply(c)));
			bw.write(result + "\n");
		}
		bw.flush();
	}
}