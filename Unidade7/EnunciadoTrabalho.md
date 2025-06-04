## Jogo "Caça ao Tesouro" 
# Requisitos:
- Duplas
- Linguagem de programação Java
- Introdução a orientação a objetos
- Utilização somente de conceitos e comandos vistos em Sala de Aula

# Enunciado:
Implemente, em linguagem Java, o jogo Caça ao Tesouro, no qual um único jogador percorre uma matriz 8x8 em busca de um tesouro escondido.

# Regras do jogo:
- O tabuleiro é representado por uma matriz de 8 linhas por 8 colunas (char[][]).
- O tesouro está escondido em uma posição aleatória da matriz, gerada automaticamente no início do jogo.
- O jogador começa na posição (0,0) e pode se mover para cima, para baixo, para a esquerda ou para a direita, desde que permaneça dentro dos limites da matriz.
- A cada jogada, o jogador escolhe a direção do movimento.
- O jogo termina quando o jogador encontra o tesouro.

# Requisitos do jogo:
- Criar uma classe Jogo com o método iniciar() que controla o loop principal.
- Utilizar uma matriz 8x8 do tipo char para representar o tabuleiro.
- Usar Scanner para ler a direção que o jogador deseja seguir (DIREITA, ESQUERDA, ACIMA, ABAIXO).
- Marcar a posição atual do jogador na matriz com o caractere 'P' e o restante com '-'. O tesouro é marcado com 'T', mas só deve ser visível após o jogador encontrá-lo.
- Exibir o tabuleiro atualizado a cada jogada.
- Se o jogador tentar se locomover para uma posição que ultrapasse a borda do tabuleiro, deve-se exibir uma mensagem para ele solicitando que jogue novamente.

# Exemplo de console (tela):
Tabuleiro:  
P - - - - - - -  
\- - - - - - - -  
\- - - - - - - -  
\- - - - - - - -  
\- - - - - - - -  
\- - - - - - - -  
\- - - - - - - -  
\- - - - - - - -  
Digite a direção para jogar (ESQUERDA, DIREITA, ACIMA OU ABAIXO: )

# O que implementar:
- Crie uma classe Jogo com o método iniciar() que controla o loop principal.
- Utilize uma matriz 8x8 do tipo char para representar o tabuleiro.
- Use Scanner para ler a direção que o jogador deseja seguir.
- Marque a posição atual do jogador na matriz com o caractere 'P', e o restante com '-'. O tesouro é marcado com 'T', mas só deve ser visível após o jogador encontrá-lo.
- O jogador inicia na posição 0, 0.
- O tesouro é gerado de forma aleatória em uma posição válida dentro da matriz.
- Exiba o tabuleiro atualizado a cada jogada.
- Ao final, exiba o percurso que o jogador fez no mapa (saindo da origem até chegar no tesouro).
- Devem existir duas classes: a classe Principal (contendo somente método main e construtor) e a classe Jogo.

# Entrega e avaliação:
- Um membro da sua equipe deverá postar somente DOIS ARQUIVOS .JAVA no AVA 
- No código .java deve conter como um comentário o nome de cada um da dupla
- A entrega poderá ser feita até as 7h 30 do dia 23/06.
- Para validar a entrega a dupla terá que apresentar o trabalho individualmente para a professora que fará algumas perguntas durante a apresentação, com o objetivo de validar o seu conhecimento em relação ao código-fonte produzido.
- Assim que a dupla finalizar, poderá entregar o trabalho e fazer a apresentação.
 

# Observação: 
Coloque o nome da sua equipe no AVA!

Bons código :)
