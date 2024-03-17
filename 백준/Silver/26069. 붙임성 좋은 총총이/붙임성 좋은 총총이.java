package baekjoon;

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
		HashSet<String> hs = new HashSet<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			String one = token.nextToken();
			String two = token.nextToken();
			if (one.equals("ChongChong") || two.equals("ChongChong")) {
				hs.add(one);
				hs.add(two);
			}
			if (hs.contains(one)) {
				hs.add(two);
			}
			if (hs.contains(two)) {
				hs.add(one);
			}
		}
		bw.write(hs.size() + "\n");
		bw.flush();
	}
}
