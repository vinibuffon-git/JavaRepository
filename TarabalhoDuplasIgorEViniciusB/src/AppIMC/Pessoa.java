//Igor Porto e Vinícius Buffon

package AppIMC;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
        this.nome = "Nome não informado";
        this.idade = 0;
        this.altura = 1;
        this.peso = 0;
        this.sexo = 'M';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String CalcualrIMC() {
        double IMC = this.peso / Math.pow(this.altura, 2);
        if (IMC <= 18.5) {
            return "Abaixo do peso normal";
        } else if (IMC <= 25) {
            return "Peso normal";
        } else if (IMC <= 30){
            return "Acima do peso normal";
        } else if (IMC > 30){
            return "Obesidade";
        }
        return "Erro ao calcular o IMC";
    }
}


