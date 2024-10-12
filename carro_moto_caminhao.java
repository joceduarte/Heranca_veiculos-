package br.edu.unisep.model;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numPortas);
    }
}

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

public class Caminhao extends Veiculo {
    private String tipoCarga;

    public Caminhao(String marca, String modelo, int ano, String tipoCarga) {
        super(marca, modelo, ano);
        this.tipoCarga = tipoCarga;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de carga: " + tipoCarga);
    }
}
