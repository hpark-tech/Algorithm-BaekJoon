

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subject= sc.nextInt();
		int allStudent[] = new int[subject];
		for (int i = 0; i < subject; i++) {
			allStudent[i]=sc.nextInt();
		}
		int max = allStudent[0];
		for (int i = 0; i < subject; i++) {
			if(allStudent[i]>max){max=allStudent[i];}}
		double avg=0;
		double a=0;
		for (int i = 0; i < subject; i++) {
			a = a+ allStudent[i];
			avg = a/subject;}
				System.out.println((avg/max)*100);
			}
	}