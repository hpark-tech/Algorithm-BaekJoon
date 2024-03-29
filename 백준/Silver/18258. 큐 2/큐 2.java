

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		LinkedList<String> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			switch (token.nextToken()) {
			case "push":
				q.offer(token.nextToken());
				break;
			case "front": {
				if (q.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(q.peekFirst() + "\n");
				}
			}
				break;
			case "back": {
				if (q.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(q.peekLast() + "\n");
				}
			}
				break;
			case "size": {
				bw.write(q.size() + "\n");
			}
				break;
			case "empty":
				if (q.isEmpty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
				break;
			case "pop":
				if (q.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(q.poll() + "\n");
				}
				break;
			}
		}
		bw.flush();
	}
}