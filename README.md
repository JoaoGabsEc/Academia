# Academia Better Life

## Integrantes

Caroline Felipe
João Gabriel
Kauã Henrique

## Descrição do problema

O projeto **Academia Better Life** é um sistema desenvolvido em Java para apoiar o gerenciamento de informações de uma academia. A proposta é organizar os cadastros e facilitar a execução de operações por meio de um menu no terminal, reduzindo a necessidade de controlar essas informações manualmente.

## Funcionalidades

- Exibição de um menu de opções no terminal.
- Cadastro de instrutores com informações como nome e CPF.
- Verificação do CPF informado, incluindo a conferência da quantidade de dígitos.
- Consulta e gerenciamento dos registros disponíveis no sistema, conforme as opções implementadas no menu.

> Ajuste esta lista para corresponder exatamente às funcionalidades presentes na versão final do código.

## Tecnologias utilizadas

- **Java**
- **Apache Ant** para a compilação e execução do projeto, conforme a configuração do projeto.
- **NetBeans IDE** (opcional, recomendado para abrir e executar o projeto).

## Instruções para executar

### Pelo NetBeans

1. Extraia os arquivos do projeto.
2. Abra o NetBeans.
3. Selecione **File (Arquivo) > Open Project (Abrir projeto)**.
4. Escolha a pasta do projeto `App` que contém a configuração do NetBeans/Ant.
5. Aguarde o carregamento do projeto.
6. Execute o projeto usando **Run Project (Executar projeto)**.

### Pelo terminal

É necessário ter o **JDK** instalado e configurado no `PATH`.

1. Abra o terminal na pasta que contém o arquivo `build.xml`.
2. Compile o projeto com:

   ```bash
   ant compile
   ```

3. Execute o projeto com:

   ```bash
   ant run
   ```

Se os comandos ou alvos do Ant forem diferentes na configuração do projeto, utilize as opções de compilação e execução disponibilizadas pelo NetBeans.

## Exemplo de utilização

Ao iniciar o programa, o sistema apresenta um menu com opções. Um exemplo de fluxo para cadastrar um instrutor é:

1. Iniciar o programa.
2. Selecionar a opção de cadastro de instrutor no menu.
3. Informar o nome do instrutor.
4. Informar o CPF.
5. O sistema verifica se o CPF informado possui 11 dígitos e segue as validações implementadas.
6. Confirmar a operação e retornar ao menu.

**Exemplo ilustrativo de entrada:**

```text
Digite o nome do Instrutor
João Silva

Digite o cpf do Instrutor
12345678901
```

O resultado exibido depende das validações e das opções implementadas no código. O CPF acima é apenas um exemplo fictício para demonstração.

## Divisão das responsabilidades da equipe

Preencha a tabela conforme as atividades realmente realizadas por cada integrante.

| Integrante             | Responsabilidades                                                 
| ---------------------- | ----------------------------------------------------------------- 
| Caroline Felipe        | Responsavel pela class Aula, criação do deletarAluno, verificarCpf, implementação das funcionalidades no App, etc. |
| João Gabriel           | Responsavel pela class instrutor, criação do  verificarCpf, criação do verificarTelefone, implementação das funcionalidades no App, etc.                                                                                                                  |
| Kauã Henrique | Responsavel pela class Aluno, criação do verificarCpf, criação do verificarTelefone, implementação das funcionalidades no App, etc.                                                                                                                                     |

## Estrutura do projeto

A organização pode variar conforme os arquivos do repositório. Em geral, o código-fonte Java fica dentro da pasta `src`, organizado por pacote.


