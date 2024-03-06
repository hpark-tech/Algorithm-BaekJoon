


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		TreeMap<String, String> hm = new TreeMap<>(Collections.reverseOrder());
		ArrayList<String> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			String name = token.nextToken();
			String state = token.nextToken();
			if (state.equals("enter")) {
				hm.put(name, state);
			} else {
				hm.remove(name);
			}
		}
		for (String key : hm.keySet()) {
			bw.write(key + "\n");
		}
		bw.flush();
	}
}