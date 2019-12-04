import java.util.Scanner;

public class q3{
    public static void avaliacao(double nota) {
        if (nota >= 6){
            System.out.println("APROVADO");
        }
        else if (nota < 3){
            System.out.println("REPROVADO");
        }
        else {
            System.out.println("RECUPERAÇÃO");
        }
    }
    public static double media(double a, double b){
        double m = (a+b)/2;
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a Primeira nota");
        double a = sc.nextDouble();
        System.out.println("Digite a Segunda nota");
        double b = sc.nextDouble();
        
        double x = media(a,b);
        avaliacao(x);        
    }
}


