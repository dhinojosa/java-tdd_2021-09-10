package com.xyzcorp.instructor.caesarshift;

import java.util.Objects;

public class CaesarShift {
    public static String encode(int shift, String string) {
        Objects.requireNonNull(string, "Original string cannot be null");
        if (string.isEmpty()) return string;
        else {
            char c = string.charAt(0);
            int newShift = Character.isAlphabetic(c) ? shift : 0;
            return String.valueOf((char) (c + newShift));
        }
    }
}
