package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro("Leonardo", "229");
        System.out.println("Regarga passageiro 1");
        passageiro1.adicionarSaldo(5000.0);

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro("Felipe", "571");
        System.out.println("Regarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo + " | CPF: " + passageiro2.cpf);

        //Pagamento
        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);



    }
}