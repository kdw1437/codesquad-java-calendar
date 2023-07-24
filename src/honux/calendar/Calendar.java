package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month -1];
	}
	
	public void printSampleCalendar() {
		System.out.println("1, 2, 3, 4");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt(); //scanner인스턴스에 non static 메소드인 nextInt를 적용해서 scnnaer의 int type의 필드값을 얻어냄.
		
		
		
		System.out.printf("%d 월은 %d 일까지 있습니다.\n", month, cal.getmaxDaysOfMonth(month));
		
		cal.printSampleCalendar();
		scanner.close();
		}
	}

