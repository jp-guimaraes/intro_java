public class exemplo_03 {
    public static void main(String[] args) {
        
        int contador = 0;
        
        System.out.println("antes do while");


        boolean teste;
        teste = (contador < 3);

        while(teste){
            System.out.println("dentro!!");
            contador = contador + 1;

            teste = (contador<3); 
        }       

        System.out.println("depois do while");

    }
}