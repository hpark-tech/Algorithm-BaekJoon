

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num = br.readLine();
		int all = Integer.parseInt(num);
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < all; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int order = Integer.parseInt(token.nextToken());
			if (order==1) {
				st.push(Integer.parseInt(token.nextToken()));
			} else if (order == 2) {
				if(!st.isEmpty()) {
						bw.write(st.pop()+"\n");}
				else {bw.write(-1+"\n");}
			} else if (order == 3) {
				bw.write(st.size()+"\n");
			} else if (order == 4) {
				if (st.isEmpty()) {
					bw.write(1+"\n");
				}
				else {bw.write(0+"\n");}
			} else if (order == 5) {
				if (!st.isEmpty()) {
					bw.write(st.peek()+"\n");
				} else {
					bw.write(-1+"\n");
				}
			}
		}
		bw.flush();
	}
}