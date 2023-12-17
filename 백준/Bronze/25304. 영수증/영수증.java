

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allcost = sc.nextInt();
		int allkind = sc.nextInt();
		int cal = 0;
		for (int i = 0; i < allkind; i++) {
			int cost = sc.nextInt();
			int num = sc.nextInt();
			cal += cost*num;
		}
		if(cal==allcost) {System.out.println("Yes");}
		else {System.out.println("No");}
		sc.close();
	}
}
