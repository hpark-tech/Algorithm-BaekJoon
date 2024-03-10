


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		int count = 0;
		for (int i = 0; i < n; i++) {
			hs.add(br.readLine());
		}
		for (int i = 0; i < m; i++) {
			String temp = br.readLine();
			if (hs.add(temp) == false) {
				list.add(temp);
				count++;
			}
		}
		Collections.sort(list);
		bw.write(count + "\n");
		for (String k : list) {
			bw.write(k + "\n");
		}
		bw.flush();
	}
}