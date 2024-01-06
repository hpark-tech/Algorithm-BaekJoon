
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(token.nextToken());
		long b = Integer.parseInt(token.nextToken());
		List<Long> list = new ArrayList<>();
		long min = Math.min(a, b);
		long max = Math.max(a, b);
		for (long i = 0; i < min; i++) {
			if (min % (i+1) == 0 && max % (i+1) == 0) {
				list.add(i+1);
			}
		}
		Collections.sort(list);
		bw.write(a * b / list.get(list.size() - 1) + "\n");
		bw.flush();
	}
}