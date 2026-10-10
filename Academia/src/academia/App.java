package academia;


public class App {
    
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Fulano", "054.555.555-10", 16, "(62)99828-0096");

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getCpf());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Idade: " + a1.getTelefone());
  
    
    }
    
}
