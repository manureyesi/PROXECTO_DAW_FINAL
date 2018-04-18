/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

/**
 *
 * @author daw122
 */
public class Vendedor {
    
    public int numVendedor;
    public String nomeVendedor;

    public Vendedor() {
    }
    public Vendedor(int numVendedor, String nomeVendedor) {
        this.numVendedor = numVendedor;
        this.nomeVendedor = nomeVendedor;
    }
    
    public int getNumVendedor() {
        return numVendedor;
    }
    public void setNumVendedor(int numVendedor) {
        this.numVendedor = numVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
    
    
}
