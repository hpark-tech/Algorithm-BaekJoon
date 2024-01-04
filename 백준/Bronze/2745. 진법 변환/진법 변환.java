
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		String n = token.nextToken();
		int b = Integer.parseInt(token.nextToken());
		int result = 0;
		int arrresult[] = new int[n.length()];
		ArrayList<Integer> list = new ArrayList<>();
		int arrn[] = new int[n.length()];
		for (int i = n.length() - 1; i >= 0; i--) {
			list.add((int) Math.pow(b, i));
		}
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '0' || n.charAt(i) == '1' || n.charAt(i) == '2' || n.charAt(i) == '3'
					|| n.charAt(i) == '4' || n.charAt(i) == '5' || n.charAt(i) == '6' | n.charAt(i) == '7'
					|| n.charAt(i) == '8' || n.charAt(i) == '9') {
				arrn[i] = n.charAt(i) - '0';
			} else {
				arrn[i] = n.charAt(i) - '7';
			}
		}
		for (int i = 0; i < n.length(); i++) {
			arrresult[i] = arrn[i] * list.get(i);
		}
		for (int k : arrresult) {
			result += k;
		}
		bw.write(result + "\n");
		bw.flush();
	}
}
