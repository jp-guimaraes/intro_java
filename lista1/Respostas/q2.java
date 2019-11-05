public class q2{
	public static void main(String[] args) {
        
        import java.util.Scanner;  // Import the Scanner class

        public class exemplo_02 {
        public static void main(String[] args) {
        System.out.println("Testando entrada de dados");
        
        Scanner meu_scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Qual é a sua idade?");

        
        int x = meu_scanner.nextInt();  

        



        double nota1 = 8.5;
        double nota2 = 7.2;
        double nota3 = 2.4;

        System.out.println("Notas informadas: ");
        System.out.println(nota1);
        System.out.println(",");
        System.out.println(nota2);
        System.out.println(" e ");
        System.out.println(nota3); 
        
        
        
        double media = (nota1+nota2+nota3)/3;

        System.out.println("Média calculada: ");
        System.out.println(media);
        
    }
}

