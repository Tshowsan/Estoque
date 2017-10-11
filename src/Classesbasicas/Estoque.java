/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classesbasicas;

import java.util.List;

/**
 *
 * @author Pedro
 */
public class Estoque {
private List<Produto> produto;
private int qtdmax;
private int qtdatual;

    /**
     * @return the produto
     */
    public List<Produto> getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    /**
     * @return the qtdmax
     */
    public int getQtdmax() {
        return qtdmax;
    }

    /**
     * @param qtdmax the qtdmax to set
     */
    public void setQtdmax(int qtdmax) {
        this.qtdmax = qtdmax;
    }

    /**
     * @return the qtdatual
     */
    public int getQtdatual() {
        return qtdatual;
    }

    /**
     * @param qtdatual the qtdatual to set
     */
    public void setQtdatual(int qtdatual) {
        this.qtdatual = qtdatual;
    }
}
