//package br.com.fiapride.model;
//
//public class Carro {
//
//    public String marca;
//    public String motor;
//    public int numeroDePortas;
//    public int rpmMaximo;
//    public int potenciaMotor;
//
//    // Keep your existing one
//    public Carro(int rpmMaximo, int potenciaMotor) {
//        this.rpmMaximo = rpmMaximo;
//        this.potenciaMotor = potenciaMotor;
//    }
//
//    // ADD THIS ONE:
//    public Carro() {
//        // This allows 'new Carro()' to work again!
//    }
//}
package br.com.fiapride.model;

public class Carro {
    public String marca;
    public String motor;
    public int numeroDePortas;
    public int rpmMaximo;
    public int potenciaMotor;

    // The empty constructor to fix your previous error
    public Carro() {}

    // The method with your custom logic
    public void validarDesempenho() {
        // Example: If RPM is over 6000 but HP is under 120
        if (this.rpmMaximo > 6000 && this.potenciaMotor < 120) {
            System.out.println("--- AVISO [" + this.marca + "] ---");
            System.out.println("Alerta: RPM alto (" + this.rpmMaximo + ") para baixa potência (" + this.potenciaMotor + "cv).");
        } else {
            System.out.println("--- INFO [" + this.marca + "] ---");
            System.out.println("Desempenho dentro dos padrões esperados.");
        }
    }
}