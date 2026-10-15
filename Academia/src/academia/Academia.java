package academia;

import java.util.ArrayList;

public class Academia {

    private String nome;
    private String endereco;
    private String telefone;
    private String cnpj;
    private ArrayList<Aluno> alunos;
    private ArrayList<Instrutor> instrutores;
    private ArrayList<Aula> aulas;

    public Academia(String nome, String endereco, String telefone, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.alunos = new ArrayList<Aluno>();
        this.instrutores = new ArrayList<Instrutor>();
        this.aulas = new ArrayList<Aula>();

    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    // cadastrar aluno
    public void cadastrarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    // listar alunos
    public ArrayList<Aluno> listarAlunos() {
        return this.alunos;

    }

    // cadastrar instrutor 
    public void cadastrarInstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }
    // listar instrutor

    public ArrayList<Instrutor> listarInstrutores() {
        return this.instrutores;
    }

    //cadastrar aula
    public void cadastrarAula(Aula aula) {
        this.aulas.add(aula);
    }
    //listar aula
    public ArrayList<Aula> listarAula() {
        return this.aulas;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
}
