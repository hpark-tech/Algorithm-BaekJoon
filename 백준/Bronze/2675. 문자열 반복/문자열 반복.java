

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int r = 0;
		String[] tarr = new String[t];
		for (int m = 0; m < t; m++) {
			tarr[m] = sc.nextLine();
		}
		for (int n = 0; n < t; n++) {
			String[] narr = tarr[n].split(" ");
			r = Integer.parseInt(narr[0]);
			String q = narr[1];
			String[] sarr = new String[q.length()];
			for (int j = 0; j < q.length(); j++) {
				sarr[j] = q.substring(j, j + 1);
			}
			for (int k = 0; k < q.length(); k++) {
				System.out.print(sarr[k].repeat(r));
			}
			System.out.println();
		}
	}
}
