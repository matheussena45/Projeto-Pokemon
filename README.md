# PokéTads

**Aviso: Nintendo, por favor, não me processe, é apenas um projeto da faculdade 😅**

Este é um projeto de **jogo de batalha de Pokémons** desenvolvido em **Java**, utilizando **orientação a objetos**.

Inicialmente pensado para rodar no **console**, o projeto evoluiu e agora também conta com uma **interface gráfica**.

> Vale ressaltar que este jogo **não possui animações**, sendo todos os movimentos **estáticos**.  
> Opiniões e sugestões de melhorias são muito bem-vindas, para que eu possa dar continuidade e **melhorar o jogo cada vez mais**

## Tecnologias e Ferramentas Utilizadas

- **Java**  
  - Orientação a Objetos: **classes**, **interfaces**, **herança**, **polimorfismo**, **encapsulamento**  
  - Estruturas de controle e lógica de programação

- **Interface Gráfica em Java (Swing)**  
  - Utilização de **JFrame** para criar a janela principal do jogo  
  - Elementos visuais como **botões**, **textos**, **posição dos Pokémons** e outras telas do jogo
 
## Observação sobre as Imagens

Para rodar o projeto corretamente **localmente**, todas as imagens devem estar **nos caminhos corretos** utilizados pelo projeto.  

- Eu disponibilizei as imagens dentro de uma pasta, mas os caminhos que usei são **do meu computador**.  
- Portanto, se você quiser executar o projeto, **garanta que as imagens estejam no mesmo caminho relativo** que o projeto espera, caso contrário elas **não aparecerão**.

## Como funciona

- Dois Pokémons são selecionados **aleatoriamente**.  
- Os **golpes** de cada Pokémon também são escolhidos de forma **aleatória**.  
- O jogo continua até que um Pokémon **perca toda a vida**, declarando o outro como **vencedor**.

## Tela Inicial

A tela inicial do jogo apresenta **5 botões** com as seguintes funcionalidades:

- **Play**: Inicia um **novo jogo**.  
- **Start**: Inicia um **jogo salvo** anteriormente.  
- **Download**: Carrega o **progresso do jogo**.  
- **Menu**: Exibe a **Pokédex**.  
- **Exit**: Sai do jogo.

<img width="996" height="598" alt="image" src="https://github.com/user-attachments/assets/69a0b923-dfb7-454f-9f77-6139e80b0161" />

## Tela de Batalha

Durante a batalha, a tela apresenta:

- **Pokémons** posicionados em uma **arena**, no estilo **Pokémon GBA**.  
- **Golpes** exibidos no **canto inferior direito** da tela, para o jogador acompanhar as ações.  
- **Informações do vencedor** exibidas no **canto superior esquerdo** quando a batalha termina.  
- Um **botão "Next"** que permite voltar para o **menu principal** e iniciar uma **nova batalha**.

<img width="996" height="494" alt="image" src="https://github.com/user-attachments/assets/3064ecb5-12f9-4dda-85f7-140cb8a0342a" />

## Menu - Pokédex

No menu do jogo, a **Pokédex** funciona como um **monitor de informações** sobre os Pokémons:

- Os **Pokémons** ficam posicionados na tela, podendo ser **clicados individualmente**.  
- Ao clicar em um Pokémon, abre-se uma **tela de detalhes** que exibe:  
  - **Nome** do Pokémon  
  - **Dano** que ele causa  
  - **Vida**
  -  **Altura**
  -  **Peso** 
  - **Status** (vivo ou morto; atributo booleano `true`/`false`)  
  - **Quantidade de vitórias**  
    - Se o Pokémon **ganhar uma batalha**, o número de vitórias **aumenta em 1**.  
    - Se ele **morrer em uma batalha**, seu **status será `false`**.  
- Um **botão "Back"** permite voltar à Pokédex e visualizar outros Pokémons.


<img width="976" height="567" alt="image" src="https://github.com/user-attachments/assets/18861106-fed6-45da-8553-786e5e7ae567" />

## Pokédex 

<img width="551" height="417" alt="image" src="https://github.com/user-attachments/assets/8b538a1e-6145-4f57-a1db-28eda4e964f6" />

## Salvando e Carregando o Jogo

- Para **salvar o progresso**, basta clicar no **botão "Download"** na tela inicial.  
- Depois de salvar o jogo, você pode **fechar o jogo** a qualquer momento.  
- Ao executar o jogo novamente, clique em **"Start"** para **carregar o jogo salvo** e continuar de onde parou.
  
---

Este é o meu projeto! Espero que tenham gostado 🎮✨






