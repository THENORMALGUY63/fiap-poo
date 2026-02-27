//import br.com.fiapride.model.Carro;
//public class Main {
//    public static void main(String[] args) {
////Primeira instancia
//        Carro meuCarro = new Carro();
//        meuCarro.marca = "Volkswagen";
//        meuCarro.motor = "4 Cilindros Boxer";
//        meuCarro.numeroDePortas = 3;
//        meuCarro.potenciaMotor = 65;
//        meuCarro.rpmMaximo = 4600;
////Segunda instancia
//        Carro felipeCarro = new Carro();
//        felipeCarro.marca = "Chevrolet";
//        felipeCarro.motor = "4 Cilindros em linha";
//        felipeCarro.numeroDePortas = 5;
//        felipeCarro.potenciaMotor = 112;
//        felipeCarro.rpmMaximo = 6300;
//
//        System.out.println("Meu carro é um " + meuCarro.marca + " com um motor " + meuCarro.motor + " e possui " + meuCarro.numeroDePortas + " portas");
//        System.out.println("O carro do Felipe é um " + felipeCarro.marca + " com um motor " + felipeCarro.motor + " de " + felipeCarro.potenciaMotor +  " cavalos, com um limite de " + felipeCarro.rpmMaximo + " rpm, e possui " + felipeCarro.numeroDePortas + " portas");
//    }
//}
public class Main {
    public static void main(String[] args) {
        // Primeira instancia (Volkswagen)
        Carro meuCarro = new Carro();
        meuCarro.marca = "Volkswagen";
        meuCarro.rpmMaximo = 4600;
        meuCarro.potenciaMotor = 65;

        // Segunda instancia (Chevrolet)
        Carro felipeCarro = new Carro();
        felipeCarro.marca = "Chevrolet";
        felipeCarro.rpmMaximo = 6300; // High RPM
        felipeCarro.potenciaMotor = 112; // Lower HP than 120

        // Testing the logic for both:
        meuCarro.validarDesempenho();    // Will likely say "Padrões esperados"
        felipeCarro.validarDesempenho(); // Will trigger the "AVISO"
    }
}