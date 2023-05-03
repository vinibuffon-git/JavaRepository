/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paulo
 */
public class Revista extends Produto{
    @Override
    public void emitirDados(){
        System.out.println(this + " - Dados da Revista");
    }  
    public void emitirEditora(){
        System.out.println(this + "Dados da Editora");
    }
}
