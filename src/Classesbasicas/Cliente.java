/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classesbasicas;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Pedro
 */
@Entity
public class Cliente extends Usuario {

   
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedido;
    @Column
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

}
