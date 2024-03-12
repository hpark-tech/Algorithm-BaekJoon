
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		int v = Integer.parseInt(token.nextToken());
		int sum = 0;
		int oneDayBefore = (v - a);
		int days = oneDayBefore / (a - b);
		int lastDay = 1;
		if (oneDayBefore % (a - b) == 0) {
			sum = days + lastDay;
		} else {
			sum = days + 1 + lastDay;
		}

		bw.write(sum + "\n");
		bw.flush();
	}
}
