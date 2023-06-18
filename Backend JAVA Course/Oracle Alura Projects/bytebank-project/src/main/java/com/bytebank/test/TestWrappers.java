package com.bytebank.test;

public class TestWrappers {
    public static void main(String[] args) {

        Double numeroDoble = 33.0; // autoboxing
        Boolean verdadero = true; // autoboxing

        Double numeroDoble2 = Double.valueOf(33);
        System.out.println(numeroDoble2);

        String numeroString = "43"; // autoboxing
        String numeroString2 = new String("43");

        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);

        System.out.println(stringToDouble);
        System.out.println(stringToInteger);

        Number numero = Integer.valueOf(5);
        double numeroDoublePrim = numero.doubleValue(); // unboxing

        Boolean falso = Boolean.FALSE;

    }
}
