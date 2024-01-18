package datetime;

import java.time.LocalDate;

public class DateApis {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		LocalDate date1=LocalDate.of(2023, 12, 31);
		System.out.println(date.isLeapYear());
		System.out.println(date.isAfter(date1));
		System.out.println(date.plusMonths(2));
		System.out.println(date.plusYears(10));
		System.out.println(date.minusMonths(2));
		System.out.println(date.minusYears(9));
		System.out.println(date.withYear(2001));
	}

}
