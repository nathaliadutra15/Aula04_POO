package exemplos.exemplo01;

public class Pessoa {
    //atributos - característica
    String  nome;
    String telefone; //não é variavel, é atributo

    //métodos - ações
    void apresentar(){
        System.out.println("Olá! Eu sou " + nome);
    }

    String obterTelefone(){
        return telefone;
    }
    
}