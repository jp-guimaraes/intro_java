public class exemplo_02 {
	public static void main(String[] args) {
        
		int x = 10;
		int y = 5;

		boolean teste = x>y;

		System.out.println("antes do while");

		while(teste){
			System.out.println("dentro!!");
			x = x-1;
			teste = x>y;
		}
		

		System.out.println("depois do while");

    }
}

