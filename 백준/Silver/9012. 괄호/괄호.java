

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int left = 0;
		int right = 0;
		for (int i = 0; i < n; i++) {
			left = 0;
			right = 0;
			String bracket = br.readLine();
			for (int j = 0; j < bracket.length(); j++) {
				if (String.valueOf(bracket.charAt(j)).equals("(")) {
					left++;
				} else if (String.valueOf(bracket.charAt(j)).equals(")")) {
					right++;
				}
				if (right > left) {
					break;
				}
			}
			if (left == right) {
				bw.write("YES" + "\n");
			} else {
				bw.write("NO" + "\n");
			}
		}
		bw.flush();
	}
}