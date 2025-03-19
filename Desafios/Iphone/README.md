# Diagramação de Classes do iphone
**Autores**
- Breno Alves
## 📌 Descrição
### Modelagem e Diagramação de um Componente iPhone
Neste desafio proposto pela DIO, fui responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## 🧑‍🏫 Sintaxe - Desafio
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

 ## 🛠️ Diagrama UML
 ```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar() void
        +pausar() void
        +despausar() boolean
        +selecionarMusica(String musica) void
    }

    class AparelhoTelefonico {
        +ligar(String int) void
        +atender() void
        +iniciarCorreioVoz() void
        +tocando() int
        +bloquear() void
        +desbloquear() boolean
    }

    class NavegadorInternet {
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class iPhone {
-pausado: boolean;
-desbloqueado: boolean;
    }

    iPhone <-- ReprodutorMusical
    iPhone <-- AparelhoTelefonico
    iPhone <-- NavegadorInternet
```
## 📚 Conceitos abordados
- POO
- Interfaces
- Diagrama UML
## 💻Tecnologias/Ferramentas utilizadas
- Java 23
- Apache NetBeans IDE 23
## 📌 Objetivo
Este desafio tem finalidade educacional, ajudando iniciantes a praticar o paradigma POO e desenvolvimento de diagrama UML. 🚀
