/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstratas;

/**
 *
 * @author Paulo
 */
public class TestaConta {
	public static void main(String[] args) {
                //Conta cc = new Conta(); //Não pode, é abstrata.
            
		ContaPoupanca cp = new ContaPoupanca();//ok
		cp.setSaldo(2000);
		cp.imprimeExtrato();
                System.out.println("\n>> Depositando R$ 1500....");
                cp.depositar(1500);
		cp.imprimeExtrato();
                System.out.println("\n>> Sacando R$ 1000....");
                cp.sacar(1000);
		cp.imprimeExtrato();
                
                System.out.println("\n\n");
                
                ContaEspecial ce = new ContaEspecial();//ok
                ce.setLimite(1000);
                ce.setSaldo(2000);
                System.out.println("\n>> Depositando  R$ 2000....");
                ce.depositar(100);
		ce.imprimeExtrato();
                System.out.println("\n>> Sacando R$ 2800....");
                ce.sacar(2800);
		ce.imprimeExtrato();

	}
}
