

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
		int n = Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine());
		int count =0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(token.nextToken());
			if (num == 2) {
				count++;
			} else if (num > 2) {
				for (int j = 2; j < num; j++) {
					if (num % j == 0) {
						break;
					} else if (j == num - 1 && num % j != 0) {
						count++;	
					} else {
						continue;
					}
				}
			}
		}
		bw.write(count + "\n");
		bw.flush();
	}
}