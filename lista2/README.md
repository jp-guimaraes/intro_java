# Lista de exercícios 2

## Instruções

* Todas as questões devem utilizar a linguagem de programação Java.
* Cada questão deve ter seu próprio código independente.
* O repositório contém alguns exemplos de códigos funcionais que ajudam na resolução da lista. A maioria das questões podem ser resolvidas alterando ou combinando esses códigos. Cada um deles é detalhado na seção a seguir chamada Revisão.
* Para submeter a lista para avaliação basta criar um único arquivo .rar ou .zip contendo todos os códigos implementados. Eles devem ser submetidos via SUAP.
 
## Revisão 

Dentro do repositório existe uma pasta denominada exemplos. Nela pode-se encontrar alguns códigos básicos mostrando a sintaxe de Java.

### Exemplo 1 - Recordando o if/else

No primeiro exemplo temos uma recapitulação do if/else
```java
public class exemplo_01 {
    public static void main(String[] args) {        
        boolean teste = true;
        System.out.println("antes do if");
        if(false){
            System.out.println("Arroz!");
        }
        else{
            System.out.println("Feijão!");  
        }
        System.out.println("depois do if");
    }
}
```

Quando a variável `teste` é verdadeira o conteúdo do `if` é executado. Caso contrário, ou seja, quando o conteúdo da variável `teste` é falsa, as instruções que estão no `else` é que são executadas.

### Exemplo 2 - Estruturas de repetição - `while`

O comando while tem um funcionamento muito parecido com o `if`. Entretanto, ao invés de criar uma mera estrutura de decisão ele embute uma estrutura de repetição. Veja:
```java
public class exemplo_02 {
    public static void main(String[] args) {
        
        boolean teste = true;

        System.out.println("antes do while");

        while(teste){
            System.out.println("dentro!");
        }       

        System.out.println("depois do while");

    }
}
```

Assim como no `if`, a variável dentro dos parênteses, neste caso `teste` controla se as instruções dentro do `while` serão ou não executadas. Repare que se `teste = true`, a instrução de impressão da mensagem `depois do if` nunca será executada já que, sempre depois de imprimir `dentro!` o teste continua sendo `true` e voltando a entrar dentro do while e executar a impressão indefinidamente! Esse tipo de situação é chamado de **loop infinito**.


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
