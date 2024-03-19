

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		LinkedList<Integer> queue = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		while (queue.size() > 0) {
			for (int i = 0; i < m - 1; i++) {
				queue.addLast(queue.peekFirst());
				queue.pollFirst();
			}
			list.add(queue.pollFirst());
		}
		bw.write("<" + "");
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + "");
			if (i < list.size() - 1) {
				bw.write("," + " ");
			}
		}
		bw.write(">" + "");
		bw.flush();
	}
}