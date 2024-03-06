


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, String> hm = new HashMap<>();
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
			list.add(key);
		}
		Collections.sort(list, Collections.reverseOrder());
		for (String name : list) {
			bw.write(name + "\n");
		}
		bw.flush();
	}
}