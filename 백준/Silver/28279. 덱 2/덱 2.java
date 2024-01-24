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
		LinkedList<String> deque = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			switch (token.nextToken()) {
			case "1":
				deque.offerFirst(token.nextToken());
				break;
			case "2":
				deque.offerLast(token.nextToken());
				break;
			case "3":
				if (deque.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(deque.pollFirst() + "\n");
				}
				break;
			case "4":
				if (deque.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(deque.pollLast() + "\n");
				}
				break;
			case "5":
				bw.write(deque.size() + "\n");
				break;
			case "6":
				if (deque.isEmpty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
				break;
			case "7":
				if (deque.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(deque.peekFirst() + "\n");
				}
				break;
			case "8":
				if (deque.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(deque.peekLast() + "\n");
				}
				break;
			}
		}
		bw.flush();
	}
}