package academia;

import java.util.Scanner;
import java.util.ArrayList;

public class Academia {

    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Aluno> alunos;
    private ArrayList<Instrutor> instrutores;
//        private ArrayList<Aluno> aulas;

    public Academia(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.alunos = new ArrayList<Aluno>();
        this.instrutores = new ArrayList<Instrutor>();
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

    public void cadastrarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
        
        public ArrayList<Aluno> listarAlunos() {
        return this.alunos;

    }
}
