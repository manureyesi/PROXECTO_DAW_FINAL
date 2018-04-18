/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.io.Serializable;

/**
 *
 * @author daw122
 */
public class CarritoCompra implements Serializable{
    
    public String codArticulo;
    public String nomeArticulo;
    public double precioIVA;
    public int cantidade;
    public double desconto;
    public double precioFinal;

    public CarritoCompra() {
    }
    public CarritoCompra(String codArticulo, String nomeArticulo, double precioIVA, int stock, double precioFinal) {
        this.codArticulo = codArticulo;
        this.nomeArticulo = nomeArticulo;
        this.precioIVA = precioIVA;
        this.cantidade = stock;
        this.precioFinal = precioFinal;
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getNomeArticulo() {
        return nomeArticulo;
    }

    public void setNomeArticulo(String nomeArticulo) {
        this.nomeArticulo = nomeArticulo;
    }

    public double getPrecioIVA() {
        return precioIVA;
    }

    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int stock) {
        this.cantidade = stock;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    

    
}
