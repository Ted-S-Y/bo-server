package com.bo.main.core.util;

import java.util.regex.Pattern;

/**
 * Created by tjdudals20@gmail.com on 2020-02-14
 */
public class  FormatterUtil {
    public static String convertPhoneNumber(String number) {
        String regEx = "(\\d{3})(\\d{3,4})(\\d{4})";
        if(!Pattern.matches(regEx, number)) return "";
        return number.replaceAll(regEx, "$1-$2-$3");
    }
}
