# Leitura de Arquivo e Conversão de Dados para XML

Atividade prática do curso **EBAC Back-end Java v2**, desenvolvida para exercitar leitura de arquivos e transformação de registros em objetos Java.

## O que o programa faz

1. Lê o arquivo `pessoas.txt`, que contém um registro por linha.
2. Separa os campos usando ponto e vírgula (`;`).
3. Converte os dados de cada linha em um objeto `Pessoa`.
4. Gera uma representação em XML com os dados da pessoa e exibe o resultado no terminal.

## Conceitos praticados

- **Leitura de arquivos:** `Path` e `Files.readAllLines()`.
- **Coleções:** processamento das linhas por meio de `List<String>`.
- **Manipulação de texto:** `split()` para separar os campos.
- **Orientação a objetos:** criação de objetos `Pessoa` por meio de construtor.
- **Tratamento de caracteres XML:** substituição de `&`, `<` e `>` para evitar que sejam interpretados como marcação.
- **Exceções de entrada/saída:** declaração de `IOException` no método `main`.

## Estrutura

```text
.
├── pessoas.txt
└── src/
    ├── Main.java
    └── Pessoa.java
```

## Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Confirme que o arquivo `pessoas.txt` está na raiz do projeto.
3. Execute `src/Main.java).

O programa espera que cada linha do arquivo siga o formato:

```text
nome;idade;email
```

## Limitações conhecidas

Este exercício assume que o arquivo existe e que todas as linhas têm os três campos no formato esperado. O conteúdo é lido e convertido durante a execução; não há banco de dados nem persistência adicional.

---

**Curso:** EBAC — Back-end Java v2  
**Tema:** leitura de arquivos, objetos Java e geração de XML
