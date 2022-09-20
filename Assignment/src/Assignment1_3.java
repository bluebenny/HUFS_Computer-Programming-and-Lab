import java.io.*;

public class Assignment1_3 {

	// 필요한 부분을 수정하여 작성하시오.
	
	/* 윤년 검사
	if (year % 4 == 0)
		if (year % 100 == 0) {
			if (year % 400 == 0) System.out.println("윤년");
		} else System.out.println("윤년");
	*/
	
	public static int calcDates(int startDate, int finalDate) {
		// Cal start YMD
		int startYear = startDate / 10000;
		startDate = startDate % 10000;
		
		int startMonth = startDate / 100;
		startDate = startDate % 100;
		
		int startDay = startDate;
		// Cal start YMD End
		
		// Cal final YMD
		int finalYear = finalDate / 10000;
		finalDate = finalDate % 10000;
		
		int finalMonth = finalDate / 100;
		finalDate = finalDate % 100;
		
		int finalDay = finalDate;
		// Cal final YMD End

		int day = 0;

		while(finalYear > startYear) {
			if (finalMonth == 0) {
                // finalYear == startYear 까지 연단위로 날짜를 더함.
                // 두번째 반복부터 실행되는 부분임.
				
				day += 365;
				
				// 윤년 검사
				if (finalYear % 4 == 0)
					if (finalYear % 100 == 0) {
						if (finalYear % 400 == 0) day += 1;
					} else day += 1;
				// 윤년 검사 끝
				
			} else {
				// finalMonth가 0이 아닐때: 반복문 처음에 실행되는 부분임.
				while (finalMonth > 0) {
					// finalMonth에 따른 월의 일수를 monthDay 변수에 저장함
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
					// Cal monthDay End
					if (finalDay < monthDay) {
                        day += finalDay;
                        finalDay = 50;
                    } else day += monthDay;
					finalMonth -= 1;
				}
			}
            finalYear -= 1;
		}

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
            // Cal monthDay End
            day += monthDay;
            finalMonth -= 1;
        }

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
		// Cal monthDay End
		
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