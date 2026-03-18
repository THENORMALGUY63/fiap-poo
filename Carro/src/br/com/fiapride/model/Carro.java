package br.com.fiapride.model;

public class Carro {

    private String marca;
    private String motor;
    private int numeroDePortas;
    private int rpmMaximo;
    private int potenciaMotor;

    
    public Carro() {}

    public Carro(String marca) {
        this.marca = marca;
    }

    public Carro(String marca, String motor) {
        this.marca = marca;
        this.motor = motor;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getRpmMaximo() {
        return rpmMaximo;
    }

    public void setRpmMaximo(int rpmMaximo) {
        this.rpmMaximo = rpmMaximo;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    
    public void validarDesempenho() {
        
        if (this.rpmMaximo > 7000 && this.potenciaMotor < 150) {
            System.out.println("--- AVISO [" + this.marca + "] ---");
            System.out.println("Alerta: Rotação perigosamente alta para este motor!");
        } else {
            System.out.println("--- INFO [" + this.marca + "] ---");
            System.out.println("Motor operando normalmente (RPM: " + this.rpmMaximo + ", Potência: " + this.potenciaMotor + "cv).");
        }
    }
}