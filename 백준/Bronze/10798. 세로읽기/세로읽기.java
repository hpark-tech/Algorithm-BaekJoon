

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr[][] = new String[5][15];
		for (int i = 0; i < 5; i++) {
			String n = br.readLine();
			for (int j = 0; j < n.length(); j++) {
				arr[i][j] = String.valueOf(n.charAt(j));
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] != null) {
					bw.write(arr[j][i]);
				}
			}
		}
		bw.write("\n");
		bw.flush();
	}
}