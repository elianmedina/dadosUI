/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author elian.medina
 */
public class Numero {
    
        private int numero;

    public Numero() {
    }

    public Numero(int numero) {
        this.numero = numero;
    }

        
    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "D" + numero ;
    }

    
}
    
