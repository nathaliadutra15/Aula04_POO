package exercicios.exercicio02;

public class Relogio {
    int hora; int minuto; int segundo;

    //Método
    void horario(){

       // System.out.println(hora + ":" + minuto + ":" + segundo);
       // print formatado (Formato + variaveis) 
       //%d = numero inteiro (o numero entre % e a letra, representa a quantidade de casas decimais)
       System.out.printf("%02d:%02d:%02d\n",hora,minuto,segundo);


    }
    
}
