# Composite Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Composite** em Java, aplicado a um sistema de cardápio de restaurante.

## 📌 Estrutura

- **Classe abstrata**
  - `ItemCardapio` → define a interface comum para pratos e categorias, com atributo `descricao` e método abstrato `getConteudo()`.

- **Folha (Leaf)**
  - `Prato` → representa um item simples do cardápio, com preço e descrição.

- **Composto (Composite)**
  - `Categoria` → agrupa vários `ItemCardapio` (pratos ou outras categorias), permitindo composição hierárquica.

- **Classe de agregação**
  - `Cardapio` → mantém referência a um `ItemCardapio` (pode ser uma categoria ou prato) e exibe o conteúdo.

- **Classe de execução**
  - `Main` → instancia pratos, categorias e monta o cardápio.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/composite`.
3. Execute a classe `Main`.

## 💻 Saída esperada

Categoria: Pratos Principais
Prato: Lasanha - R$35.0
Prato: Pizza Margherita - R$40.0


## 🎯 Objetivo

O padrão **Composite** permite tratar objetos individuais e composições de objetos de forma uniforme.  
Neste exemplo, tanto `Prato` quanto `Categoria` são `ItemCardapio`, o que possibilita montar cardápios complexos sem diferenciar entre itens simples e agrupamentos.

