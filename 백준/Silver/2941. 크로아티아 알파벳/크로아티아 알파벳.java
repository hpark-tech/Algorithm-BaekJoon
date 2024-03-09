


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = br.readLine();
		String[] crotia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for (String s:crotia) {
			if(st.contains(s)) st = st.replaceAll(s, " ");
		}
		bw.write(st.length() + "\n");
		bw.flush();
	}
}