package com.bytebank.test;

public class TestMain {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        int edad = 20;
        int edad2 = 15;
        int edad3 = 67;


        int [] edades = new int [5];

        edades[2] = 30;
        int tamanoArray = edades.length;
        System.out.println(tamanoArray);

        for (int i = 0; i < tamanoArray; i++){
            System.out.println(edades[i]);
        }
    }
}
