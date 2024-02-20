

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack;
		while (true) {
			stack = new Stack<>();
			String n = br.readLine();
			if (n == null) {
				break;
			}
			for (int i = 0; i < n.length(); i++) {
				char k = n.charAt(i);
				if (k == '(' || k == '[') {
					stack.push(k);
				} else if (!stack.empty() && k == ')') {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						stack.push(k);
						break;
					}
				} else if (!stack.empty() && k == ']') {
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						stack.push(k);
						break;
					}
				} else if (stack.empty() && (k == ']' || k == ')')) {
					stack.push(k);
					break;
				}
				if (k == '.') {
					break;
				}
			}
			if (n.equals(".")) {
			} else if (stack.empty()) {
				bw.write("yes" + "\n");
			} else {
				bw.write("no" + "\n");
			}
			bw.flush();
		}
	}
}
