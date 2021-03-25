package exercicios.exercicio02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio r = new Relogio();
        
        r.hora = 21;
        r.minuto = 04;
        r.segundo = 47;

        r.horario();
    }
    
}
