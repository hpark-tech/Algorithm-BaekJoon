

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int array[][] = new int[9][9];
		int max = 0;
		int maxi = 0;
		int maxj = 0;
		for (int i = 0; i < 9; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				int a = Integer.parseInt(token.nextToken());
				array[i][j] = a;
				if (array[i][j] >= max) {
					max = array[i][j];
					maxi = i + 1;
					maxj = j + 1;
				}
			}
		}
		bw.write(max + "\n");
		bw.write(maxi + " " + maxj + "\n");
		bw.flush();
	}
}