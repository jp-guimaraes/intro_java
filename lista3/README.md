# Lista de exercícios 3

## Instruções

* Todas as questões devem utilizar a linguagem de programação Java.
* Cada questão deve ter seu próprio código independente.
* O repositório contém alguns exemplos de códigos funcionais que ajudam na resolução da lista. A maioria das questões podem ser resolvidas alterando ou combinando esses códigos. Cada um deles é detalhado na seção a seguir chamada Revisão.
* Para submeter a lista para avaliação basta criar um único arquivo .rar ou .zip contendo todos os códigos implementados. Eles devem ser submetidos via SUAP.

## Biblioteca Auxiliar


## Revisão 

Dentro do repositório existe uma pasta denominada exemplos. Nela pode-se encontrar alguns códigos básicos mostrando a sintaxe de Java.

### Exemplo 1 - Recordando o while com a variável auxiliar para contar repetições

No primeiro exemplo temos uma recapitulação do while com o uso da variável auxiliar para auxiliar a contar repetições
```java
public class exemplo_01 {
    public static void main(String[] args) {
        
        int contador = 0;        
        
        while(contador < 5){            
            System.out.println("teste!");
            contador = contador + 1;
            System.out.println(contador);
        }               

    }
}
```
Enquanto o valor da variável `contador` é menor do que 5, a string "teste" é impressa junto com o valor da variável contador. Depois, essa variável auxiliar é incrementada. Depois de 4 iterações, o teste falha e o programa deixa o laço.

### Exemplo 2 - Estruturas de repetição - `for`

Essa estrutura do while com a variável auxiliar é tão importante e tão usada que a maioria das linguagens tem uma sintaxe própria para ela. No caso de java, trata-se do `for`. Ele é recomendado para quando se sabe exatamente quantas vezes deve-se repetir uma estrutura de código.


Em Java, implementa-se o `for` da seguinte forma:

```java
for (int i = 0; i < 5; i++) {
  // instruções executadas 4 vezes
  // tiver seu valor true
}
````

Veja o exemplo 2:
```java
for (int contador = 0; contador < 5; contador++) {
  System.out.println("teste!");
  contador = contador + 1;
  System.out.println(contador);
}
```

O programa do exemplo 2 faz exatamente a mesma coisa do programa do exemplo 1, que usa o while. A variável contador, entrentanto, pode ser embutida no `for`. Geralmente, se designa nomes menores para essas variáveis auxiliares como por exemplo `i`,`j` ou `k`.

### Exemplo 3 - Controlando a repetição

O terceiro exemplo mostra como executar um loop num número finito de vezes. Isso é feito através de uma variável auxiliar que vamos chamar de `contador`. Veja:
```java
public class exemplo_03 {
    public static void main(String[] args) {        
       for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
```
O primeiro parâmetro do loop com for é justamente o nome da variável do contador. No caso do exemplo 3, `i`. O segundo parâmetro é a condição de parada. No exemplo 3, `i<5`. E o último parâmetro é o incremento. Nesse caso, `i++` significa que a cada iteração `i= i+1`. Cada um desses parâmetros é separado por ponto e vírgula. 

### Exemplo 4 - Mudando os parâmetros do loop com `for`

```java
public class exemplo_04 {
    public static void main(String[] args) {        
       for (int i = -5; i < 20; i = i+2) {
            System.out.println(i);
        }
    }
}
```

Nesse caso, o contador é inicalizado em -5, o teste é `i <20` e o incremento é feito de 2 em 2.

## Questões
1. Modifique o Exemplo 1 para que o mesmo possa gerar um número aleatório. A variável `teste` vai ser `true` se esse número for maior do que 50 e `false` caso contrário.

1. Modifique o Exemplo 2 para gerar um número aleatório. A variável `teste` vai ser `true` se o número aleatório gerado for maior do que 85. 

1. Modifique o Exemplo 3 para que o novo programa imprima de 1 a 10 usando o `while`.

1. Faça um programa que imprima 100 números aleatórios inteiros. 

1. Crie um programa que, dado duas notas aleatórioas, calcula a média entre eles. Diga se ele foi APROVADO (média >= 6), se ele está REPROVADO (média <3), ou em recuperação (caso contrário). As notas devem ser geradas aleatóriamente.

1. Crie um programa que, enquanto não gera dois números aleatóriamente maiores do que 10, não para a execução.
