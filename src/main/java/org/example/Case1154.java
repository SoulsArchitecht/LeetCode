package org.example;

public class Case1154 {

    public int dayOfYear(String date) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int dayOfYear = day;

        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        if (month > 2 && isLeapYear(year)) {
            dayOfYear++;
        }

        return dayOfYear;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

//Runtime - 10ms  (56.94%)
//Memory - 45.21mb  (53.96%)
}

/**

1154. Day of the Year
        Difficulty: Easy

        Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.



        Example 1:

        Input: date = "2019-01-09"
        Output: 9
        Explanation: Given date is the 9th day of the year in 2019.

        Example 2:

        Input: date = "2019-02-10"
        Output: 41



        Constraints:

        date.length == 10
        date[4] == date[7] == '-', and all other date[i]'s are digits
        date represents a calendar date between Jan 1st, 1900 and Dec 31th, 2019.

*/

