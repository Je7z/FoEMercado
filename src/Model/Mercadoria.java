/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jeferson
 */
public class Mercadoria {

    private String era;
    private String mercadoria;
    
    public Mercadoria() {
    
    }
    
    public Mercadoria(String era, String mercadoria) {
        this.setEra(era);
        this.setMercadoria(mercadoria);
    }

    /**
     * @return the era
     */
    public String getEra() {
        return era;
    }

    /**
     * @param era the era to set
     */
    public void setEra(String era) {
        this.era = era;
    }

    /**
     * @return the mercadoria
     */
    public String getMercadoria() {
        return mercadoria;
    }

    /**
     * @param mercadoria the mercadoria to set
     */
    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }
    
    public String toString() {
        return this.mercadoria;
    }

   
    
}
