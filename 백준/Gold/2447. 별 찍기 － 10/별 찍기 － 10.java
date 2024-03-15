
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		recursion(0, 0, N, false);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write(arr[i][j]);
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

	static void recursion(int x, int y, int N, boolean blank) {
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		if (N == 1) {
			arr[x][y] = '*';
			return;
		}

		int newSize = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += newSize) {
			for (int j = y; j < y + N; j += newSize) {
				count++;
				if (count == 5) {
					recursion(i, j, newSize, true);
				} else {
					recursion(i, j, newSize, false);
				}
			}
		}
	}
}
