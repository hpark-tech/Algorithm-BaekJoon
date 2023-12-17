

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double allPoint = 0;
		double avg = 0;
		double allPointGrade = 0;
		String subject[] = new String[20];
		double point[] = new double[20];
		String grade[] = new String[20];

		for (int i = 0; i < 20; i++) {
			subject[i] = sc.next();
			point[i] = sc.nextDouble();
			grade[i] = sc.next();
			if (grade[i].equals("P")) {
				grade[i] = "0.0";
				point[i] = 0.0;
			}
			allPoint += point[i];
			if (grade[i].equals("A+")) {
				grade[i] = "4.5";
			} else if (grade[i].equals("A0")) {
				grade[i] = "4.0";
			} else if (grade[i].equals("B+")) {
				grade[i] = "3.5";
			} else if (grade[i].equals("B0")) {
				grade[i] = "3.0";
			} else if (grade[i].equals("C+")) {
				grade[i] = "2.5";
			} else if (grade[i].equals("C0")) {
				grade[i] = "2.0";
			} else if (grade[i].equals("D+")) {
				grade[i] = "1.5";
			} else if (grade[i].equals("D0")) {
				grade[i] = "1.0";
			} else if (grade[i].equals("F")) {
				grade[i] = "0.0";
			}
			allPointGrade += (point[i] * Double.parseDouble(grade[i]));
		}
		avg = allPointGrade / allPoint;
		System.out.printf("%.6f", avg);
	}
}
