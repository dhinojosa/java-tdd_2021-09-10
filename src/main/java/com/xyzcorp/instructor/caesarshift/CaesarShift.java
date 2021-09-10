package com.xyzcorp.instructor.caesarshift;

import java.util.Objects;

public class CaesarShift {

    public static final int SMALL_A = 97;
    public static final int ALPHA_SIZE = 26;

    public static String encode(int shift, String string) {
        Objects.requireNonNull(string, "Original string cannot be null");
        if (string.isEmpty()) return string;
        StringBuilder builder = new StringBuilder();
        for (char c : string.toCharArray()) {
            builder.append(encodeCharacter(shift, c));
        }
        return builder.toString();
    }

    private static char encodeCharacter(int shift, char c) {
        if (!Character.isAlphabetic(c)) return c;
        return (char) ((((c - SMALL_A) + shift) % ALPHA_SIZE) + SMALL_A);
    }
}
