package com.emerline.ijl01_5.utils;

/**
 * Created by dzmitry.karayedau on 13-Apr-17.
 */
public class StringInverter {

    public static String invertString(String stringToInvert) {
        if (stringToInvert == null) {
            return null;

        } else {
            int stringLength = stringToInvert.length();
            if (stringLength < 2) {
                return stringToInvert;
            } else {
                String invertedString = new String(recursiveInvertString(0, stringToInvert));
                return invertedString;
            }
        }
    }

    private static String recursiveInvertString(int step, String invertedString) {
        char tempChar;
        int lastIndex = invertedString.length() - 1;
        StringBuilder InvString = new StringBuilder(invertedString);
        tempChar = InvString.charAt(0 + step);
        InvString.setCharAt(0 + step, InvString.charAt(lastIndex - step));
        InvString.setCharAt(lastIndex - step, tempChar);

        if (InvString.length() / 2 > step + 1) {
            invertedString = recursiveInvertString(step + 1, InvString.toString());
            return invertedString;
        }

        return InvString.toString();
    }

}
