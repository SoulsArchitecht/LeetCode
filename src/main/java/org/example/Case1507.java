package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Case1507 {

    public String reformatDate(String date) {
        String[] dateArray = date.split(" ");

        return dateArray[2] + "-" +
                convertMonth(dateArray[1]) + "-" +
                convertDay(dateArray[0]);
    }


    private String convertMonth(String month) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Jan", "01");
        hm.put("Feb", "02");
        hm.put("Mar", "03");
        hm.put("Apr", "04");
        hm.put("May", "05");
        hm.put("Jun", "06");
        hm.put("Jul", "07");
        hm.put("Aug", "08");
        hm.put("Sep", "09");
        hm.put("Oct", "10");
        hm.put("Nov", "11");
        hm.put("Dec", "12");
        String result = "";

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            if (month.contains(entry.getKey())) {
                result = entry.getValue();
            }
        }

        return result;
    }

    private String convertDay(String day) {
        StringBuilder sb = new StringBuilder(2);
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(day);
        while (m.find()) {
            sb.append(m.group());
        }

        String result = sb.toString();

        if (Integer.parseInt(result) < 10) {
            result = "0" + result;
        }

        return result;
    }

//Runtime - 8ms  (27.26%)
//Memory - 42.26mb  (9.71%)


    public String reformatDate2(String date) {

        HashMap<String, String> hm = new HashMap<>();
        hm.put("Jan", "01");
        hm.put("Feb", "02");
        hm.put("Mar", "03");
        hm.put("Apr", "04");
        hm.put("May", "05");
        hm.put("Jun", "06");
        hm.put("Jul", "07");
        hm.put("Aug", "08");
        hm.put("Sep", "09");
        hm.put("Oct", "10");
        hm.put("Nov", "11");
        hm.put("Dec", "12");
        String[] dateArray = date.split(" ");
        int day = Integer.parseInt(dateArray[0].substring(0, dateArray[0].length() - 2));
        String month = hm.get(dateArray[1]);
        String year = dateArray[2];

        return String.format("%s-%s-%02d", year, month, day);
    }


//Runtime - 5ms  (61.30%)
//Memory - 41.82mb  (42.69%)
}

/**


1507. Reformat Date
        Difficulty: Easy

        Given a date string in the form Day Month Year, where:

        Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
        Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
        Year is in the range [1900, 2100].

        Convert the date string to the format YYYY-MM-DD, where:

        YYYY denotes the 4 digit year.
        MM denotes the 2 digit month.
        DD denotes the 2 digit day.



        Example 1:

        Input: date = "20th Oct 2052"
        Output: "2052-10-20"

        Example 2:

        Input: date = "6th Jun 1933"
        Output: "1933-06-06"

        Example 3:

        Input: date = "26th May 1960"
        Output: "1960-05-26"



        Constraints:

        The given dates are guaranteed to be valid, so no error handling is necessary.

*/
