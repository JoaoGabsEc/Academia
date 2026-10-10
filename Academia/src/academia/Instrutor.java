package academia;

public class Instrutor {
    private String nome;
    private String cpf;
    private boolean disponibilidade;
    
    public Instrutor(String nome, String cpf, boolean disponibilidade){
        this.nome = nome;
        this.cpf = cpf;
        this.disponibilidade = disponibilidade;
    }
        
    public String getnome(){
        return this.nome;
    }
    
    public String getcpf(){
        return this.cpf;
    }
    
    public boolean getdisponibilidade(){
        return this.disponibilidade;
    }
    
    public void setdisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    
    
    
}
