package br.com.cpardin;

public abstract class Carro {
    public String modelo;
    public String cor;

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Cor: " + cor;
    }
}