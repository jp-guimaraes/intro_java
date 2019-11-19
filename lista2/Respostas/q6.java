import java.util.Random;  // Import the Scanner class
public class q6{
  public static void main(String[] args) {        

        Random random = new Random();

        // Gera um número inteiro aleatório entre 0 e 100
        int numero1 = random.nextInt(20);
        int numero2 = random.nextInt(20);

        System.out.println("Números gerados:");
        System.out.println(numero1);
        System.out.println(numero2);
        
        boolean teste1 = numero1 >80;
        boolean teste2 = numero2 >80;

        System.out.println(teste1);
        System.out.println(teste2);

        while(! (teste1 && teste2) ){            
            numero1 = random.nextInt(101);
            numero2 = random.nextInt(101);
            System.out.println(numero1);
            System.out.println(numero2);

            teste1 = numero1 >80;
            teste2 = numero2 >80;

            System.out.println(teste1);
            System.out.println(teste2);

        }
        
    }
} 