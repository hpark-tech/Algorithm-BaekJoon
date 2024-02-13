

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int count1 = 0;
	public static int count2 = 0;
	public static int f[];

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			count1++;
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void fibonacci(int n) {
		for (int i = 2; i < n; i++) {
			f[i] = f[i - 1] + f[i - 2];
			count2++;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		f = new int[n];
		f[0] = 1;
		f[1] = 1;
		fib(n);
		fibonacci(n);
		bw.write(count1 + " " + count2 + "\n");
		bw.flush();
	}
}