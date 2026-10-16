package academia;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Academia academia = new Academia("Better life", "Rua 12, Setor Centro", "62 94002-8922", "0001/2026");

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a Academia " + academia.getNome() + "!!");

        int escolha;
        int escolhaAula;
        int escolhaAluno;
        int escolhaInstrutor;

        do {

            System.out.println("\nOla, qual acao deseja realizar?\n");
            System.out.println("1 - Cadastrar um Aluno.");
            System.out.println("2 - Cadastrar um Instrutor.");
            System.out.println("3 - Vincular alunos a Instrutores.");
            System.out.println("4 - Listar Alunos.");
            System.out.println("5 - Listar Instrutores.");
            System.out.println("6 - Visualizar os tipos de aulas.");
            System.out.println("7 - Sobre nos.");
            System.out.println("8 - Retirar aluno do sistema.");
            System.out.println("0 - Sair.");

            System.out.println("\nEscolha o numero relacionado a sua opcao.\n");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1: {
                    System.out.println("Digite o nome do aluno.");
                    String nome = scan.next();

                    System.out.println("Digite o cpf do aluno.");
                    String cpf = scan.next();

                    System.out.println("Digite a idade do aluno.");
                    int idade = scan.nextInt();

                    System.out.println("Digite o numero de telefone do aluno.");
                    String telefone = scan.next();

                    Aluno aluno = new Aluno(nome, cpf, idade, telefone);

                    System.out.println("\nAluno cadastrado com sucesso!\n");

                    academia.cadastrarAluno(aluno);

                    System.out.println("Agora escolha qual aula deseja cadastrar o aluno\n");
                    System.out.println("Aulas disponiveis!");
                    System.out.println("Valores da aula 120R$\n");

                    do {
                        System.out.println("1 -- Superior");
                        System.out.println("2 -- Inferior");
                        escolhaAula = scan.nextInt();

                        if (escolhaAula == 1) {

                            Aula aula = new Aula(120, "Superior");

                            aluno.setAula(aula);

                            academia.cadastrarAula(aula);

                        } else if (escolhaAula == 2) {

                            Aula aula = new Aula(120, "Inferior");

                            aluno.setAula(aula);
                            academia.cadastrarAula(aula);
                        } else {
                            System.out.println("\n\nOpcao Invalida\n\n");
                        }

                    } while (escolhaAula != 1 && escolhaAula != 2);

                    System.out.println("\nAula vinculada ao aluno " + nome + " com sucesso!\n");

                    break;
                }

                case 2: {
                    System.out.println("Digite o nome do Instrutor");
                    String nome = scan.next();

                    System.out.println("Digite o cpf do Instrutor");
                    String cpf = scan.next();

                    boolean disponibilidade = true;

                    Instrutor instrutor = new Instrutor(nome, cpf, disponibilidade, null);

                    academia.cadastrarInstrutor(instrutor);

                    System.out.println("Instrutor Cadastrado!");

                    break;
                }
                case 3: {
                    int numeroDoAluno = 1;
                    int numeroDoInstrutor = 1;
                    System.out.println("\n");

                    for (int i = 0; i < academia.listarAlunos().size(); i++) {

                        System.out.println("=======================");
                        Aluno aluno = academia.listarAlunos().get(i);

                        System.out.println("Aluno: " + numeroDoAluno);
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("CPF: " + aluno.getCpf());
                        numeroDoAluno++;
                    }
                    System.out.println("Selecione o numero do aluno que deseja.");
                    escolhaAluno = scan.nextInt();

                    System.out.println("\n");

                    for (int i = 0; i < academia.listarInstrutores().size(); i++) {

                        System.out.println("=======================");
                        Instrutor instrutor = academia.listarInstrutores().get(i);

                        System.out.println("Instrutor: " + numeroDoInstrutor);
                        System.out.println("Nome do instrutor: " + instrutor.getNome());
                        System.out.println("CPF: " + instrutor.getCpf());
                        numeroDoInstrutor++;

                    }
                    System.out.println("Selecione o numero do Instrutor que deseja.");
                    escolhaInstrutor = scan.nextInt();

                    break;
                }
                case 4: {
                    int numeroDoAluno = 1;
                    int numeroDoInstrutor = 1;
                    System.out.println("Aqui esta a lista de alunos!");
                    for (int i = 0; i < academia.listarAlunos().size(); i++) {

                        System.out.println("=======================");
                        Aluno aluno = academia.listarAlunos().get(i);
                        Aula aula = academia.listarAula().get(i);
                        System.out.println("Aluno: " + numeroDoAluno);
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("CPF: " + aluno.getCpf());
                        System.out.println("Aula vinculada ao aluno:" + aluno.getTipoDeAula().getTipoDeAula()); // o priemiro aponta pro endereco e o segundo pro valor.
                        System.out.println("=======================");
                        numeroDoAluno++;

                    }

                    break;
                }

                case 5: {
                    int numeroDoAluno = 1;
                    int numeroDoInstrutor = 1;

                    System.out.println("Aqui está a lista de Instrutores!");
                    for (int i = 0; i < academia.listarInstrutores().size(); i++) {

                        System.out.println("=======================");
                        Instrutor instrutor = academia.listarInstrutores().get(i);
                        System.out.println("Instrutor: " + numeroDoInstrutor);
                        System.out.println("Nome do instrutor: " + instrutor.getNome());
                        System.out.println("CPF: " + instrutor.getCpf());
                        System.out.println("Disponibilidade:" + instrutor.getDisponibilidade());
                        System.out.println("=======================");
                        numeroDoInstrutor++;
                    }

                    break;
                }

                case 6: {
                    System.out.println("Lista de aulas");
                    System.out.println("Servicos disponiveis");

                    //superior e inferior
                    System.out.println("1 - Superior: R$ 120,00");
                    System.out.println("2 - Inferior: R$ 120,00");

                    System.out.println("Aulas ja registradas");

                    for (int i = 0; i < academia.listarAula().size(); i++) {

                        Aula aula = academia.listarAula().get(i);

                        // ex aluno paulo aula superior quarta
                        // aluna maria aula inferior quinta
                        System.out.println("=======================");
                        System.out.println("Aula: " + (i + 1));
                        System.out.println("Tipo de aula: " + aula.getTipoDeAula());
                        System.out.println("Valor da diaria: R$ " + aula.getValorDaDiaria());
                        System.out.println("=======================");
                    }

                    break;
                }

                case 7: {

                    System.out.println("\n======================");
                    System.out.println("Academia " + academia.getNome());
                    System.out.println("CNPJ: " + academia.getCnpj());
                    System.out.println("Localizados no endereco " + academia.getEndereco());
                    System.out.println("Fale com a nossa equipe via Whatsaap " + academia.getTelefone());
                    System.out.println("\n======================");
                }
                case 8: {
                    // retiraar alunos do sistema
                    System.out.println("=== RETIRAR ALUNO DO SISTEMA ===");

                    // Verifica se existe algum aluno cadastrado
                    if (academia.listarAlunos().size() == 0) {
                    System.out.println("Nao existem alunos cadastrados.");
                    }

                    // Mostra os alunos cadastrados
                    for (int i = 0; i < academia.listarAlunos().size(); i++) {

                        Aluno aluno = academia.listarAlunos().get(i);

                        System.out.println("=======================");
                        System.out.println("Aluno: " + (i + 1));
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("CPF: " + aluno.getCpf());
                    }

                    // Recebe o numero do aluno escolhido
                    System.out.println("Digite o numero do aluno que deseja retirar:");
                    escolhaAluno = scan.nextInt();

                    // Verifica se o numero escolhido e valido
                    if (escolhaAluno >= 1
                            && escolhaAluno <= academia.listarAlunos().size()) {

                        // Busca o aluno escolhido
                        Aluno aluno = academia.listarAlunos().get(escolhaAluno - 1);

                        // Remove o aluno do sistema
                        academia.removerAluno(aluno);

                        System.out.println("Aluno " + aluno.getNome()
                                + " removido com sucesso!");

                    } else {
                        System.out.println("Numero de aluno invalido!");
                    }
                    break;
                }
            }

        } while (escolha != 0);

    }
}
