package academia;

import java.util.Scanner;
        
public class App {
    
    public static void main(String[] args) {
        
        Academia academia = new Academia("Academia dos Amigos", "Rua 12, Setor Centro", "62 94002-8922");
        
        Scanner scan = new Scanner(System.in);
        
        int escolha;
        
        do{
        
        System.out.println("Ola, qual acao deseja realizar?");
        System.out.println("1 - Cadastrar um Aluno.");
        System.out.println("2 - Cadastrar um Instrutor.");
        System.out.println("3 - Cadastrar Aula.");
        System.out.println("4 - Listar Alunos.");
        System.out.println("5 - Listar Instrutores.");
        System.out.println("6 - Visualizar os tipos de Aulas.");
        System.out.println("0 - Sair.");
        
        System.out.println("\nEscolha o numero relacionado a sua opcao.\n");
        escolha = scan.nextInt();
        
            switch (escolha){
                case 1:  {
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
                    
                    
                    /*System.out.println("Dados do aluno cadastrado:");
                    System.out.println("Nome" + aluno.getNome());
                    System.out.println("Cpf:" + aluno.getCpf());
                    System.out.println("Idade:" + aluno.getIdade());
                    System.out.println("Telefone:" + aluno.getTelefone());*/
                    
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
                }
                
                case 3: {
                    int escolhaAula;
                    System.out.println("\nOlá, siga as instruções para cadastrar sua aula\n");
                    System.out.println("1- Superior -- R$100");
                    escolhaAula = scan.nextInt();
                    
                    System.out.println("2- Superior -- R$200");
                    escolhaAula = scan.nextInt();
                    
                    if(escolhaAula == 1){
                        
                    }
                }
                
                case 4: {
                    System.out.println("Aqui está a lista de alunos!");
                    
                }
                
                case 5: {
                    System.out.println("Lista de Instrutores cadastrados");
                }
                
                case 6: {
                    System.out.println("Aqui está a lista de aulas disponíveis!");
                    
                }
 
            }
            
        
        }while (escolha != 0);
        
    }
}