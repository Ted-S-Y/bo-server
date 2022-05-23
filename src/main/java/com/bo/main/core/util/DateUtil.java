package com.bo.main.core.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by tjdudals20@gmail.com on 2020-02-14
 */
public class DateUtil {
    public static LocalDateTime StringToLocalDateTime(String date, String patten) {
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(patten));
    }

    public static String LocalDateTimeToString(LocalDateTime date, String patten) {
        return LocalDateTime.from(date).format(DateTimeFormatter.ofPattern(patten));
    }
}
