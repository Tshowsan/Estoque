/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classesbasicas;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Pedro
 */
@Entity
public class Estoque implements Serializable {

    @Id
    private int id;
    @OneToMany
    private List<Produto> produto;
    @Column
    private int qtdmax;
    @Column
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
