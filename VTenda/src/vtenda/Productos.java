/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.io.Serializable;

/**
 *
 * @author ManuReyesI
 */
public class Productos implements Serializable, Comparable<Productos>{
    
    /**
     *
     */
    public String codArticulo;

    /**
     *
     */
    public String nomeArticulo;

    /**
     *
     */
    public String Categoria;

    /**
     *
     */
    public double precioSin;

    /**
     *
     */
    public int stock;

    /**
     *
     */
    public Productos() {
    }

    /**
     *
     * @param codArticulo
     * @param nomeArticulo
     * @param precioSin
     * @param stock
     * @param Categoria
     */
    public Productos(String codArticulo, String nomeArticulo, double precioSin, int stock, String Categoria) {
        this.codArticulo = codArticulo;
        this.nomeArticulo = nomeArticulo;
        this.precioSin = precioSin;
        this.stock = stock;
        this.Categoria = Categoria;
    }

    /**
     *
     * @return Codigo de Articulo
     */
    public String getCodArticulo() {
        return codArticulo;
    }

    /**
     *
     * @param codArticulo
     */
    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }

    /**
     *
     * @return Nombre del Articulo
     */
    public String getNomeArticulo() {
        return nomeArticulo;
    }

    /**
     *
     * @param nomeArticulo
     */
    public void setNomeArticulo(String nomeArticulo) {
        this.nomeArticulo = nomeArticulo;
    }

    /**
     *
     * @return Precio sin IVA del Producto
     */
    public double getPrecioSin() {
        return precioSin;
    }

    /**
     *
     * @param precioSin
     */
    public void setPrecioSin(double precioSin) {
        this.precioSin = precioSin;
    }

    /**
     *
     * @param Categoria
     */
    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }

    /**
     *
     * @return Categoria en la que se encuentra dicho producto
     */
    public String getCategoria(){
        return Categoria;
    }

    /**
     *
     * @return El Stck que tiene dicho producto
     */
    public int getStock() {
        return stock;
    }

    /**
     *
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    /**
     *
     * @return Calcula el IVA que le corresponde a cada producto
     */
    public double calcularIVA(){
        double iva;
        
        iva=this.precioSin*0.21;
        
        Redondear rd = new Redondear();
                    
        iva=rd.redondearDecimales(iva);
        
        iva=iva+this.precioSin;
        
        return iva;
    }
    
    /**
     *
     * @return Devuelve el IVA del producto
     */
    public double getIVA(){
        
        double iva;
        
        iva=this.precioSin*0.21;
        
        Redondear rd = new Redondear();
                    
        iva=rd.redondearDecimales(iva);
        
        return iva;
        
    }
    
    /**
     *
     * @param num
     */
    public void quitarStock(int num){
        
        this.stock=this.stock-num;
        
    }

    @Override
    public int compareTo(Productos p1) {
        if(this.getCodArticulo().compareTo(p1.getCodArticulo())>0)
            return 1;
        else if(this.getCodArticulo().compareTo(p1.getCodArticulo())<0)
            return -1;
        else
            return 0;
    }
    
    
}
