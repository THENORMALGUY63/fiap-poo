package br.com.fiapride.model;

public class Carro {
    public String marca;
    public String motor;
    public int numeroDePortas;
    public int rpmMaximo;
    public int potenciaMotor;

    
    public Carro() {}

    
    public void validarDesempenho() {
        if (this.rpmMaximo > 7000 && this.potenciaMotor < 150) {
            System.out.println("--- AVISO [" + this.marca + "] ---");
            System.out.println("Alerta: RPM muito alto para o motor!");
        } else {
            System.out.println("--- INFO [" + this.marca + "] ---");
            System.out.println("Motor funcionando normalmente (RPM: " + this.rpmMaximo + ", Potência: " + this.potenciaMotor + "cv).");
        }
    }
}