/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import org.apache.commons.codec.digest.DigestUtils;
/**
 *
 * @author ManuReyesI
 */
public class Encriptar {
    
    /**
     *
     */
    public String cifer;

    /**
     *
     * @param pal
     */
    public Encriptar(String pal) {
        
        String textoSinEncriptar=pal;
        
        textoSinEncriptar = DigestUtils.md5Hex(textoSinEncriptar); 
        textoSinEncriptar = DigestUtils.sha1Hex(textoSinEncriptar);
        this.cifer = DigestUtils.sha1Hex(textoSinEncriptar);
        
    }

    /**
     *
     * @return Devuelve la contraseña cifrada
     */
    public String getCifer() {
        return cifer;
    }
    
}
