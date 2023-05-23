/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internas;

/**
 *
 * @author Paulo
 */
public class Carro {

    int velocidade;
    Motor motor;

    public void statusCarro() {
        System.out.println("-----------------------------------------------");
        System.out.println("Status do Carro");
        System.out.println("Situação: " + (this.motor.ligaDesliga==true?"LIGADO":"DESLIGADO"));
        System.out.println("Velocidade: " + this.getVelocidade() + " Km/h");
        System.out.println("Marcha: " + this.motor.marcha);
        System.out.println("-----------------------------------------------");
    }

    public Carro() {
        this.velocidade = 0;
        this.motor = new Motor();
        this.motor.ligaDesliga = true;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public class Motor {

        int marcha = 1;
        boolean ligaDesliga;

        public boolean isLigaDesliga() {
            return ligaDesliga;
        }

        public void setLigaDesliga(boolean ligaDesliga) {
            this.ligaDesliga = ligaDesliga;
        }

        public void ligar() {
            System.out.println("Ligando o motor...");
        }

        public void desligar() {
            System.out.println("Desligando o motor...");
        }

        public void aumentarMarcha() {
            if (this.marcha <= 4) {
                System.out.println("Subindo Marcha...");
                System.out.println("Passando a marcha de " + this.marcha + " para " + (++this.marcha));
            }
        }

        public void reduzirMarcha() {
            if (this.marcha > 1) {
                System.out.println("Reduzindo Marcha...");
                System.out.println("Passando a marcha de " + this.marcha + " para " + (--this.marcha));
            }
        }
    }
}
