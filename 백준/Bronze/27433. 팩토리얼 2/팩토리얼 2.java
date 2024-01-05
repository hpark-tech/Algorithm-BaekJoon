

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static long factorial(int a) {
		if (a == 0) {
			return 1;
		} else {
			return a * factorial(a - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(factorial(n) + "\n");
		bw.flush();
	}
}

//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		long result = 1;
//		for (int i = 1; i <= n; i++) {
//			result *= i;
//		}
//		System.out.println(result);
//	}
//}