package com.bytebank.modelo;

/**
 * @version 1.0
 * @alemendive
 */

public abstract class Cuenta {

    private static int total;
    private final int agencia;
    private final int numero;
    private final Cliente titular = new Cliente();
    protected double saldo;

    /**
     * Instancia una cuenta usando agencia y numero
     */
    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total++;
    }

    public abstract void deposita(double valor);

    public double getSaldo() {
        return saldo;
    }

    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error devuelve una excepecion.
     *
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if (this.saldo >= valor) {
            try {
                this.saca(valor);
            } catch (SaldoInsuficienteException e) {
                e.printStackTrace();
            }
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
