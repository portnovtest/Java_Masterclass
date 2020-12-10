package com.javamasterclass.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I","You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));
        String secondString = "abcDeeeF12GhhabcDeeeiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("kl99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry","Harry"));
        String newAlphanumeric = "abcDeeeF12Ghhiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]","X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("(?iu)[a-f3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));
        System.out.println(newAlphanumeric.replaceAll("\\D","X"));
        String hasWhitSpace = "I have blanks and\ta tab, and also a newLine\n";
        System.out.println(hasWhitSpace);
        System.out.println(hasWhitSpace.replaceAll("\\s",""));
        System.out.println(hasWhitSpace.replaceAll("\t","X"));
        System.out.println(hasWhitSpace.replaceAll("\\S",""));
        System.out.println(newAlphanumeric.replaceAll("\\w","X"));
        System.out.println(hasWhitSpace.replaceAll("\\w","X"));
        System.out.println(hasWhitSpace.replaceAll("\\b","X"));

        String thirdAlphanumeric = "abcDeeeF12Ghhiiijkl99z";
        System.out.println(thirdAlphanumeric.replaceAll("^abcDeee","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}","YYY"));
        System.out.println(thirdAlphanumeric.replaceAll("h+i*j","Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>This is the summary</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();
        while (groupMatcher.find()){
            System.out.println("Occurrence " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurrence " + h2TextMatcher.group(2));
        }

        System.out.println("harry".replaceAll("[H|h]arry","Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry","Larry"));

        String tvTest = "tstvtkt";
 //       String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
        count = 0;
        while (tNotVMatcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        String phone1 = "1234567890"; // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7890"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone 1 = " + phone1.matches("^([(][0-9]{3}[)][ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("phone 2 = " + phone2.matches("^([(][0-9]{3}[)][ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("phone 3 = " + phone3.matches("^([(][0-9]{3}[)][ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("phone 4 = " + phone4.matches("^([(][0-9]{3}[)][ ][0-9]{3}[\\-][0-9]{4})$"));

        // ^4[0-9]{12}([0-9]{3})?$
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // Shouldn't match
        String visa3 = "4444444444444444"; // should match
        String visa4 = "4444"; // Shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));
    }
}
