package honux.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt(); //scanner인스턴스에 non static 메소드인 nextInt를 적용해서 scnnaer의 int type의 필드값을 얻어냄.
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d 월은 %d 일까지 있습니다.\n", month, maxDays[month-1]);
		scanner.close();
		}
	}

