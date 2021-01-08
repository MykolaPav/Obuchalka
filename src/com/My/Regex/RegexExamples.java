package com.My.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9-.]+?@" +
            "[a-zA-Z0-9]+\\.[a-zA-Z]+$");

    public void regex1(String str)
    {
        Pattern pattern = Pattern.compile("[Бб]ог");
        Matcher matcher = pattern.matcher(str);
    }

    public boolean regexCheckEmail(String email)
    {
        Matcher matcher = emailPattern.matcher(email);
        return matcher.find();
    }

}
