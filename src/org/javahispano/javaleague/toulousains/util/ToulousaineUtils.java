package org.javahispano.javaleague.toulousains.util;

public class ToulousaineUtils {

    private static final boolean LOG_ACTIVATED = false;

    public static void log(String message) {
        log(message, ToulousainsLogLevel.INFO);
    }

    public static void log(String message, ToulousainsLogLevel logLevel) {
        if (LOG_ACTIVATED) {
            System.out.println(logLevel + " - Log Toulousain ---> " + message);
        }
    }
}
