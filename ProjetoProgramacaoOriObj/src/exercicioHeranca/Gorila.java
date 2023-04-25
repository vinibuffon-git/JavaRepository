package exercicioHeranca;

public class Gorila extends Animal {

    String corPelos;

    public String getCorPelos() {
        return corPelos;
    }

    public void setCorPelos(String corPelos) {
        this.corPelos = corPelos;
    }

    public String statusVida() {
        int mediaVida = 38;

        if (this.getIdade() < mediaVida) {
            return "Jovem";
        } else if (this.getIdade() > mediaVida) {
            return "Idoso";
        }
        return "Idade não registrada";
    }

    @Override
    public String toString() {
        String mens = super.toString();
        return mens + "Gorila{" + "corPelos=" + corPelos + '}';
    }
}
