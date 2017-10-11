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
public class Cliente extends Usuario {

    private int id;
    private List<Pedido> pedido;
    private String cnpj;

    public Cliente(String cnpj) {
        this.cnpj = cnpj;
    }

    public Cliente() {
    }

    /**
     * @return the pedido
     */
    public List<Pedido> getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
