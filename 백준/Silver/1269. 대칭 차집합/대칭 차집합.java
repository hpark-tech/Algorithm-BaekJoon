

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> hsA = new HashSet<>();
		HashSet<Integer> hsB = new HashSet<>();
		StringTokenizer token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(token.nextToken());
			hsA.add(x);
		}
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int y = Integer.parseInt(token.nextToken());
			hsB.add(y);
		}
		HashSet<Integer> hsA2 = new HashSet<>(hsA);
		HashSet<Integer> hsB2 = new HashSet<>(hsB);
		Iterator<Integer> iterator1 = hsA.iterator();
		while (iterator1.hasNext()) {
			int a = iterator1.next();
			if (hsB2.add(a)==true) {
				hsB2.remove(a);
			}
			else if (hsB2.add(a)==false) {
				hsB2.remove(a);
			}
		}
		Iterator<Integer> iterator2 = hsB.iterator();
		while (iterator2.hasNext()) {
			int b = iterator2.next();
			if (hsA2.add(b)==true) {
				hsA2.remove(b);
			}
			else if (hsA2.add(b)==false) {
				hsA2.remove(b);
			}
		}
		bw.write(hsA2.size() + hsB2.size() + "\n");
		bw.flush();
		bw.close();
	}
}