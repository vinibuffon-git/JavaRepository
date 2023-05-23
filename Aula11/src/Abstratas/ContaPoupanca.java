/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstratas;

/**
 *
 * @author Paulo
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimeExtrato() {
        System.out.println("----------------------------------");
        System.out.println("### Extrato da Conta Poupanca ###");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));

    }

    @Override
    public void sacar(double valor) {
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        }
    }
}
