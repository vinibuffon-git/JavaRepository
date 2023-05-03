/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paulo
 */
public class Livro extends Produto{
    @Override
    public void emitirDados(){
        System.out.println(this + " - Dados do Livro");
    }   
    public void emitirAutor(){
        System.out.println(this + "Autor do Livro");
    }
}
