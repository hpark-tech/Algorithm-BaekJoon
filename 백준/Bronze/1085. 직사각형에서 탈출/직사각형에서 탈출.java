

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
		int x = Integer.parseInt(token.nextToken());
		int y = Integer.parseInt(token.nextToken());
		int w = Integer.parseInt(token.nextToken());
		int h = Integer.parseInt(token.nextToken());
		int minWidth = Math.min(x, w - x);
		int minHeight = Math.min(y, h - y);
		int min = Math.min(minWidth, minHeight);
		bw.write(min + "\n");
		bw.flush();
	}
}