/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jeferson
 */
public class ModalControle {
    
    protected MercadoModal mModal;
    protected Mercadoria merca;
    protected Mercado mercado = new Mercado();
    private JTable jTable;

    private JTextField quantidade;
    private JTextField valor;
    private JComboBox mercadoria;
    private JTextField nome;
    
    protected TableRowSorter sorter;

    /**
     * @return the jTable
     */
    protected JTable getjTable() {
        return jTable;
    }

    /**
     * @param jTable the jTable to set
     */
    protected void setjTable(JTable jTable) {
        this.jTable = jTable;
    }

    /**
     * @return the quantidade
     */
    protected JTextField getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    protected void setQuantidade(JTextField quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor
     */
    protected JTextField getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    protected void setValor(JTextField valor) {
        this.valor = valor;
    }

    /**
     * @return the mercadoria
     */
    protected JComboBox getMercadoria() {
        return mercadoria;
    }

    /**
     * @param mercadoria the mercadoria to set
     */
    protected void setMercadoria(JComboBox mercadoria) {
        this.mercadoria = mercadoria;
    }

    /**
     * @return the nome
     */
    protected JTextField getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    protected void setNome(JTextField nome) {
        this.nome = nome;
    }
    
    
    
}
