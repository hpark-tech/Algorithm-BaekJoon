

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
		StringTokenizer token;
		ArrayList<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		int arrSum[] = new int[n];
		int sum = 0;
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(token.nextToken()));
		}
		Collections.sort(list);
		for (int i = 0; i < n; i++) {
			int k = list.get(i);
			if (i == 0) {
				arrSum[i] = k;
			} else {
				arrSum[i] = arrSum[i - 1] + k;
			}
		}
		for (int k : arrSum) {
			sum += k;
		}
		bw.write(sum + "\n");
		bw.flush();
	}
}
