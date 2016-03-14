//U10416043   廖崑智

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {

	//Main method
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();

		int year;
		int month;
		}
	}
		//Print the calendar for a month in a year
	public static void printMonth(int year, int month) {

		//Print the headings of the calendar
		printMonthTitle(year, month);

		//Print the body of the calendar
		printMonthBody(year, month);
	}

	//Print the month title, e.g., March 2012
	public static void printMonthTitle(int year, int month) {

		System.out.println("         " + getMonthName(month) + " " + year);
		System.out.println("----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
}
