/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tads.pi3.gerenciadoprodutos.models;

import java.util.List;

/**
 *
 * @author Matheus
 */
public class Produto {
    
        private Integer ID;
    
        private String nome;

	private String descricao;

	private float pCompra;

	private float pVenda;

	private int quantidade;
        
        private boolean flag;
        
	private List<Categoria> categoria;

    public Produto(String nome, String descricao, float pCompra, float pVenda, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.pCompra = pCompra;
        this.pVenda = pVenda;
        this.quantidade = quantidade;
    }

    public Produto() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getpCompra() {
        return pCompra;
    }

    public void setpCompra(float pCompra) {
        this.pCompra = pCompra;
    }

    public float getpVenda() {
        return pVenda;
    }

    public void setpVenda(float pVenda) {
        this.pVenda = pVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

	
    
    
}
