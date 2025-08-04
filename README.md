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

src/
└── br/com/felkj/
├── Main.java # Classe principal para executar o jogo
├── model/
│ └── Space.java # Representação de uma célula do tabuleiro
├── service/
│ └── BoardService.java # Lógica do jogo, verificação de status, reset, etc.
├── ui/custom/
│ ├── frame/MainFrame.java # Janela principal
│ ├── screen/MainScreen.java # Tela principal do jogo
│ ├── input/NumberText.java # Campo de entrada para os números
│ ├── panel/… # Painéis visuais como setor e painel principal
│ └── button/… # Botões customizados

---

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
💡 Certifique-se de estar no diretório src/ ao compilar, se estiver seguindo a estrutura padrão.

🧪 Funcionalidades Futuras (Sugestões)
Geração automática de tabuleiros válidos

Suporte a níveis de dificuldade

Validação em tempo real

Timer para cronometrar a resolução

Salvamento e carregamento de partidas

📸 ##Captura de Tela
![Sudoku](/sudoku.png)

👨‍💻 ##Autor
Desenvolvido por Felipe (@felkj)
Estudante de Análise e Desenvolvimento de Sistemas e entusiasta em desenvolvimento web e jogos com boas narrativas.
