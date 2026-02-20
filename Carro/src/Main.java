import br.com.fiapride.model.Carro;
public class Main {
    public static void main(String[] args) {
//Primeira instancia
        Carro meuCarro = new Carro();
        meuCarro.marca = "Volkswagen";
        meuCarro.motor = "4 Cilindros Boxer";
        meuCarro.numeroDePortas = 3;
//Segunda instancia
        Carro felipeCarro = new Carro();
        felipeCarro.marca = "Chevrolet";
        felipeCarro.motor = "4 Cilindros em linha";
        felipeCarro.numeroDePortas = 5;
        System.out.println("Meu carro é um " + meuCarro.marca + " com um motor " + meuCarro.motor + " e possui " + meuCarro.numeroDePortas + " portas");
        System.out.println("O carro do Felipe é um " + felipeCarro.marca + " com um motor " + felipeCarro.motor + " e possui " + felipeCarro.numeroDePortas + " portas");
    }
}