

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		List<Integer> list = new ArrayList<>();
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int score = Integer.parseInt(token.nextToken());
			list.add(score);
		}
		Collections.sort(list);
		bw.write(list.get(n-k) + "\n");
		bw.flush();
	}
}