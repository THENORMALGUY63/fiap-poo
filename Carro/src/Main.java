import br.com.fiapride.model.Carro;

public class Main {
    public static void main(String[] args) {
        
        // Primeira Instância (Volkswagen)
        Carro meuCarro = new Carro();
        meuCarro.marca = "Volkswagen";
        meuCarro.motor = "4 Cilindros Boxer";
        meuCarro.numeroDePortas = 3;
        meuCarro.potenciaMotor = 65;
        meuCarro.rpmMaximo = 4600;

        // Segunda Instância (Chevrolet)
        Carro felipeCarro = new Carro();
        felipeCarro.marca = "Chevrolet";
        felipeCarro.motor = "4 Cilindros em linha";
        felipeCarro.numeroDePortas = 5;
        felipeCarro.potenciaMotor = 112;
        felipeCarro.rpmMaximo = 6300;

        // Exibição dos dados
        System.out.println("Meu carro é um " + meuCarro.marca + " com um motor " + meuCarro.motor + " de " + meuCarro.potenciaMotor +  " cavalos, com um limite de " + meuCarro.rpmMaximo + " rpm, e possui " + meuCarro.numeroDePortas + " portas");
        System.out.println("O carro do Felipe é um " + felipeCarro.marca + " com um motor " + felipeCarro.motor + " de " + felipeCarro.potenciaMotor +  " cavalos, com um limite de " + felipeCarro.rpmMaximo + " rpm, e possui " + felipeCarro.numeroDePortas + " portas");

        System.out.println("\n--- Analisando desempenho ---\n");

        // Validação
        meuCarro.validarDesempenho();
        felipeCarro.validarDesempenho();
    }
}