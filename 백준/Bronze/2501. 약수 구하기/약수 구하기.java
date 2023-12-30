

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (n % (i + 1) == 0) {
				list.add(i + 1);
				count++;
			}
		}
		Collections.sort(list);
		if (count < k) {
			bw.write(0 + "\n");
		} else {
			bw.write(list.get(k - 1) + "\n");
		}
		bw.flush();
	}
}
