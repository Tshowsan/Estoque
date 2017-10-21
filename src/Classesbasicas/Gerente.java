/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classesbasicas;

import javax.persistence.Column;

/**
 *
 * @author Pedro
 */
public class Gerente extends Funcionario {

    @Column
    private Double salario;
    @Column
    private Double salarioInicial;
    @Column
    private Double comissao;

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * @return the comissao
     */
    public Double getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    /**
     * @return the salarioinicial
     */
    public Double getSalarioinicial() {
        return salarioInicial;
    }

    /**
     * @param salarioinicial the salarioinicial to set
     */
    public void setSalarioinicial(Double salarioinicial) {
        this.salarioInicial = salarioinicial;
    }
}
