package br.com.fiapride.model;

public class Carro {

    // Atributos
    public String marca;
    public String motor;
    public int numeroDePortas;
    public int rpmMaximo;
    public int potenciaMotor;

    // Construtor vazio
    public Carro() {}

    // Método de validação (Regra de Negócio)
    public void validarDesempenho() {
        // Regra ajustada: Só alerta se RPM for EXTREMO (> 7000) com baixa potência
        // Assim, 6300 RPM com 112cv passa como normal.
        if (this.rpmMaximo > 7000 && this.potenciaMotor < 150) {
            System.out.println("--- AVISO [" + this.marca + "] ---");
            System.out.println("Alerta: Rotação perigosamente alta para este motor!");
        } else {
            System.out.println("--- INFO [" + this.marca + "] ---");
            System.out.println("Motor operando normalmente (RPM: " + this.rpmMaximo + ", Potência: " + this.potenciaMotor + "cv).");
        }
    }
}