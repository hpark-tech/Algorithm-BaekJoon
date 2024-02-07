

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> listInterval = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			list.add(k);
		}
		for (int i = 1; i < n; i++) {
			listInterval.add(list.get(i) - list.get(i - 1));
		}
		int min = listInterval.get(0);
		for (int i = 1; i < listInterval.size(); i++) {
			int x = 0;
			int max = listInterval.get(i);
			while (min != 0) {
				x = max % min;
				max = min;
				min = x;
			}
			min = max;
		}
		int interval = min;
		int k = list.get(0);
		int count = 1;
		while (k < list.get(list.size() - 1)) {
			k += interval;
			if (k <= list.get(list.size() - 1)) {
				count++;
			}
		}
		int result = count - list.size();
		bw.write(result + "\n");
		bw.flush();
	}
}