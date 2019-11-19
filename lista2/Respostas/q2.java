public class exemplo_02 {
    public static void main(String[] args) {
        
		Random random = new Random();

        // Gera um número inteiro aleatório entre 0 e 100
        int aleatorio = random.nextInt(101);


        boolean teste = true;
        if(aleatorio>85){
        	teste = true;
        }
        else{
        	teste = false;
        }


        System.out.println("antes do while");

        while(teste){
            System.out.println("dentro!");
        }       

        System.out.println("depois do while");

    }
}