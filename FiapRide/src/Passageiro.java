package br.com.fiapride.model;

// A Classe define a estrutura. Ela não é o passageiro real, é apenas o modelo.
public class Passageiro {
    // Atributos (Características)
    public String nome;
    public String cpf;
    public double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    public void adicionarSaldo (double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor de recaga deve ser maior que zero.");

            return;
        }
        this.saldo += valor;
        System.out.println("Regarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é invalido.");
            return;
        }
        if(this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }

}
