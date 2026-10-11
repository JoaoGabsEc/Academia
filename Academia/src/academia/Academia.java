package academia;

import java.util.Scanner;
import java.util.ArrayList;

public class Academia {
        private ArrayList<Aluno> alunos;
        private ArrayList<Instrutor> instrutores;
        
        public Academia(String nome, String endereco, String telefone){
            this.alunos = new ArrayList<Aluno>();
            this.instrutores = new ArrayList<Instrutor>();
            }
        
        public ArrayList<Aluno> listarAlunos(){
            return this.alunos;
            
        }
}

