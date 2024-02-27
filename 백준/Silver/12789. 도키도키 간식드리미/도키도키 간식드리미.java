

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			queue.add(Integer.parseInt(token.nextToken()));
		}
		for (int i = 0; i < n; i++) {
			if (queue.isEmpty()) {
				break;
			}
			while (!queue.isEmpty()) {
				if (queue.peek() == i + 1) {
					list.add(queue.pop());
					break;
				}
				if (!stack.isEmpty()) {
					if (stack.peek() == i + 1) {
						list.add(stack.pop());
						break;
					}
				}
				if (queue.peek() != i + 1) {
					stack.add(queue.pop());
				}
			}
		}
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		String result = "Nice";
		for (int i = 0; i < n; i++) {
			if (list.get(i) != i + 1) {
				result = "Sad";
				break;
			}
		}
		if (result.equals("Nice")) {
			bw.write("Nice" + "\n");
		} else {
			bw.write("Sad" + "\n");
		}
		bw.flush();
	}
}
