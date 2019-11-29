import java.util.Random;
public class exemplo_01 {
    static double media(double x, double y) {
        double m = (x+y)/2;
        return m;
    }
    
    
    public static void main(String[] args) {     
    	//Inicializando objeto que gera valores aleatórios 
        Random random = new Random();
        int x; int y;
        
        for(int i=0;i<10;i++){
	        x = random.nextInt(101);   
	        y = random.nextInt(101);   
	    	System.out.println(media(x,y));
	    }
    }
}

