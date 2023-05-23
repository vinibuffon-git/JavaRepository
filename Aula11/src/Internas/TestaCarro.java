/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internas;

/**
 *
 * @author Paulo
 */
public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.statusCarro();
        carro.motor.aumentarMarcha();
        carro.setVelocidade(20);
        carro.motor.aumentarMarcha();
        carro.setVelocidade(60);
        carro.motor.aumentarMarcha();
        carro.setVelocidade(80);
        carro.statusCarro();
        carro.setVelocidade(0);
        carro.motor.setLigaDesliga(false);
        carro.motor.marcha = 1;
        carro.statusCarro();
        
    }
}
