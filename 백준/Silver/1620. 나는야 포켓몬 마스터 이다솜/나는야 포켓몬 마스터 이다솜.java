import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		int num1 = Integer.parseInt(token.nextToken());
		int num2 = Integer.parseInt(token.nextToken());
		for (int i = 1; i <= num1; i++) {
			String a = br.readLine();
			map.put(a, i);
			list.add(a);
		}
		for (int i = 0; i < num2; i++) {
			String aString = br.readLine();
			if (map.containsKey(aString)) {
				bw.write(map.get(aString) + "\n");
			} else {
				int aInt = Integer.parseInt(aString);
				bw.write(list.get(aInt - 1) + "\n");
			}
		}
		bw.flush();
	}
}