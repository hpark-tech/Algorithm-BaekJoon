

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
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int max = Integer.parseInt(token.nextToken());
			int min = Integer.parseInt(token.nextToken());
			if (max < min) {
				int temp = min;
				min = max;
				max = temp;
			}
			for (int j = 0;; j++) {
				if (max * (j + 1) % min == 0) {
					bw.write(max * (j + 1) + "\n");
					bw.flush();
					break;
				}
			}
		}
	}
}
