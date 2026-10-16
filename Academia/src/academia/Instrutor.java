package academia;

public class Instrutor {
    private String nome;
    private String cpf;
    private boolean disponibilidade;
    private Aluno aluno;
    
    public Instrutor(String nome, String cpf, boolean disponibilidade, Aluno aluno){
        this.nome = nome;
        this.cpf = cpf; // precisa do cpf??
        this.disponibilidade = disponibilidade;
        this.aluno = aluno;
        
    }
        
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }
    
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    
    
    
}
