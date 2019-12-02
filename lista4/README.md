# Lista de exercícios 4

## Instruções

* Todas as questões devem utilizar a linguagem de programação Java.
* Cada questão deve ter seu próprio código independente.
* O repositório contém alguns exemplos de códigos funcionais que ajudam na resolução da lista. A maioria das questões podem ser resolvidas alterando ou combinando esses códigos. Cada um deles é detalhado na seção a seguir chamada Revisão.
* Para submeter a lista para avaliação basta criar um único arquivo .rar ou .zip contendo todos os códigos implementados. Eles devem ser submetidos via SUAP.

---

Essa lista tem como objetivo explorar a modularização do código através das funções. Elas permitem uma maior organização, reaproveitamento de código, etc.

### Exemplo 1 - Olá mundo das funções

```java
public class exemplo_01 {
    public static void funcao_exemplo(){
        System.out.println("Olá mundo!");
        System.out.println("Está impressão foi requisitada de dentro de uma função!");
        }
    public static void main(String[] args) {
        funcao_exemplo();
        }
}
```

No exemplo acima temos uma função chamada `funcao_exemplo` que contém apenas uma instrução, imprimir na tela "Olá mundo!". Em geral, para declarar uma função deve-se dizer qual deve ser a entrada para ela, seu nome e a saída.  Dessa forma segue a lógica na declaração de uma função:

```java
saida nome_da_função(entrada){
    instrução 1
    ....
    instrução N
}
```
`void` (vazio em tradução livre do inglês) é a palavra reservada para dizer que não existe retorno de uma função.
Nossa função teste, por exemplo, não retorna nenhuma variável. Observe que dentro dos parênteses também não temos nenhuma variável. Isso quer dizer que não temos também nenhuma saída associada a nossa função. Ela apenas executa a impressão da string `"Olá mundo!"` na tela.

Por sinal, vale esclarecer aqui que o comando `println` é uma função cujo *parâmetro*, ou seja, a **entrada**, é a string `"Olá mundo!"`. Essa função tem como objetivo escrever no terminal o conteúdo da variável que é passada como *parâmetro* para essa função. No caso, a string `"Olá mundo!"`.

Repare que nossa função teste é uma função que chama outra função! Aí está a modularidade. Isso é super comum em programação! O próprio `main` é também uma função. A função que é executada quando o programa é iniciado.

Vamos recapitular então o nosso primeiro programa Hello World. Você consegue entender melhor agora cada instrução?

```java
public class exemplo_01 {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        }
}
```

Por hora vamos abstrair algumas palavras chave como `public`, `class`, e `static` por enquanto. O olá mundo é um programa que possui uma única função chamada `main`. Essa é uma função especial que é executada quando o programa é iniciado. A única instrução que esse programa tem é chamar uma função que imprime na tela o que é passado como parâmetro para ela, no caso, a string `Olá mundo!`. A função `println` se preocupa em desenhar na tela do computador essa string. Não precisamos nos preocupar com posicionamento de pixel nenhum, cores, resolução de tela, sistema operacional, nada disso! Isso tudo está abstrato para o programador, **encapsulado** (essa é a palavra chave) pela função!

### Exemplo 2 - Encapsulado código

Voltando ao nosso programa teste apresentado no começo dessa seção, temos uma função que não tem entrada nem saída, mas ela tem **encapuslada nela** duas instruções de impressão na tela. Dessa forma, qual seria a saída do exemplo 2?

```java
public class exemplo_02 {
    public static void funcao_exemplo(){
        System.out.println("Olá mundo!");
        System.out.println("Está impressão foi requisitada de dentro de uma função!");
        }
    public static void main(String[] args) {
        funcao_exemplo();
        funcao_exemplo();
        }
}
```

Espero que você tenha pensado que a saída do exemplo 2 é exatamente igual a do primeiro exemplo mas duplicada, isso porque a função foi chamada duas vezes!

Vamos agora mostrar como passar parâmetros para a função. Veja o exemplo a seguir:

### Exemplo 3 - Entrada de dados na função

```java
public class exemplo_03 {
    public static void funcao_exemplo(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        funcao_exemplo(1,2);
        int teste1 = 1;
        int teste2 = 2;
        funcao_exemplo(teste1,teste2);
    }
}
```

O exemplo acima mostra uma simples função que soma dois números inteiros `a` e `b`. Quando a função é chamada no `main` duas variáveis devem ser passadas como parâmetros para que a função seja executada. Isso pode ser feito de forma direta, como a primeira instrução do main `funcao_exemplo(1,2)` ou por meio de variáveis declaradas previamente `funcao_exemplo(teste1,teste2)`. Separa-se os parâmetros por meio de vírgulas no uso. Na declaração usa-se também as vírgulas deixando claro o tipo de cada variável. Como nos exemplos anteriores, caso não haja parâmetro, ou seja, entradas para a função, deve-se deixar apenas os parênteses.

### Exemplo 4 - Saída de dados da função