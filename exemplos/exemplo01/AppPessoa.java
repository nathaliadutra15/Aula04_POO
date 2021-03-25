package exemplos.exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa(); //instanciar um objeto do tipo 'pessoa'
        Pessoa p2 = new Pessoa();
        String telefone; //variavel somente para o main

        p.nome = "Nathália";
        p.telefone = "11956581503";
        p.apresentar();
        telefone = p.obterTelefone();
        System.out.println(telefone);

        p2.nome = "Dutra";
        p2.telefone = "11956581503";
        p2.apresentar();
    }

}
