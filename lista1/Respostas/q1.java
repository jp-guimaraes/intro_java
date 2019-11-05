public class q1{
	public static void main(String[] args) {
               
        double nota1 = 8.5;
        double nota2 = 7.2;
             
        double media = (nota1+nota2)/2;

        System.out.println("Média calculada: ");
        System.out.println(media);
        
        if(media >=6){
            System.out.println("Aprovado");
        }
        else{
            if(media<3){
                System.out.println("Reprovado");
            }
            else{
                System.out.println("Recuperação");
            }
        }
        
    }
}

