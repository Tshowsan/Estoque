/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classesbasicas;

/**
 *
 * @author Pedro
 */
public class Produto {
    private int id;
    private String descricao;
    private String dataFabricasao;
    private String dataValidade;
    private Double valorUnitario;
    private Double valorLote;
    private int qtdmax;
    private int qtdmim;
    private Pedido pedido;

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

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the datafabricasao
     */
    public String getDatafabricasao() {
        return dataFabricasao;
    }

    /**
     * @param datafabricasao the datafabricasao to set
     */
    public void setDatafabricasao(String datafabricasao) {
        this.dataFabricasao = datafabricasao;
    }

    /**
     * @return the datavalidade
     */
    public String getDatavalidade() {
        return dataValidade;
    }

    /**
     * @param datavalidade the datavalidade to set
     */
    public void setDatavalidade(String datavalidade) {
        this.dataValidade = datavalidade;
    }

    /**
     * @return the valorunitario
     */
    public Double getValorunitario() {
        return valorUnitario;
    }

    /**
     * @param valorunitario the valorunitario to set
     */
    public void setValorunitario(Double valorunitario) {
        this.valorUnitario = valorunitario;
    }

    /**
     * @return the valorlote
     */
    public Double getValorlote() {
        return valorLote;
    }

    /**
     * @param valorlote the valorlote to set
     */
    public void setValorlote(Double valorlote) {
        this.valorLote = valorlote;
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
     * @return the qtdmim
     */
    public int getQtdmim() {
        return qtdmim;
    }

    /**
     * @param qtdmim the qtdmim to set
     */
    public void setQtdmim(int qtdmim) {
        this.qtdmim = qtdmim;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
