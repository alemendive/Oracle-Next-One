package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {
    public static void main(String[] args) {
        java.lang.String nombre = "Alura";
        String nombre2 = new String("Alura");

        System.out.println("Antes de metodo "+ nombre);
        nombre = nombre.replace('A', 'a');
        nombre = nombre.concat(" cursos online");
        nombre = nombre.toUpperCase();
        nombre = nombre.toLowerCase();
        char letra = nombre.charAt(3);
        int indice = nombre.indexOf("e");

        Object cuenta = new CuentaAhorros(200,320);
        printLine(nombre);
        printLine(letra);
        printLine(indice);
        printLine(new CuentaAhorros(200,300));

        StringBuilder builder = new StringBuilder("Ayuda");
        builder.append("-");
        builder.append("me ");
        builder.append("subi ");
        builder.append("en el ");
        builder.append("omnibus ");
        builder.append("equivocado ");
        String texto = builder.toString();
        System.out.println(texto);


        String nombre3 = "ALURA";
        CharSequence cs = new StringBuilder("al");

        nombre3 = nombre3.replace("AL", cs);

        System.out.println(nombre3);

    }

    public static void printLine(Object valor){
        System.out.println(valor.toString());
    }
}
