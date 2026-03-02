package br.com.fiapride.model;

// A Classe define a estrutura. Ela não é o passageiro real, é apenas o modelo.
public class Passageiro {
    // Atributos (Características)
    private String nome;
    private String cpf;
    private double saldo;

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
    // Método para PEGAR o saldo (Leitura)
    public double getSaldo() {
        return this.saldo; // Apenas devolve o valor, não altera nada.
    }

    // Método para DEFINIR o saldo (Escrita com Regra de Negócio!)
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
        }
    }

    // Faça o mesmo para o nome (sem regras complexas por enquanto)
    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    // Faça o mesmo para o cpf (sem regras complexas por enquanto)
    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
