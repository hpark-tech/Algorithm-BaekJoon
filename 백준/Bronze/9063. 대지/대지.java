

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> listX = new ArrayList<>();
		ArrayList<Integer> listY = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			listX.add(Integer.parseInt(token.nextToken()));
			listY.add(Integer.parseInt(token.nextToken()));
		}
		Collections.sort(listX);
		Collections.sort(listY);
		int minX = listX.get(0);
		int maxX = listX.get(listX.size() - 1);
		int minY = listY.get(0);
		int maxY = listY.get(listY.size() - 1);
		bw.write((maxX - minX) * (maxY - minY) + "\n");
		bw.flush();
	}
}