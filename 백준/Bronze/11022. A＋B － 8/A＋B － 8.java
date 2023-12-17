
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum =0;
			sum = a+b;
			int order = 0;
			order = i+1;
			System.out.println("Case #"+order+": "+a+" + "+b +" = "+sum);
		}
	}

}