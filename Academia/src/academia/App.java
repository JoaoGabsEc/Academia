package academia;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Academia academia = new Academia("Academia dos Amigos", "Rua 12, Setor Centro", "62 94002-8922");

        Scanner scan = new Scanner(System.in);


        int escolha;
        int escolhaAula;
        do {

            System.out.println("\nOla, qual acao deseja realizar?\n");
            System.out.println("1 - Cadastrar um Aluno.");
            System.out.println("2 - Cadastrar um Instrutor.");
            System.out.println("3 - Listar Alunos.");
            System.out.println("4 - Listar Instrutores.");
            System.out.println("5 - Visualizar os tipos de aulas.");
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
                    }else {
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

                    Instrutor instrutor = new Instrutor(nome, cpf, disponibilidade);

                    academia.cadastrarInstrutor(instrutor);

                    System.out.println("Instrutor Cadastrado!");

                    break;
                }

                case 3: {

                    System.out.println("Aqui esta a lista de alunos!");
                    for (int i = 0; i < academia.listarAlunos().size(); i++) {

                        System.out.println("=======================");
                        Aluno aluno = academia.listarAlunos().get(i);
                        Aula aula = academia.listarAula().get(i);
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("CPF: " + aluno.getCpf());
                        System.out.println("Aula vinculada ao aluno:" + aluno.getTipoDeAula().getTipoDeAula());
                        System.out.println("=======================");

                    }

                    break;
                }

                case 4: {

                    System.out.println("Aqui está a lista de Instrutores!");
                    for (int i = 0; i < academia.listarInstrutores().size(); i++) {

                        System.out.println("=======================");
                        Instrutor instrutor = academia.listarInstrutores().get(i);
                        System.out.println("Nome do instrutor: " + instrutor.getNome());
                        System.out.println("CPF: " + instrutor.getCpf());
                        System.out.println("Disponibilidade:" + instrutor.getDisponibilidade());
                        System.out.println("=======================");

                    }

                    break;
                }

                case 5: {
                    System.out.println("Lista de aulas");
                    break;
                }

            }

        } while (escolha != 0);

    }
}
