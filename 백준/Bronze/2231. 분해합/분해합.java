import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int mRemainderSum = 0;
			int m = i;
			while (m > 0) {
				mRemainderSum += (m % 10);
				m /= 10;
			}
			if (n == (i + mRemainderSum)) {
				list.add(i);
				break;
			}
		}
		if (!list.isEmpty()) {
			bw.write(list.get(0) + "\n");
		} else {
			bw.write("0" + "\n");
		}
		bw.flush();
	}
}