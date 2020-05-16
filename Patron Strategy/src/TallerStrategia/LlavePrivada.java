/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerStrategia;

import javax.crypto.SecretKey;

/**
 *
 * @author Tonny
 */
public abstract class LlavePrivada implements ICiframiento {

    private String LlavePrivada = "";
    public SecretKey key;

    public String getLlavePrivada() {
        return LlavePrivada;
    }

    public void setLlavePrivada(String LlavePrivada) {
        this.LlavePrivada = LlavePrivada;
    }

    public SecretKey getKey() {
        return key;
    }

    public void setKey(SecretKey key) {
        this.key = key;
    }

}
