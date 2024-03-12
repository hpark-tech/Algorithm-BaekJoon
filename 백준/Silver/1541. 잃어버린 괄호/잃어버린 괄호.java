

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = br.readLine();
		String arrMinus[] = n.split("-");
		int result = 0;
		for (int i = 0; i < arrMinus.length; i++) {
			String arrPlus[] = arrMinus[i].split("\\+");
			int sum = 0;
			for (int j = 0; j < arrPlus.length; j++) {
				sum += Integer.parseInt(arrPlus[j]);
			}
			if (i == 0) {
				result = sum;
			} else {
				result -= sum;
			}
		}
		bw.write(result + "\n");
		bw.flush();
	}
}