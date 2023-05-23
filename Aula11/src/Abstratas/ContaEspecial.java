/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Paulo
 */
public class ContaEspecial extends Conta {

    double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo() + limite >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
        }
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("### Extrato da Conta Especial ###");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo.: " + this.getSaldo());
        System.out.println("Limite: " + this.getLimite());
        System.out.println("Data..: " + sdf.format(date));

    }
}
