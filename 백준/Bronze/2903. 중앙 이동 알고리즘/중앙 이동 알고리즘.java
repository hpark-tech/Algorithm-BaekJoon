

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		list.add(3);
		for (int i=1; i <= 15; i++) {
			list.add(list.get(i-1)+(int) Math.pow(2, i));
		}
		bw.write((int) Math.pow(list.get(n-1), 2)+"\n");
		bw.flush();
	}
}