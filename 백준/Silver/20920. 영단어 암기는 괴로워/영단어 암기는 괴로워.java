

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		HashMap<String, Integer> hm = new HashMap<>();
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			if (word.length() >= m) {
				//getOrDefault(Object key, V DefaultValue) :map에 key가 있으면 value리턴, 없으면 defalutValue리턴 - 
				Integer count = hm.getOrDefault(word, 0);
				hm.put(word, count + 1);
			}
		}

		List<String> keyList = new ArrayList<>(hm.keySet());
		keyList.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 빈도수가 다르면 빈도수 기준으로 역순 정렬
				if (hm.get(o1) != hm.get(o2)) {
					return Integer.compare(hm.get(o2), hm.get(o1));
					// return hm.get(o2) - (hm.get(o1));
				}
				// 빈도수는 같고 문자열 길이는 다르다면 길이를 기준으로 역순 정렬
				if (o1.length() != o2.length()) {
					return Integer.compare(o2.length(), o1.length());
					// return o2.length() - o1.length();
				}
				// 빈도수와 문자열 길이가 모두 같다면 문자열 기준으로 사전순(알페벳순) 정렬
				return o1.compareTo(o2);
			}
		});
		for (String key : keyList) {
			bw.write(key + "\n");
		}
		bw.flush();
	}
}
