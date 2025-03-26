# JavaFarm 🌾 - Jogo de Simulação de Fazenda 🌱

**JavaFarm** é um jogo de simulação de fazenda onde o objetivo é plantar e colher produtos, armazenando-os no celeiro. O jogo utiliza classes que representam diferentes produtos (como batata, cenoura e morango), terrenos para plantação, um celeiro para armazenamento e uma fazenda que gerencia as ações.

## Funcionalidades 🌟

- **Produtos**: Batata, Cenoura e Morango são representados por classes com atributos como tamanho, tempo de vida e tempo de crescimento. O jogador pode plantar, colher e armazenar esses produtos.
  
- **Terreno**: Cada terreno pode receber um produto por vez. O jogador pode plantar, colher e verificar se o terreno está ocupado.

- **Celeiro**: O celeiro armazena os produtos. Possui métodos para armazenar, consumir e verificar a ocupação do espaço.

- **Fazenda**: A fazenda gerencia os terrenos e a plantação dos produtos, verificando se há espaço no celeiro e se o terreno está livre.

## Requisitos

- Java 8 ou superior

## Estrutura do Projeto

- **`model/`**: Contém as classes que representam os produtos (Batata, Cenoura, Morango).
- **`storage/`**: Contém as classes que representam os terrenos e o celeiro (Terreno, Celeiro, Fazenda).
- **`controller/`**: Contém a lógica para o controle das ações do jogo.
- **`utils/`**: Contém utilitários gerais para o jogo.

## Como Rodar 🚀

1. Clone o repositório:

```bash
   git clone https://github.com/NicolasRAlves/javafarm.git
```

2. Navegue até o diretório do projeto.

```bash
    cd javafarm
```

3. Execute o arquivo `App.java` para rodar o jogo.

## Diagrama de Classe

O diagrama de classe do projeto é composto pelas seguintes classes principais:

- **Produto**: Batata, Cenoura, e Morango (representam os produtos plantados).
- **Terreno**: Representa as parcelas de terra onde os produtos são plantados.
- **Celeiro**: Armazena os produtos colhidos.
- **Fazenda**: Gerencia os terrenos e a plantação.

## Métodos Importantes

### Produto (Batata, Cenoura, Morango) 

- **crescer()**: Incrementa o tempo de vida e aumenta o tamanho do produto, se necessário.
- **podeColher()**: Verifica se o produto atingiu o tamanho máximo e pode ser colhido.
- **getImagem()**: Retorna o endereço da imagem do produto conforme seu tamanho.

### Terreno

- **plantar()**: Planta um produto no terreno.
- **colher()**: Remove o produto e o armazena no celeiro.
- **estaOcupado()**: Verifica se o terreno já está ocupado.

### Celeiro

- **armazenar()**: Armazena duas unidades do produto no celeiro.
- **consumir()**: Remove uma unidade do produto armazenado.
- **getEspacoDisponivel()**: Retorna o espaço disponível no celeiro.
- **celeiroCheio()**: Verifica se o celeiro está cheio.

### Fazenda 

- **plantarProduto()**: Verifica se há espaço no celeiro e se o terreno está livre, e planta o produto no terreno.
- **colherProduto()**: Colhe o produto do terreno e o armazena no celeiro.

## Contribuições 🤝

Sinta-se à vontade para contribuir com melhorias, reportar bugs ou enviar pull requests.
