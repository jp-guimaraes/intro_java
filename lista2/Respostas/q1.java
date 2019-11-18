import java.util.Random;


public class q1 {
	public static void main(String[] args) {

		Random random = new Random();

        // Gera um número inteiro aleatório entre 0 e 100
        int aleatorio = random.nextInt(101);

        System.out.println("O número gerado foi:" + aleatorio);
		boolean teste;
        if(aleatorio > 50){
        	teste = true;
        }
        else{
        	teste = false;
        }
        

		System.out.println("antes do if");

		if(teste){
			System.out.println("Arroz!");
		}
		else{
			System.out.println("Feijão!");	
		}

		System.out.println("depois do if");

    }
}

