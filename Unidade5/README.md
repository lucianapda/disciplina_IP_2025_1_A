# Introdução à Programação - Unidade 5

Algumas anotações feitas em aula: [aulaAnotacoes.md](./aulaAnotacoes.md "aulaAnotacoes.md")

## Comandos de Controle de Fluxo: Repetição

### [Videoaula_5_1 (27:57)](https://furb-my.sharepoint.com/:v:/g/personal/dalton_furb_br/EVu-9RAkTJJHvaL3vEU-gTgBJwCoaMUzOc_MMreCCNiI-g?e=3qgqwJ> "link alternativo da primeira videoaula da unidade 5")  

### Comandos de Controle de Fluxo​: Repetição

- As estruturas de **Controle de Repetição** são utilizadas para repetir um determinado grupo de comandos por diversas vezes.​  
- As estruturas de **Repetição** também são conhecidas por **laços** ou **loop**.​  
- Se não montadas adequadamente, as estruturas de **Repetição** podem produzir laços infinitos em um programa, ou seja, o programa pode ficar eternamente executando o conjunto de instruções, até que seja retirado da memória de forma forçada.  
- As estruturas de **Controle de Repetição** mais comuns são (entre parênteses seu nome em Java):​  
  - baseadas em contador: para (for)​  
  - baseadas em condição: enquanto (while / do while)  
- Quando usar qual?​  
  - para (for): quando se sabe o número de vezes que o laço será executado;​  
  - enquanto (while): quando não se tem certeza sobre o número de vezes que o laço será executado, podendo inclusive nunca ser executado;​  
  - faça-enquanto (do-while): quando não se tem certeza sobre o número de vezes que o laço será executado, mas se sabe que ele tem que ser executado pelo menos uma vez;​  

#### Comandos de Controle de Fluxo​: Repetição: para faça (for)

- As estruturas de **repetição com contador** permitem a execução de um grupo de comandos num determinado número conhecido de vezes.  
- Exemplos:  
  
      Para 10 carros faça  
        lave o carro  
      
      Para 5 bombons faça  
        coma o bombom  

      para 40 alunos faça  
        calcule a média do aluno  

      Ler n  
      Para n valores faça  
        some o valor  

- Sintaxe e exemplo do para (**for** em java).  
- Em Português Estruturado:​  

      para contador de inicio a fim faça  
        bloco de comandos  
      fim para  

- Em Java (formato):​  

  ```java  
  for (expressão 1; expressão 2; expressão 3) {​  
    [bloco de comandos]​  
  }  
  ```  

- Em Português Estruturado:​  

      potencia = 1  
      para contador de 1 a 5 faça  
        potencia = potencia * x  
      fim para  

- Em Java:​  

  ```java  
  int potencia = 1;  
  for (int contador = 1; contador <= 5; contador++) {  
    potencia *= x;  
  }  
  ```  

- Em Java as expressões podem ser:​  
  - numéricas (real ou inteira) -  ex: for (double x = 10; x > 1; x -= 0.5)​  
  - caractere - ex: for (char x = 'a'; x <= 'z'; x++).  

- Importante:​  
  - **expressão 1**: é a expressão que define o valor de inicialização de uma variável de controle. Esta expressão é uma instrução de atribuição executada uma única vez antes de o laço ser iniciado​  
  - **expressão 2**: é a expressão que define a condição de teste da variável de controle. Ela é avaliada como verdadeira ou falsa no início de cada execução do laço. Se a expressão for verdadeira, o bloco de comandos do laço é executado. Se for falsa, o laço é encerrado e o controle passa para a instrução seguinte. Normalmente usa os operadores relacionais: >, <, >=, <=​  
  - **expressão 3**: é a expressão que define a forma de atualização da variável de controle a cada vez que o laço for repetido. Ela é executada ao final de cada repetição do laço. A atualização pode ser feita de forma crescente ou decrescente e em qualquer valor  

----------

## Introdução a Linguagem de Programação

### [Videoaula_5_2 (18:12)](<https://furb-my.sharepoint.com/:v:/g/personal/dalton_furb_br/Eb-ZrT74SrVLi0bE2XKGNoEBmk_64EXlbbPzp3exNuUttQ?e=oiXlIC> "link alternativo da segunda videoaula da unidade 5")  

### Comandos de Controle de Fluxo​: Repetição: enquanto (while / do while) - parte 1

