public class exemplo_05 {
    public static double delta(double a, double b, double c){
        double delta = b*b - 4*a*c;
        return delta;
    }
    public static void main(String[] args) {
        double a = 2;
        double b = 1;
        double c = 3;

        System.out.println(delta(a,b,c));
    }
}

