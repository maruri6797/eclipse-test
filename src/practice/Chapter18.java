package practice;

import java.util.Scanner;

public class Chapter18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
			String line = sc.nextLine();
			if (line.equals("exit")) {
				break;
			}
			sb.append(line);
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
