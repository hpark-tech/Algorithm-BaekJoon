

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[5];
		int sum = 0;
		for (int k = 0; k < 5; k++) {
			arr[k] = Integer.parseInt(br.readLine());
			sum += arr[k];
		}
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j <5; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int avg = sum / 5;
		int mid = arr[2];
		bw.write(avg + "\n");
		bw.write(mid + "\n");
		bw.flush();
	}
}