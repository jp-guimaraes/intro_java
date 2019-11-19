import java.util.Random;  // Import the Scanner class
public class q5{
  public static void main(String[] args) {        

        Random random = new Random();

        // Gera um número inteiro aleatório entre 0 e 100
        double nota1 = random.nextDouble()*10;
        double nota2 = random.nextDouble()*10;

        System.out.println("Notas geradas: ");
        System.out.println(nota1);
        System.out.println("e");
        System.out.println(nota2);         
               
        double media = (nota1+nota2)/2;

        System.out.println("Calculando");
        System.out.println(media);              
        
        
        if(media >= 6.0) {
          System.out.println("Aprovado!");
        }
        else {
            if(media <3){
                System.out.println("Reprovado!");
            }
            else{
                System.out.println("Recuperação!");    
            }
        }
        
        System.out.println("Fim!");
    }
} 