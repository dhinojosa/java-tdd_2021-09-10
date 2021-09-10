package com.xyzcorp.instructor.caesarshift;

import java.util.Objects;

public class CaesarShift {
    public static String encode(int shift, String string) {
        Objects.requireNonNull(string, "Original string cannot be null");
        if (string.isEmpty()) return string;
        return String.valueOf((char) (string.charAt(0) + shift));
    }
}
