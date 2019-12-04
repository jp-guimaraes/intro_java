import java.util.Scanner;

public class exemplo_06 {
    public static double area_quadrado(double lado){
        double area = lado*lado;
        return area;
    }
    public static double area_circulo(double raio){
        double area = 3.14 * raio*raio;
        return area;
    }
    public static void main(String[] args) {
        Scanner meu_scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado");
        double x = meu_scanner.nextDouble();  

        double area = area_quadrado(x);
        System.out.println("A area do quadrado é:" + area);

       
    }
}

