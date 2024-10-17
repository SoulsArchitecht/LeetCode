package org.example;

public class Case1185 {

    public String dayOfTheWeek(int day, int month, int year) {

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;

        for (int i = 1971; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }

        for (int i = 0; i < month - 1; i++) {
            if (i == 1 && isLeapYear(year)) {
                totalDays += 29;
            } else {
                totalDays += daysInMonth[i];
            }
        }

        totalDays += day;

        return daysOfWeek[(totalDays + 4) % 7];
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

//Runtime - 0ms  (100.00%)
//Memory - 40.43mb  (88.98%)
}

/**

1185. Day of the Week
        Difficulty: Easy

        Given a date, return the corresponding day of the week for that date.

        The input is given as three integers representing the day, month and year respectively.

        Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.



        Example 1:

        Input: day = 31, month = 8, year = 2019
        Output: "Saturday"

        Example 2:

        Input: day = 18, month = 7, year = 1999
        Output: "Sunday"

        Example 3:

        Input: day = 15, month = 8, year = 1993
        Output: "Sunday"



        Constraints:

        The given dates are valid dates between the years 1971 and 2100.

*/

