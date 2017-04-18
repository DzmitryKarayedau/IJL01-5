package com.emerline.ijl01_5;

import com.emerline.ijl01_5.utils.StringInverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input string for invert: ");
        String inputString = in.nextLine();

        System.out.printf(" Inputstring: %s%n", inputString);
        System.out.printf("Invertstring: %s%n", StringInverter.invertString(inputString));

    }
}
