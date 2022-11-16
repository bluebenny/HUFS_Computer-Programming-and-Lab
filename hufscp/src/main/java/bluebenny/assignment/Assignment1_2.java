package bluebenny.assignment;

import java.io.*;

public class Assignment1_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int ymd = Integer.parseInt(input);
		
		int year = ymd / 10000;
		ymd = ymd % 10000;
		
		int month = ymd / 100;
		ymd = ymd % 100;
		
		int day = ymd;
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}