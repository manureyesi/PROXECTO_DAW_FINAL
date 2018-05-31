/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

/**
 *
 * @author ManuReyesI
 */
public class Vendedor {
    
    /**
     *
     */
    public int numVendedor;

    /**
     *
     */
    public String nomeVendedor;

    /**
     *
     */
    public Vendedor() {
    }

    /**
     *
     * @param numVendedor
     * @param nomeVendedor
     */
    public Vendedor(int numVendedor, String nomeVendedor) {
        this.numVendedor = numVendedor;
        this.nomeVendedor = nomeVendedor;
    }
    
    /**
     *
     * @return Cod idetifica a Vendedor
     */
    public int getNumVendedor() {
        return numVendedor;
    }

    /**
     *
     * @param numVendedor
     */
    public void setNumVendedor(int numVendedor) {
        this.numVendedor = numVendedor;
    }

    /**
     *
     * @return Nombre del vendor
     */
    public String getNomeVendedor() {
        return nomeVendedor;
    }

    /**
     *
     * @param nomeVendedor
     */
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
    
    
}
