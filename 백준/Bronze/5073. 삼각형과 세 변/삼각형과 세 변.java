


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			int arr[] = new int[3];
			arr[0] = a;
			arr[1] = b;
			arr[2] = c;
			Arrays.sort(arr);
			if (arr[0] + arr[1] <= arr[2]) {
				bw.write("Invalid" + "\n");
			} else if (a == b && b == c) {
				bw.write("Equilateral" + "\n");
			} else if (a == b || a == c || b == c) {
				bw.write("Isosceles " + "\n");
			} else if (a != b && b != c && c != a) {
				bw.write("Scalene " + "\n");
			}

			bw.flush();
		}
	}
}