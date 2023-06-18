package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

import java.util.Arrays;

public class TestArregloReferencias {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(23, 44);

        Object[] referencias = new Object[5];
        referencias[1] = cc;

        Cliente cliente = new Cliente();
        referencias[4] = cliente;

        Cliente obtenido = (Cliente) referencias[4];

        CuentaAhorros ca = new CuentaAhorros(44,55);
        referencias[3] = ca;

        System.out.println(referencias[1]);

        referencias[0] = new CuentaCorriente(11, 99);
        System.out.println(referencias[0]);

        // CASTEO
        CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
        System.out.println(cuenta);


        Arrays.stream(referencias).forEach(System.out::println);
    }
}
