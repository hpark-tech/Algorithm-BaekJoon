

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
		HashSet<Integer> hs = new HashSet<>();
		int n = Integer.parseInt(br.readLine());
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			hs.add(Integer.parseInt(token.nextToken()));
		}
		int m = Integer.parseInt(br.readLine());
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int k = Integer.parseInt(token.nextToken());
			if (hs.add(k)) {
				bw.write("0" + "\n");
				hs.remove(k);
			} else {
				bw.write("1" + "\n");
			}
		}
		bw.flush();
	}
}