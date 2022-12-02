/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Date;

/**
 *
 * @author Vinícius
 */
public class Game {
    
    private int id;
    private String nome;
    private String genero;
    private Date dtlacamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDtlacamento() {
        return dtlacamento;
    }

    public void setDtlacamento(Date dtlacamento) {
        this.dtlacamento = dtlacamento;
    }
    
}
