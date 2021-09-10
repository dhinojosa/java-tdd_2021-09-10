package com.xyzcorp.instructor.caesarshift;

public class CaesarShift {
    public static String encode(int shift, String string) {
        if (string.isEmpty()) return string;
        return String.valueOf((char)(string.charAt(0) + shift));
    }
}
