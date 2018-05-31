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
public class Redondear {
    
    /**
     *
     */
    public double num;

    /**
     *
     * @param num
     * @return Valor de Decimal con dos cifras decimales
     */
    public double redondearDecimales(double num) {
        double parteEntera, resultado;
        resultado = num;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, 2);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, 2))+parteEntera;
        return resultado;
    }
    
}
