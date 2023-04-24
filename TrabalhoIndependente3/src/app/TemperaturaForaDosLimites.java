package app;

public class TemperaturaForaDosLimites extends Exception {

    protected int temp;

    public TemperaturaForaDosLimites(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Temperatura Fora Dos Limites Permitidos";
    }

    
}
