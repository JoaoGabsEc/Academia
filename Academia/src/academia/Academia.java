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

    public void cadastrarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public ArrayList<Aluno> listarAlunos() {
        return this.alunos;

    }

    public void removeAluno(Aluno aluno) {
        Instrutor instrutor = aluno.getInstrutor();
        if (instrutor != null) {
            instrutor.setAluno(null);
            instrutor.setDisponibilidade(true);
        }
        this.aulas.remove(aluno.getTipoDeAula());
        this.alunos.remove(aluno);
    }

    public void removeInstrutor(Instrutor instrutor) {
        Aluno aluno = instrutor.getAluno();
        if (aluno != null) {
            aluno.setInstrutor(null);
        }
        this.aulas.remove(instrutor.getAluno());
        this.instrutores.remove(instrutor);
    }

    public void cadastrarInstrutor(Instrutor instrutor) {
        this.instrutores.add(instrutor);
    }

    public ArrayList<Instrutor> listarInstrutores() {
        return this.instrutores;
    }

    public void cadastrarAula(Aula aula) {
        this.aulas.add(aula);
    }

    public ArrayList<Aula> listarAula() {
        return this.aulas;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public boolean vincularInstrutor(Aluno aluno, Instrutor instrutor) {
        if (aluno.getInstrutor() != null || !instrutor.getDisponibilidade()) {
            return false;
        } else {
            aluno.setInstrutor(instrutor);
            instrutor.setAluno(aluno);
            instrutor.setDisponibilidade(false);
            return true;
        }

    }

    public boolean verificarTelefone(String telefone) {
        for (Aluno aluno : alunos) {
            if (aluno.getTelefone().equals(telefone)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarCpf(String cpf) {
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getCpf().equals(cpf)) {
                return true;
            }
        }
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

}
