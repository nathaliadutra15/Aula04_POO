package exercicios.exercicio01;

public class Veiculo {
    //atributos
    String modelo;
    String marca;
    Double consumo;

    //método para exibir os dados do carro
    void modeloCarro(){
        System.out.println("O modelo do carro é " + modelo);
        System.out.println("A marca do carro é " + marca);
    }
    
    Double valorConsumo(){
        return consumo;
    }
}
