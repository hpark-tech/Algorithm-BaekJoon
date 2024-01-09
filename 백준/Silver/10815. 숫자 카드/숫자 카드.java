
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
		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		StringTokenizer token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(token.nextToken()));
		}
		int m = Integer.parseInt(br.readLine());
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int t = Integer.parseInt(token.nextToken());
			if (set.add(t) == false) {
				bw.write(1 + " ");
			} else {
				bw.write(0 + " ");
				set.remove(t);
			}
			bw.flush();
		}
	}
}