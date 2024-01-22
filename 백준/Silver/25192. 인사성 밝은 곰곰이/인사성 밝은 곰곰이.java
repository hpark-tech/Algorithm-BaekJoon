
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<String> hs = new HashSet<>();
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			String user = br.readLine();
			if (user.equals("ENTER")) {
				hs = new HashSet<>();
				continue;
			} else if (hs.add(user)) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.flush();
	}
}