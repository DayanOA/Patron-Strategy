/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerStrategia;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Tonny
 */
public interface ICiframiento {

    public String EncriptarLlave(String cleartext) throws NoSuchAlgorithmException, 
            InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, 
            NoSuchPaddingException, BadPaddingException;

    public String DesencriptarLlave(String encrypted) throws Exception;

}
