# Lista de exercícios 1

## Instruções

* Todas as questões devem utilizar a linguagem de programação Java.
* Cada questão deve ter seu próprio código independente.
* O repositório contém alguns exemplos de códigos funcionais que ajudam na resolução da lista. A maioria das questões podem ser resolvidas alterando ou combinando esses códigos. Cada um deles é detalhado na seção a seguir chamada Revisão.
* Para submeter a lista para avaliação basta criar um único arquivo .rar ou .zip contendo todos os códigos implementados. Eles devem ser submetidos via SUAP.
 
## Revisão 

Dentro do repositório existe uma pasta denominada exemplos. Nela pode-se encontrar alguns códigos básicos mostrando a sintaxe de Java.

### Exemplo 1 - Código Olá mundo

No primeiro exemplo temos o famoso olá mundo, mostrando como imprimir no terminal.
```java
// Hello.java
public class ex1 {
	public static void main(String[ ] args) {
        System.out.println("Ola mundo!");
    }
}
````

### Exemplo 2 - Entrada de dados

O segundo exemplo mostra como fazer entrada de dados pelo terminal para variáveis dentro do seu programa.

```java
`import java.util.Scanner;  // Import the Scanner class

public class exemplo_02 {
	public static void main(String[] args) {
        System.out.println("Testando entrada de dados");
        
        Scanner meu_scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Qual é a sua idade?");

        // Para uma lista completa de opções 
        // https://www.w3schools.com/java/java_user_input.asp
        
        int x = meu_scanner.nextInt();  

        System.out.println("Nossa! Você já tem " + x + " anos??" ) ;       
        
    }
}


```


### Exemplo 3 - Calculando uma média

O terceiro exemplo mostra como manipular duas variáveis que armazenam duas notas para calcular a média entre elas.
```java
public class exemplo_03 {
  public static void main(String[] args) {
              
        double nota1 = 8.5;
        double nota2 = 7.2;

        System.out.println("Notas informadas: ");
        System.out.println(nota1);
        System.out.println("e");
        System.out.println(nota2);        
        
        double media = (nota1+nota2)/2;

        System.out.println("calculando: ");
        System.out.println(media);       
    }
}
```



### Exemplo 4 - Controle de fluxo

O quarto exemplo  mostra como manipular duas variáveis que armazenam duas notas para calcular a média entre elas.
```java
public class exemplo_03 {
  public static void main(String[] args) {
        
        double nota1 = 8.5;
        double nota2 = 7.2;

        System.out.println("Notas informadas: ");
        System.out.println(nota1);
        System.out.println("e");
        System.out.println(nota2);         
               
        double media = (nota1+nota2)/2;

        System.out.println("Calculando");
        System.out.println(media);              
        
        boolean teste = (media >= 6.0);
        
        // Imprimindo o valor do booleano
        System.out.println(teste);
        
        if(teste) {
          System.out.println("Aprovado!");
        }
        else {
          System.out.println("Reprovado!");
        }
        
        System.out.println("Fim!");
    }
} 
```


## Questões
1. Crie um programa em Java que calcule a média entre três notas.
1. Crie um programa que peça duas notas ao usuário e calcule a média entre elas.
1. Faça um programa que pergunte a idade ao usuário. Processe essa entrada e diga se o usuário é maior de idade ou não.
1. Faça um programa que calcule a área de um quadrado de lado L. O tamanho L deve ser pedido ao usuário.
1. Crie um programa que, dado duas notas fornecidas pelo usuário, diga se ele foi APROVADO (média >= 6), se ele está REPROVADO (média <3), ou em recuperação (caso contrário).
1. Faça um programa que calcula a média ponderada entre 3 notas. Tanto as notas quanto os pesos das notas devem ser pedidos ao usuário.
