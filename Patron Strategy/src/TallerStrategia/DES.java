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
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import static org.apache.commons.codec.binary.Base64.decodeBase64;
import static org.apache.commons.codec.binary.Base64.encodeBase64;

/**
 *
 * @author Tonny
 */
public class DES extends LlavePrivada {

    // Definición del tipo de algoritmo a utilizar (AES, CiframientoDES, RSA)
    private final static String alg = "DES";
    // Definición del modo de cifrado a utilizar
    private final static String cI = "DES/CBC/PKCS5Padding";
    private final static String IV = "01234567";
    private final static String Key = "92AE31A9";

    @Override
    public String EncriptarLlave(String cleartext) throws NoSuchAlgorithmException,
            InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException,
            NoSuchPaddingException, BadPaddingException {

        Cipher cipher = Cipher.getInstance(cI);
        SecretKeySpec skeySpec = new SecretKeySpec(Key.getBytes(), alg);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(cleartext.getBytes());
        return new String(encodeBase64(encrypted));
    }

    @Override
    public String DesencriptarLlave(String encrypted) throws Exception {
        System.out.println("ciframientoimpPrivada.DES.DescifrarLlave()");
        Cipher cipher = Cipher.getInstance(cI);
        SecretKeySpec skeySpec = new SecretKeySpec(Key.getBytes(), alg);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
        byte[] enc = decodeBase64(encrypted.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivParameterSpec);
        byte[] decrypted = cipher.doFinal(enc);
        return new String(decrypted);
    }

}
