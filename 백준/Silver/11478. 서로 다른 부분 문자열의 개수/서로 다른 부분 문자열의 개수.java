

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = br.readLine();
		int s = st.length();
		HashSet<String> hs = new HashSet<>();
		for (int i = 0; i < s; i++) {
			for (int j = i+1; j < s+1; j++) {
				hs.add(st.substring(i, j));
			}
		}
		bw.write(hs.size()+"\n");
		bw.flush();
	}
}