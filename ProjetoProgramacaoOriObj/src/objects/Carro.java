package objects;


public class Carro {

    String marca;
    String modelo;
    String placa;
    double consumo;
    
    void calculardistancia(double litros){
        System.out.println("Distância: " + (litros + consumo) + "km");
    }  

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
        
       
}
