import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		String n = br.readLine().toUpperCase();
		for (int i = 0; i < n.length(); i++) {
			list.add(String.valueOf(n.charAt(i)));
			hs.add(String.valueOf(n.charAt(i)));
		}
		int max = 0;
		String maxString = "";
		Iterator iter = hs.iterator();
		for (int j = 0; j < hs.size(); j++) {
			String alphabet = String.valueOf(iter.next());
			int num = Collections.frequency(list, alphabet);
			if (num > max) {
				max = num;
				maxString = alphabet;
			} else if (num == max) {
				maxString = "?";
			}
		}
		bw.write(maxString + "\n");
		bw.flush();
	}
}