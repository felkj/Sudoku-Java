# 🧩 Sudoku em Java

Este é um projeto de Sudoku desenvolvido em **Java**, utilizando **Swing** para construção da interface gráfica. A aplicação permite que o jogador resolva um tabuleiro de Sudoku 9x9, com funcionalidades básicas como verificar o status do jogo, reiniciar e finalizar.

---

## ✨ Funcionalidades

- 🧠 **Geração do tabuleiro** visual com divisões 3x3.  
- 🔢 **Campos de entrada** que aceitam apenas números válidos (1 a 9).  
- 🔐 **Células fixas** são não-editáveis e destacadas visualmente.  
- ✅ **Verificação de status**: incompleto, com erros ou completo.  
- 🔁 **Reset** do tabuleiro com confirmação.  
- 🏁 **Finalização** do jogo com feedback ao usuário.  

---

## 📦 Estrutura do Projeto

```
src/
└── br/com/felkj/
    ├── Main.java                  # Classe principal para executar o jogo
    ├── model/
    │   └── Space.java             # Representação de uma célula do tabuleiro
    ├── service/
    │   └── BoardService.java      # Lógica do jogo, verificação de status, reset, etc.
    └── ui/custom/
        ├── frame/
        │   └── MainFrame.java     # Janela principal
        ├── screen/
        │   └── MainScreen.java    # Tela principal do jogo
        ├── input/
        │   └── NumberText.java    # Campo de entrada para os números
        ├── panel/
        │   └── …                  # Painéis visuais como setor e painel principal
        └── button/
            └── …                 # Botões customizados
```

## 🛠️ Tecnologias e Conceitos Usados

- **Java 17+**  
- **Swing (javax.swing)** para a interface gráfica  
- **Programação orientada a objetos**  
- **Padrões de projeto simples** (MVC simplificado)  

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/sudoku-java.git
cd sudoku-java/src
```
Compile os arquivos:
```bash
javac br/com/felkj/Main.java br/com/felkj/**/*.java
```
Execute o programa:
```bash
java br.com.felkj.Main
```



## ▶️ Adicione os dados de argumento


![Sudoku](/Argumento.png)


## Dados de teste: 

```
0,0;4,false 1,0;7,false 2,0;9,true 3,0;5,false 4,0;8,true 5,0;6,true 6,0;2,true 7,0;3,false 8,0;1,false 0,1;1,false 1,1;3,true 2,1;5,false 3,1;4,false 4,1;7,true 5,1;2,false 6,1;8,false 7,1;9,true 8,1;6,true 0,2;2,false 1,2;6,true 2,2;8,false 3,2;9,false 4,2;1,true 5,2;3,false 6,2;7,false 7,2;4,false 8,2;5,true 0,3;5,true 1,3;1,false 2,3;3,true 3,3;7,false 4,3;6,false 5,3;4,false 6,3;9,false 7,3;8,true 8,3;2,false 0,4;8,false 1,4;9,true 2,4;7,false 3,4;1,true 4,4;2,true 5,4;5,true 6,4;3,false 7,4;6,true 8,4;4,false 0,5;6,false 1,5;4,true 2,5;2,false 3,5;3,false 4,5;9,false 5,5;8,false 6,5;1,true 7,5;5,false 8,5;7,true 0,6;7,true 1,6;5,false 2,6;4,false 3,6;2,false 4,6;3,true 5,6;9,false 6,6;6,false 7,6;1,true 8,6;8,false 0,7;9,true 1,7;8,true 2,7;1,false 3,7;6,false 4,7;4,true 5,7;7,false 6,7;5,false 7,7;2,true 8,7;3,false 0,8;3,false 1,8;2,false 2,8;6,true 3,8;8,true 4,8;5,true 5,8;1,false 6,8;4,true 7,8;7,false 8,8;9,false

```



💡 Certifique-se de estar no diretório src/ ao compilar, se estiver seguindo a estrutura padrão.

🧪 Funcionalidades Futuras (Sugestões)
Geração automática de tabuleiros válidos

Suporte a níveis de dificuldade

Validação em tempo real

![Sudoku](/sudoku.png)

# Autor

Desenvolvido por Felipe (@felkj)
Estudante de Análise e Desenvolvimento de Sistemas e entusiasta em desenvolvimento web e jogos com boas narrativas.
