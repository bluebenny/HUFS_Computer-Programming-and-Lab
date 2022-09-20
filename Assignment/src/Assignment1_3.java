import java.io.*;

public class Assignment1_3 {
	public static int calcDates(int startDate, int finalDate) {
		// Cal startYMD
		int startYear = startDate / 10000;
		startDate = startDate % 10000;
		
		int startMonth = startDate / 100;
		startDate = startDate % 100;
		
		int startDay = startDate;
		// Cal startYMD 끝
		
		// Cal finalYMD
		int finalYear = finalDate / 10000;
		finalDate = finalDate % 10000;
		
		int finalMonth = finalDate / 100;
		finalDate = finalDate % 100;
		
		int finalDay = finalDate;
		// Cal finalYMD 끝

		int day = 0;

        /* Idea: 연, 월, 일 순으로 날짜를 계산함 
         * 
         * ex) 20190503 ~ 20220628 계산
         *  1부: 20200101 ~ 20220628 계산
         *  2부: 20190601 ~ 20191213 계산
         *  3부: 20190503 ~ 20190531 계산
         */
        
        /* 1부 */

		while(finalYear > startYear) {
			if (finalMonth == 0) { // 연단위로 날짜를 더함. 두번째 반복부터 실행되는 부분임.
				day += 365;
				
				// 윤년 검사: 윤년인지 검사하고 목적에 맞는 연산을 실행함.
				if (finalYear % 4 == 0)
					if (finalYear % 100 == 0) {
						if (finalYear % 400 == 0) day += 1;
					} else day += 1;
				// 윤년 검사 끝
				
			} else { // finalMonth가 0이 아닐때: 처음 반복 시에 실행되는 부분임.
				while (finalMonth > 0) {
					// Cal monthDay: month 값에 따른 월의 일수를 monthDay 변수에 저장함
					int monthDay = 0;
					switch(finalMonth) {
						case 1: 
						case 3:
						case 5:
						case 7:
						case 8:
						case 10:
						case 12:
							monthDay = 31;
							break;
						case 4:
						case 6:
						case 9:
						case 11:
							monthDay = 30;
							break;
						case 2:
							monthDay = 28;
							// 윤년 검사
							if (finalYear % 4 == 0)
								if (finalYear % 100 == 0) {
									if (finalYear % 400 == 0) monthDay += 1;
								} else monthDay += 1;
							// 윤년 검사 끝
							break;
					}
					// Cal monthDay 끝
					if (finalDay < monthDay) {
                        day += finalDay;
                        finalDay = 50;
                    } else day += monthDay;
					finalMonth -= 1;
				}
			}
            finalYear -= 1;
		}

        /* 2부 */

        if (finalMonth == 0) finalMonth = 12;
        while (finalMonth > startMonth) {
            // Cal monthDay
            int monthDay = 0;
            switch (finalMonth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    monthDay = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    monthDay = 30;
                    break;
                case 2:
                    monthDay = 28;
                    // 윤년 검사
                    if (finalYear % 4 == 0)
                        if (finalYear % 100 == 0) {
                            if (finalYear % 400 == 0)
                                monthDay += 1;
                        } else
                            monthDay += 1;
                    // 윤년 검사 끝
                    break;
            }
            // Cal monthDay 끝
            day += monthDay;
            finalMonth -= 1;
        }

        /* 3부 */

		// Cal monthDay
		int monthDay = 0;
		switch(finalMonth) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				monthDay = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				monthDay = 30;
				break;
			case 2:
				monthDay = 28;
				// 윤년 검사
				if (finalYear % 4 == 0)
					if (finalYear % 100 == 0) {
						if (finalYear % 400 == 0) monthDay += 1;
					} else monthDay += 1;
				// 윤년 검사 끝
				break;
		}
		// Cal monthDay 끝
		
        if (finalDay == 50) finalDay = monthDay;
		day += finalDay - startDay + 1;
		
		return day;
	}

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int startDate = Integer.parseInt(input);

        input = br.readLine();
        int finalDate = Integer.parseInt(input);

        int days = calcDates(startDate, finalDate);
        System.out.println(days);
    }
}