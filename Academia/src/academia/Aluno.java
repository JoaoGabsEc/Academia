package academia;

public class Aluno {
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;
    private Aula tipoDeAula;
    
    public Aluno (String nome, String cpf, int idade, String telefone){
        this.nome = nome; 
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    public Aula getTipoDeAula(){
        return this.tipoDeAula;
    }
    
    public void setAula(Aula aula){
        this.tipoDeAula = aula;
    }

    
}
