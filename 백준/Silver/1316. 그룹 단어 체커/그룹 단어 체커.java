


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
		int n = Integer.parseInt(br.readLine());
		int falseCount = 0;
		for (int i = 0; i < n; i++) {
			String k = br.readLine();
			Character arr[] = new Character[k.length()];
			HashSet<Character> hs = new HashSet<>();
			for (int j = 0; j < k.length(); j++) {
				arr[j] = k.charAt(j);
			}
			for (int h = 0; h < k.length(); h++) {
				if (h == 0) {
					hs.add(k.charAt(h));
				} else {
					if (arr[h] != arr[h - 1]) {
						if (hs.add(arr[h]) == false) {
							falseCount++;
							break;
						}
					}
				}
			}
		}
		bw.write(n - falseCount + "\n");
		bw.flush();
	}
}
