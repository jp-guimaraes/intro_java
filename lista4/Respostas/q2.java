import java.util.Scanner;

public class q2{
    public static void funcao(double nota) {
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
    public static void main(String[] args){
        funcao(2);
        funcao(4);
    }
}
