/**
 * Created by dzmitry.karayedau on 13-Apr-17.
 */
public class StringInverter {

    public static String invertString(String stringToInvert){
        if (stringToInvert == null){
            return null;
        }
        else{
            int stringLength = stringToInvert.length();
            if (stringLength < 2){
                return stringToInvert;
            }
            else{
                char[] invertedChars = new char[stringToInvert.length()];
                invertedChars = stringToInvert.toCharArray();
                String invertedString = new String(recursiveInvertString(0,invertedChars));
                return invertedString;
            }
        }
    }

    private static char[] recursiveInvertString(int step , char[] invertedString){
        char tempChar;
        int lastIndex = invertedString.length-1;

        tempChar = invertedString[0+step];
        invertedString[0+step] = invertedString[lastIndex-step];
        invertedString[lastIndex-step] = tempChar;

        if (invertedString.length/2 > step+1){
            invertedString = recursiveInvertString(step+1 , invertedString);
        }

        return invertedString;
    }

}
