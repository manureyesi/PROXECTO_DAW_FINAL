/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.text.DecimalFormat;

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
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        double resultado = Double.parseDouble(df.format(num).replace(',', '.'));
        
        return resultado;
        
    }
    
}
