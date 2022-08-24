
package aula04;

public class Pessoa {
    
    private String nome;
    private String cidade;
    private int idade;
    private boolean aluno;

    public Pessoa() {
    }

    public Pessoa(String nome, String cidade, int idade, boolean aluno) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
        this.aluno = aluno;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAluno() {
        return aluno;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome;
    }
       
}


