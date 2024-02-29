

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static BufferedWriter bw;
	public static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = br.readLine();
		Stack<String> stack = new Stack<>();
		int result = 1;
		for (int i = 0; i < n.length(); i++) {
			stack.add(String.valueOf(n.charAt(i)));
		}
		for (int i = 0; i < n.length(); i++) {
			String k = String.valueOf(n.charAt(i));
			if (k.equals(stack.pop())) {
			} else {
				result = 0;
			}
		}
		if (result == 0) {
			bw.write("0");
		} else {
			bw.write("1");
		}
		bw.flush();
	}
}
