

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token;
		ArrayList<Integer> list = new ArrayList<>();
		token = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		int arr[] = new int[n];
		token = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		for (int i = 0; i < n - k + 1; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			list.add(sum);
		}
		Collections.sort(list);
		bw.write(list.get(list.size() - 1) + "\n");
		bw.flush();
	}
}
