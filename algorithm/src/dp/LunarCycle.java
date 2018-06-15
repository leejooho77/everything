/*
 * The moon goes through phases because it orbits the earth and the sun hits it differently at different places in its orbit. 
 * This means that, depending on where it is in its orbit, you might see a full moon, right quarter moon, or even "no" moon (new moon) at all. 
 * It takes 27.3 days for the moon to orbit the Earth, but the actual phase difference from one full moon to the next is 29.5 days 
 * because the earth cruises a cool 45 million miles around the sun in that 27.3 days. 
 * It takes 2.2 days for the the moon to make up for that distance and get all the way back to where you last saw a full moon.
 * Whenever the moon is full twice in one month, the second one is called a "blue moon." 
 * This last happened in July of 2015 on the 1st and 31st. The next time is January of 2018 (same days). 
 * You can research the timing, otherwise you can assume midnight. 
 * Write a program that determines how many "blue moons" there will be in third milenia (2000-2999)?
 */

package dp;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LunarCycle {
//	1. Find leap year
//	2. Find number of days every month 2000 - 2999.
//	3. 
	
	public static int rollUp(Calendar calendar) {
		int prevMonth, nextMonth;
		int counter = 0;
		Calendar gc = calendar;
		while(gc.get(Calendar.YEAR) < 3000) {
			prevMonth = gc.get(Calendar.MONTH);
			System.out.println(gc.getTime() + " " + prevMonth);
			gc.add(GregorianCalendar.DATE, 29);
			gc.add(GregorianCalendar.HOUR, 12);
			gc.add(GregorianCalendar.MINUTE, 44);
			nextMonth = gc.get(Calendar.MONTH);
			
			if(prevMonth == nextMonth) {
				counter++;
			}
		}
		System.out.println(counter);
		return counter;
	}
	
	public static void main(String[] args) {
		int counter = 0;
		Calendar gc = new GregorianCalendar(2000, 0, 20, 23, 40);
		System.out.println(gc.getTime());
		counter += rollUp(gc);
		System.out.println(counter);
	}
}
