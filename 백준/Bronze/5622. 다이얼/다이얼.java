

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
		String dialNum;
		int result = 0;
		for (int i = 0; i < n.length(); i++) {
			dialNum = String.valueOf(n.charAt(i));
			switch (dialNum) {
			case "A":
			case "B":
			case "C":
				result += 3;
				break;
			case "D":
			case "E":
			case "F":
				result += 4;
				break;
			case "G":
			case "H":
			case "I":
				result += 5;
				break;
			case "J":
			case "K":
			case "L":
				result += 6;
				break;
			case "M":
			case "N":
			case "O":
				result += 7;
				break;
			case "P":
			case "Q":
			case "R":
			case "S":
				result += 8;
				break;
			case "T":
			case "U":
			case "V":
				result += 9;
				break;
			case "W":
			case "X":
			case "Y":
			case "Z":
				result += 10;
				break;
			}
		}
		bw.write(result + "\n");
		bw.flush();
	}
}