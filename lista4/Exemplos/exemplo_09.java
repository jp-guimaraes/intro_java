import java.util.Scanner;

public class exemplo_09 {
    public static double delta(double a, double b, double c){
        double delta = b*b - 4*a*c;
        return delta;
    }
    
    public static void baskara(double a,double b, double c){
        double d = delta(a,b,c);
        double x1 = (-b + Math.sqrt(d))/(2*a);
        double x2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("x1:" +x1);
        System.out.println("x2:" +x2);
    }    
    
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 0;
        baskara(a,b,c);       
    }
}

