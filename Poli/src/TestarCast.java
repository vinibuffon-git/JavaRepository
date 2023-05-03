/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paulo
 */
public class TestarCast {
    public static void main(String[] args) {
        int valorInt = 10;
        double valorDouble = 20.0;
        String valorString = "30";
        System.out.println("Valor Int: " + valorInt);
        System.out.println("Valor Double: " + valorDouble);
        System.out.println("Valor String: " + valorString);
        valorInt = (int)valorDouble; //Convertendo para int
        System.out.println("Valor Int: " + valorInt);
        valorDouble = (double)valorInt;//Convertendo para double
        System.out.println("Valor Double: " + valorDouble);
    }
}
