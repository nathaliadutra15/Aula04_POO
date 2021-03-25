package exercicios.exercicio01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();

        v.marca = "Renault";
        v.modelo = "Sandero";
        v.consumo = 7.4;

        v.modeloCarro();

        System.out.println("Consumo: " + v.valorConsumo());
        
        

    }
    
}
