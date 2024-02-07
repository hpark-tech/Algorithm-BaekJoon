

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> primeNumber = new ArrayList<>();
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		for (int i = m; i <= n; i++) {
			int factors = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					factors++;
				}
			}
			if (factors == 2) {
				primeNumber.add(i);
			}
		}
		Collections.sort(primeNumber);
		int sum = 0;
		for (int k : primeNumber) {
			sum += k;
		}
		if (primeNumber.isEmpty()) {
			bw.write("-1" + "\n");
		} else {
			bw.write(sum + "\n");
			bw.write(primeNumber.get(0) + "\n");
		}
		bw.flush();
	}
}