/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jeferson
 */
public class MercadoModal extends AbstractTableModel {
    
    private ArrayList<Mercado> dados = new ArrayList<>();
    private String[] column = {"Mercadoria", "Quantidade", "Valor"};

    
    @Override
    public String getColumnName(int column) {
        return this.column[column];
    }
    
    @Override
    public int getRowCount() {
       return this.dados.size();
    }

    @Override
    public int getColumnCount() {
        return this.column.length;   
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column) {
            case 0: return dados.get(row).mercadoria.getMercadoria();
            case 1: return dados.get(row).getQuantidade();
            case 2: return dados.get(row).getValor();
        }
        
        return null;
        
    }
    
    public void AddRow(Mercado m) {
        this.dados.add(m);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int row) {
        this.dados.remove(row);
        this.fireTableRowsDeleted(row, row);
    }
    
    /*
    private ArrayList<Mercado> dados = new ArrayList<>();
    private String[] colunas = {"Nome", "Mercadoria", "Quantidade", "Valor"};

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return this.dados.size();
    }

    @Override
    public int getColumnCount() {
       return this.colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0: return this.dados.get(row).getNome();
            //case 1: return this.dados.get(row).getEra();
            case 2: return this.dados.get(row).getMercadoria();
            case 3: return this.dados.get(row).getQuantidade();
            case 4: return this.dados.get(row).getValor();
        }
        
        return null;
        
    }
    
    public void addRow(Mercado m) {
        this.dados.add(m);
        this.fireTableDataChanged();
    }
*/
    
}
