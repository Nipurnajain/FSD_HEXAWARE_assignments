package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemo {

	public static void main(String[] args) {
		
	LocalDate date1 =LocalDate.now(); //localdate is also the return type
	System.out.println(date1);
	LocalDate independence= LocalDate.of(1947, 8, 15);
	System.out.println(independence);
	
	String str="2001-10-19";
	LocalDate dob= LocalDate.parse(str);
	System.out.println(dob);
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //M for month and m for minutes
    String str2="12-12-2024";
	LocalDate date=LocalDate.parse(str2, formatter);
	System.out.println(date);
	
//	DateTimeFormatter myFormatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
//	String date2 =date.format(myFormatter);
	}

}
