

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
		HashSet<Integer> hsX = new HashSet<>();
		HashSet<Integer> hsY = new HashSet<>();
		for (int i = 0; i < 3; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(token.nextToken());
			if (hsX.add(x) == false) {
				hsX.remove(x);
			} else {
				hsX.add(x);
			}
			int y = Integer.parseInt(token.nextToken());
			if (hsY.add(y) == false) {
				hsY.remove(y);
			} else {
				hsY.add(y);
			}
		}
		bw.write(hsX.iterator().next() + " " + hsY.iterator().next() + "\n");
		bw.flush();
	}
}