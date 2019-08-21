/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tads.pi3.gerenciadoprodutos.models;

/**
 *
 * @author Matheus
 */
public class Categoria {
    
    private Integer ID; 
    private String nome; 

    public Categoria(Integer ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public Categoria() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