- As estruturas de repetição condicionais avaliam uma determinada condição lógica para fazer a execução do laço de repetição. A condição sempre será avaliada como **verdadeira** ou **falsa**.  
- A estrutura condicional mais comum é o **enquanto-faça**. A estrutura **enquanto-faça** executa um conjunto de instruções enquanto a expressão lógica for avaliada como verdadeira.​
- A condição pode estar no início ou no fim do bloco de execução.  

- Exemplos:  
  
      Enquanto tem carros para lavar faça  
        lave o carro  
      
      Enquanto tem bombons para comer faça​  
        coma o bombom  

      Enquanto não encontrei o livro na biblioteca faça​  
        procure em outra estante​  

      Faça  
        calcule a média do aluno​  
      Enquanto tem alunos​  

### Comandos de Controle de Fluxo​: Repetição: enquanto (while)

- Sintaxe e exemplo do comando de controle de repetição **enquanto** com a condição no **início** do bloco.  

- Em Português Estruturado:​  

      enquanto <expressão-lógica> faça  
        <sequência-de-comandos>  
      fim enquanto  

- Em Java:​  
  
  ```java  
  while (expressão-lógica) {  
    <sequência-de-comandos>  
  }  
  ```  

- Em Português Estruturado:​  

      contador = 1  
      potencia = x  
      enquanto potencia <= 100 faça  
        potencia = potencia * x  
        contador = contador + 1  
      fim enquanto  

- Em Java:​  

  ```java  
  int contador = 1;  
  int potencia = x;  
  while (potencia <= 100) {  
    potencia *= x;  
    contador++;  
  }  
  ```  

### Comandos de Controle de Fluxo​: Repetição: enquanto (do while)

- Sintaxe e exemplo do comando de controle de repetição **enquanto** com a condição no **fim** do bloco.  

- Em Português Estruturado:​  

      faça  
        <sequência-de-comandos>  
      enquanto <expressão-lógica>  

- Em Java:​  

  ```java  
  do {  
    <sequência-de-comandos>  
  } while (expressão-lógica);  
  ```  

- Em Português Estruturado:​  

      contador = 1  
      potencia = x  
      faça  
        potencia = potencia * x  
        contador = contador + 1  
      enquanto potencia <= 100  

- Em Java:​  

  ```java  
  int contador = 1;  
  int potencia = x;  
  do {  
    potencia *= x;  
    contador++;  
  } while (potencia <= 100);  
  ```  

### Comandos de Controle de Fluxo​: Repetição: enquanto (while / do while) - parte 2

- Importante:  
  - expressão-lógica: é a expressão avaliada antes de cada repetição do laço. Quando seu resultado for **verdadeiro**, <sequência-de-comandos> é executada​  
  - na expressão lógica podem ser usados os operadores lógicos NAO, E ou OU, como uma estrutura de seleção do tipo se, por exemplo​  
- Em Java deve-se notar o uso de ponto e vírgula (;) após a expressão lógica **apenas** no do-while.​  

----------

### Principais Referências Bibliográficas​

- CARBONI, Irenice de Fátima. **[Lógica de programação](<https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=265888>)**. São Paulo : Pioneira Thomson Learning, 2003. 240 p, il.​  
- MANZANO, José Augusto N. G; OLIVEIRA, Jayr Figueiredo de. **[Algoritmos: lógica para desenvolvimento de programação](<https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=98280>)**. São Paulo : Erica, 1996. 265p.​
- SOUZA, Marco Antônio Furlan de. **[Algoritmos e lógica de programação](<https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=306850>)**. São Paulo : Pioneira Thomson, 2005. xxiii, 214 p, il.  
- VILARIM, Gilvan de Oliveira.
  **[Algoritmos: programação para iniciantes.](<https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=319911>)**
  2. ed. Rio de Janeiro : Ciência Moderna, 2004. xiv, 270 p, il.​  
- XAVIER, Gley Fabiano Cardoso. **[Lógica de programação](<https://bu.furb.br/consulta/portalConsulta/recuperaMfnCompleto.php?menu=rapida&CdMFN=267002>)**. 7. ed. São Paulo : SENAC, 2004. xxv, 378 p, il. 1 CD-ROM. (Nova série informática).​  

----------

## ⏭ [Unidade 6)](../Unidade6/README.md "Unidade 6")  
