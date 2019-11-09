import java.util.Random;

public class exemplo_05 {
    public static void main(String[] args) {
        //Inicializando objeto que gera valores aleatórios        Random random = new Random();
        Random random = new Random();

        // Gera um número inteiro aleatório entre 0 e 100
        int aleatorio = random.nextInt(101);
                
        System.out.println("O número gerado foi " + aleatorio);

    }
}

