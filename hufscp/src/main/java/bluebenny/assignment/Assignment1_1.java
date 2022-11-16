package bluebenny.assignment;

import java.io.*;

public class Assignment1_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int year = Integer.parseInt(input);
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년입니다.");
				} else {
					System.out.println("윤년이 아닙니다.");
				}
			} else {
			 System.out.println("윤년입니다.");
			}
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}