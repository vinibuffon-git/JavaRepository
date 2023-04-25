
package Fundamental;


public class Pessoa {
    
    private String nome;
    private String cpf;
    protected int idade;
    private int idFuncional;
    public String tipoSanquineo;
    int anoEstudo;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, int idade, int idFuncional, String tipoSanquineo, int anoEstudo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.idFuncional = idFuncional;
        this.tipoSanquineo = tipoSanquineo;
        this.anoEstudo = anoEstudo;
    }
    
    
}
