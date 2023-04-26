package app;

public class TemperaturaAbaixoDoPermitido extends Exception {

    protected int temp;

    public TemperaturaAbaixoDoPermitido() {
    }
    
    public TemperaturaAbaixoDoPermitido(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Temperatura Fora Dos Limites Permitidos";
    }

    
}
