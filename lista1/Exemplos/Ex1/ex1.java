
public class ex1 {
	public static void main(String[] args) {
        System.out.println("Olá mundo, començando os testes com variáveis!");
        
        double nota1 = 8.5;
        double nota2 = 7.2;

        System.out.println("Notas informadas: ");
        System.out.println(nota1);
        System.out.println("e");
        System.out.println(nota2); 
        
        
        
        double media = (nota1+nota2)/2;

        System.out.println("Média calculada: ");
        System.out.println(media);
              
        
        boolean teste = (media >= 6.0);
        
        // Imprimindo o valor do booleano
        System.out.println(teste);
        
        if(teste) {
        	System.out.println("Aprovado!");
        }
        else {
        	System.out.println("Reprovado!");
        }
        
        System.out.println("Fim");
    }
}

