package com.bo.main.core.util;

import org.slf4j.helpers.MessageFormatter;

public class StringUtils {
    public static String message(String messagePattern, String... args) {
        return MessageFormatter.arrayFormat(messagePattern, args).getMessage();
    }
}
