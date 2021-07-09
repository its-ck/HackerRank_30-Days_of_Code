package hackerrank;

import java.util.Scanner;

public class SolutionDay1 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int var1 = scan.nextInt();
		double var2 = scan.nextDouble();
		scan.nextLine();
		String var3 = scan.nextLine();

		System.out.println(i + var1);
		System.out.println(d + var2);
		System.out.println(s + var3);

		scan.close();
	}
}