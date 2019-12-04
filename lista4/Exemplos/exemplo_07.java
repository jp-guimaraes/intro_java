import java.util.Scanner;

public class exemplo_07 {
 
    public static void imprima(String x){
        System.out.println("----------------");
        System.out.println(x);
        System.out.println("----------------");
    }
    public static double delta(double a, double b, double c){
        double delta = b*b - 4*a*c;
        return delta;
    }    
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 0;

        double valor_de_delta = delta(a,b,c);
        String aux = String.valueOf(valor_de_delta);
        imprima(aux);
        
        



       
    }
}

