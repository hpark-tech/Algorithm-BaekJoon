

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static String recursion(String s, int l, int r, int count) {
		count++;
		if (l >= r)
			return 1 + " " + count;
		else if (s.charAt(l) != s.charAt(r))
			return 0 + " " + count;
		else
			return recursion(s, l + 1, r - 1, count);
	}

	public static String isPalindrome(String s, int count) {
		return recursion(s, 0, s.length() - 1, count);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		String s;
		int count;
		for (int i = 0; i < t; i++) {
			s = "";
			count = 0;
			s = br.readLine();
			bw.write(isPalindrome(s, count) + "\n");
			bw.flush();
		}
	}
}