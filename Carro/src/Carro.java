package br.com.fiapride.model;

public class Carro {
    
    private String marca;
    public String motor;
    public int numeroDePortas;
    public int rpmMaximo;
    public int potenciaMotor;

    
    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }
    
    public void validarDesempenho() {
        if (this.rpmMaximo > 7000 && this.potenciaMotor < 150) {
            System.out.println("--- AVISO [" + this.marca + "] ---");
            System.out.println("Alerta: RPM muito alto para o motor!");
        } else {
            System.out.println("--- INFO [" + this.marca + "] ---");
            System.out.println("Motor normal (RPM: " + this.rpmMaximo + ", Potência: " + this.potenciaMotor + "cv).");
        }
    }
}