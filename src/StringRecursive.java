/**
 * Created by dzmitry.karayedau on 13-Apr-17.
 */
public class StringRecursive {
    private String inputString;
    private char[] inputChars;
    private char[] outputChars;

    public StringRecursive(String inputString){
        this.inputString = inputString;
        if (inputString != null){
            inputChars = this.inputString.toCharArray();
            outputChars = new char[inputChars.length];
        }
    }

    public String getInvertString(){
        if (inputString == null){
            return null;
        }
        else{
            int stringLength = inputString.length();
            if (stringLength > 1){
                this.recursiveInvert(0,stringLength-1);
            }
            else{
                outputChars = inputChars;
            }
            return new String(outputChars);
        }
    }

    private void recursiveInvert(int start, int end){
        outputChars[start] = inputChars[end];
        if (end > 0){
            this.recursiveInvert(start + 1 , end - 1);
        }
    }

}
