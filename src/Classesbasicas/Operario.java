/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classesbasicas;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Pedro
 */
@Entity
public class Operario extends Funcionario{
    @Id
    private int id;
    private Double salariohora;
    private int qtdhoras;
    private Double salario;

    /**
     * @return the salariohora
     */
    public Double getSalariohora() {
        return salariohora;
    }

    /**
     * @param salariohora the salariohora to set
     */
    public void setSalariohora(Double salariohora) {
        this.salariohora = salariohora;
    }

    /**
     * @return the qtdhoras
     */
    public int getQtdhoras() {
        return qtdhoras;
    }

    /**
     * @param qtdhoras the qtdhoras to set
     */
    public void setQtdhoras(int qtdhoras) {
        this.qtdhoras = qtdhoras;
    }

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
