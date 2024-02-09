

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			if (list.isEmpty()) {
				list.add(Integer.parseInt(token.nextToken()));
			} else {
				list.add(list.get(i - 1) + Integer.parseInt(token.nextToken()));
			}
		}
		for (int i = 0; i < m; i++) {
			token = new StringTokenizer(br.readLine());
			int result = 0;
			int start = Integer.parseInt(token.nextToken());
			int end = Integer.parseInt(token.nextToken());
			if (start != 1) {
				result = list.get(end - 1) - list.get(start - 2);
			} else {
				result = list.get(end - 1);
			}
			bw.write(result + "\n");
		}
		bw.flush();
	}
}