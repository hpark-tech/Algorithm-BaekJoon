

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Integer> queue = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		while (queue.size() > 1) {
			queue.pollFirst();
			queue.offerLast(queue.pollFirst());
		}
		bw.write(queue.poll() + "\n");
		bw.flush();
	}
}
