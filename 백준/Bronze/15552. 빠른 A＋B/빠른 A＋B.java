

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		OutputStreamWriter osr = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osr);
		String num = br.readLine();
		int num1 = Integer.parseInt(num);
		String arr[] = new String[2];
		for (int i = 0; i < num1; i++) {
			String s = br.readLine();
			arr = s.split(" ");
			int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
			bw.write(sum + "\n");
		}
		bw.flush();
	}
}