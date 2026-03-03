import br.com.fiapride.model.Carro;

public class Main {
    public static void main(String[] args) {
        
        // Primeira Instância (Volkswagen)
        Carro meuCarro = new Carro("Volkswagen");
        meuCarro.setMotor("4 Cilindros Boxer");
        meuCarro.setNumeroDePortas(3);
        meuCarro.setPotenciaMotor(65);
        meuCarro.setRpmMaximo(4600);

        // Segunda Instância (Chevrolet)
        Carro felipeCarro = new Carro("Chevrolet");
        felipeCarro.setMotor("4 Cilindros em linha");
        felipeCarro.setNumeroDePortas(5);
        felipeCarro.setPotenciaMotor(112);
        felipeCarro.setRpmMaximo(6300);

        
        System.out.println("Meu carro é um " + meuCarro.getMarca() + " com motor " + meuCarro.getMotor() + ", " + meuCarro.getPotenciaMotor() + "cv, limite de " + meuCarro.getRpmMaximo() + " rpm e " + meuCarro.getNumeroDePortas() + " portas");
        System.out.println("O carro do Felipe é um " + felipeCarro.getMarca() + " com motor " + felipeCarro.getMotor() + ", " + felipeCarro.getPotenciaMotor() + "cv, limite de " + felipeCarro.getRpmMaximo() + " rpm e " + felipeCarro.getNumeroDePortas() + " portas");

        System.out.println("\n--- Analisando desempenho ---\n");

        meuCarro.validarDesempenho();
        felipeCarro.validarDesempenho();
    }
}