package br.com.cpardin;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento<T extends Carro> {
    private List<T> carrosEstacionados;

    public Estacionamento() {
        carrosEstacionados = new ArrayList<>();
    }

    public void estacionar(T carro) {
        carrosEstacionados.add(carro);
    }

    public void listarCarros() {
        for (T carro : carrosEstacionados) {
            System.out.println(carro);
        }
    }

    public static void main(String[] args) {
        Estacionamento<Carro> estacionamento = new Estacionamento<>();

        Carro sedan = new Sedan("Honda Civic", "Prata");
        Carro hatchback = new Hatchback("Chevrolet Onix", "Vermelho");

        estacionamento.estacionar(sedan);
        estacionamento.estacionar(hatchback);

        estacionamento.listarCarros();
    }
}
