package exercicioHeranca;

public class Galinha extends Animal {

    String corPenas;

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public String statusVida() {
        int mediaVida = 8;

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
        return mens + "Galinha{" + "corPenas=" + corPenas + '}';
    }
}
