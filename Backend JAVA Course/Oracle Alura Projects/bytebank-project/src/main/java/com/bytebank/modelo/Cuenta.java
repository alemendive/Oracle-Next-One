package com.bytebank.modelo;



public abstract class Cuenta implements Comparable<Cuenta> {

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




    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }



    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia:" + this.agencia
                + ", Titular: " + this.titular.getNombre();
    }

    @Override
    public boolean equals(Object obj){
        // Basado en valores
        Cuenta cuenta = (Cuenta) obj;
        return this.agencia == cuenta.getAgencia() &&
                this.numero == cuenta.getNumero();
    }

    @Override
    public int compareTo(Cuenta o){
        // orden natural : Numero agencia
        return Integer.compare(this.agencia, o.getAgencia());
    }

    public void setTitular(Cliente titular) {
        this.titular.setNombre(titular.getNombre());
        this.titular.setDocumento(titular.getDocumento());
    }

    public void depositar(double v) {
        this.saldo += v;
    }
}
