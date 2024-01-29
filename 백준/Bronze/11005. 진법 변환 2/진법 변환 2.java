import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token;
		token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		ArrayList<Integer> remainderList = new ArrayList<>();
		int quotient = n;
		int remainder = 0;
		while (quotient >= b) {
            remainder = quotient % b;
            remainderList.add(remainder);
			quotient /= b;
		}
		if (quotient >= 10) {
			bw.write((char) (quotient + 55) + "");
		} else {
			bw.write(quotient + "");
		}
		Collections.reverse(remainderList);
		for (int k : remainderList) {
			if (k >= 10) {
				bw.write((char) (k + 55) + "");
			} else {
				bw.write(k + "");
			}
		}
		bw.write("\n");
		bw.flush();
	}
}