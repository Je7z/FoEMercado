/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class ControleJTable extends ModalControle {
 
    public ControleJTable(JTable jTable) {
        
        this.setjTable(jTable);

        mModal = new MercadoModal();
        this.getjTable().setModel(mModal);

    }
    
    //private 
    
    public int getJTQuantidade(JTextField quantidade) {

        if(!quantidade.getText().isEmpty()) {
            this.setQuantidade(quantidade);
        } else {
            return 0;
        }
        return Integer.parseInt(this.getQuantidade().getText());
    }
    
    private double getJTValor(JTextField valor) {
        if(!valor.getText().isEmpty()) {
            this.setValor(valor);
        } else {
            return 0;
        }
        
        return Double.parseDouble(this.getValor().getText());
        
    }
    
    private String getJCMercadorias(JComboBox<Mercadoria> mercadoria) {
        return mercadoria.getItemAt(mercadoria.getSelectedIndex()).getMercadoria();
    }
    
   
    public void AddRow(JTextField quantidade, JTextField valor, JComboBox<Mercadoria> mercadoria) {
        
        mercado = new Mercado();
        
        this.mercado.mercadoria.setMercadoria(this.getJCMercadorias(mercadoria));
        this.mercado.setQuantidade(this.getJTQuantidade(quantidade));
        this.mercado.setValor(this.getJTValor(valor));
        
        mModal.AddRow(mercado);
        
    }
    
    public void RemoveRow() {
       if(this.getjTable().getSelectedRow() != -1) {
            mModal.removeRow(getjTable().getSelectedRow());
       }
    }
    
    public void SearchRow(JTextField search) {
        sorter = new TableRowSorter(mModal);
        sorter.setRowFilter(RowFilter.regexFilter(search.getText()));
        getjTable().setRowSorter(sorter);
    }

    


}
