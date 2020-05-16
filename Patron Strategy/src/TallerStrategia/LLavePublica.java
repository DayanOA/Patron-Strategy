/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerStrategia;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 *
 * @author Tonny
 */
public abstract class LLavePublica implements ICiframiento {

    protected PrivateKey PrivateKey = null;
    protected PublicKey PublicKey = null;
    protected String encriptacion = null;

    public PrivateKey getPrivateKey() {
        return PrivateKey;
    }

    public void setPrivateKey(PrivateKey PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    public PublicKey getPublicKey() {
        return PublicKey;
    }

    public void setPublicKey(PublicKey PublicKey) {
        this.PublicKey = PublicKey;
    }

    public String getEncriptacion() {
        return encriptacion;
    }

    public void setEncriptacion(String encriptacion) {
        this.encriptacion = encriptacion;
    }

}
