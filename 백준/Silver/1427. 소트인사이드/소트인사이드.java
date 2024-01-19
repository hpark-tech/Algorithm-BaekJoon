

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Character> list = new ArrayList<>();
		String n = br.readLine();
		for (int i = 0; i < n.length(); i++) {
			list.add(n.charAt(i));
		}
		Collections.sort(list);
		Collections.reverse(list);
		for (char k : list) {
			bw.write(k);
		}
		bw.write("\n");
		bw.flush();
	}
}