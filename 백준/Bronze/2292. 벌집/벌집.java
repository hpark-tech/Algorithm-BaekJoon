

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int increaseOne = 0;
		int AccumulateSum = 1;
		int circleNumber = 6;
		while (n > AccumulateSum) {
			increaseOne++;
			circleNumber = 6 * increaseOne;
			AccumulateSum += circleNumber;
			count++;
		}
		bw.write(count + "\n");
		bw.flush();
	}
}