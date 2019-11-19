import java.util.Scanner;  // Import the Scanner class
public class q5 {
  public static void main(String[] args) {
        
         System.out.println("Entre com a primeira nota");
        double nota1 = meu_scanner.nextDouble();   
        
        System.out.println("Entre com a segunda nota");
        double nota2 = meu_scanner.nextDouble();

        System.out.println("Notas informadas: ");
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