
package exercicioHeranca;


public class Animal {
    double peso;
    int numPatas;
    boolean carnivoro;
    boolean herbivoro;
    int idade;

    public Animal() {
    }

    public Animal(double peso, int numPatas, boolean carnivoro, boolean herbivoro, int idade) {
        this.peso = peso;
        this.numPatas = numPatas;
        this.carnivoro = carnivoro;
        this.herbivoro = herbivoro;
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public boolean isHerbivoro() {
        return herbivoro;
    }

    public void setHerbivoro(boolean herbivoro) {
        this.herbivoro = herbivoro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", numPatas=" + numPatas + ", carnivoro=" + carnivoro + ", herbivoro=" + herbivoro + ", idade=" + idade + '}';
    }    
}
