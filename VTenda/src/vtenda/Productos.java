/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.io.Serializable;


public class Productos implements Serializable, Comparable<Productos>{
    
    public String codArticulo;
    public String nomeArticulo;
    public String Categoria;
    public double precioSin;
    public int stock;

    public Productos() {
    }
    public Productos(String codArticulo, String nomeArticulo, double precioSin, int stock, String Categoria) {
        this.codArticulo = codArticulo;
        this.nomeArticulo = nomeArticulo;
        this.precioSin = precioSin;
        this.stock = stock;
        this.Categoria = Categoria;
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

    public double getPrecioSin() {
        return precioSin;
    }
    public void setPrecioSin(double precioSin) {
        this.precioSin = precioSin;
    }
    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }
    public String getCategoria(){
        return Categoria;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public double calcularIVA(){
        double iva;
        
        iva=this.precioSin*0.21;
        
        Redondear rd = new Redondear();
                    
        iva=rd.redondearDecimales(iva);
        
        iva=iva+this.precioSin;
        
        return iva;
    }
    
    public double getIVA(){
        
        double iva;
        
        iva=this.precioSin*0.21;
        
        Redondear rd = new Redondear();
                    
        iva=rd.redondearDecimales(iva);
        
        return iva;
        
    }
    
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
