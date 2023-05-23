/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstratas;

/**
 *
 * @author Paulo
 */
public abstract class Conta {

	private double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void imprimeExtrato();
        public abstract void sacar(double valor);
        public abstract void depositar(double valor);
        
}