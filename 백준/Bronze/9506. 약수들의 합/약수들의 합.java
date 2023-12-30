
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
		while (true) {
			ArrayList<Integer> list = new ArrayList<>();
			int sum = 0;
			int n = Integer.parseInt(br.readLine());
			if (n == -1) {
				break;
			} else {
				for (int i = 0; i < n; i++) {
					if (n % (i + 1) == 0 && (i + 1) != n) {
						list.add(i + 1);
					}
				}
				for (int i = 0; i < list.size(); i++) {
					sum += list.get(i);
				}
				Collections.sort(list);
				if (sum == n) {
					bw.write(n + " = " + "");
					for (int i = 0; i < list.size(); i++) {
						if (i == list.size() - 1) {
							bw.write(list.get(i) + "\n");
						} else {
							bw.write(list.get(i) + " + ");
						}
						bw.flush();
					}
				} else {
					bw.write(n + " is NOT perfect." + "\n");
					bw.flush();
				}
			}
		}
	}
}