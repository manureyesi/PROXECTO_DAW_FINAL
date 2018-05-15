/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimir;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author 6001111
 */
public class pruebasImpri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirTicket(true);
        System.out.println("Operacion Exitosa...");
    }
    /*@param flagModo
    *Pasamos como parametro true para seleccionar la impresora
    *predeterminada o la que nosotros hallamos especificado.
    *Pasamos false si queremos ver el cuadro de dialogo de impresion
    *para seleccionar una impresora.
    */
    public static void imprimirTicket(boolean flagModo){
        //Creamos una instancia de la clase CodTicket
        codTicket ticket=new codTicket();
        //Asignamos los datos de la empresa
        ticket.setEmpresa("Mi empresa Dev{}PedroGS");
        ticket.setPropietario("PedroGS");
        ticket.setRfc("MIRFC-DEVPGS");
        ticket.setDireccion("http://devpedrogs.blogspot.mx/");
        ticket.setTelefono("999-999-9999");
        //Asignamos los datos de la venta
        ticket.setFolio("000001");
        ticket.setCliente("Jose Roberto");
        ticket.setRfcCliente("ROBJO-253-XXX");
        //Variable que almacena la lista de articulos
        String listaArticulos="";
        /*
        *Cargamos la lista de articulos comprados
        *Ejemplo de lista:
        *DESCRIP   CANT.  PRECIO  IMPORTE
        *Mi_articulo_1
        *            5    $10       $50
        *Mi_articulo_2
        *            5    $10       $50
        *Mi_articulo_3
        *            5    $10       $50
        */
        for(int noArticulo=1;noArticulo<=3;noArticulo++){
            listaArticulos=listaArticulos+
                    "Mi_producto_"+noArticulo+"\n"+
                    "       "+ 5 + " X  $"+ 10 +"  $"+50+"\n";
            ticket.setArticulos(listaArticulos);
        }
        ticket.setSubTotal("129.31");
        ticket.setIva("20.28");
        ticket.setTotal("150");
        ticket.setRecibo("200");
        ticket.setCambio("50");
        ticket.setTotalLetra("Ciento cienciente pesos 00/100 MN");
        ticket.setVendedor("Mi Vendedor 1");
        ticket.setMatriz("OCO-CHIAPAS");
        ticket.setFecha("04/03/2017");
        try{
            ticket.print(flagModo);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
}
