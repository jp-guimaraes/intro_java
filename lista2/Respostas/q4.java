public class q3 {
    public static void main(String[] args) {
        
        int contador = 0;              

		Random random = new Random();       

        while(contador < 100){
            contador = contador + 1;             
            // Gera um número inteiro aleatório entre 0 e 100
        	int aleatorio = random.nextInt(101);
        	System.out.println(aleatorio);
            
        }              
    }
}