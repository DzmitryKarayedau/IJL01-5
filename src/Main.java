import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input string for invert: ");
        String inputString = in.nextLine();

        System.out.println(String.format(" Inputstring: %s", inputString));
        System.out.println(String.format("Invertstring: %s", StringInverter.invertString(inputString)));

    }
}
