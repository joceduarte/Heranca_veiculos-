package br.edu.unisep.view;

public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Carro carro = new Carro("Ford", "Focus", 2015, 4);
        Moto moto = new Moto("Honda", "CG 160", 2018, 160);
        Caminhao caminhao = new Caminhao("Mercedes-Benz", "Actros", 2020, "Carga pesada");

        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(moto);
        frota.adicionarVeiculo(caminhao);

        frota.exibirDetalhesFrota();
    }
}
