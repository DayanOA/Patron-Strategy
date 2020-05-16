/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerStrategia;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Tonny
 */
public class TresDES extends LlavePrivada {

    private static final String MD5 = "5a3de55753ab1d33dcd0c76a662a0d28";
    private static final String INI = "12345678901=";

    @Override
    public String EncriptarLlave(String cleartext) throws NoSuchAlgorithmException,
            InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException,
            NoSuchPaddingException, BadPaddingException {

        try {
            byte[] keyBytes = DatatypeConverter.parseBase64Binary(MD5);
            byte[] ivBytes = DatatypeConverter.parseBase64Binary(INI);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            IvParameterSpec iv = new IvParameterSpec(ivBytes);
            Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding", "SunJCE");
            cipher.init(Cipher.ENCRYPT_MODE, key, iv);

            byte[] plainTextBytes;
            plainTextBytes = cleartext.getBytes("utf-8");
            byte[] cipherText = cipher.doFinal(plainTextBytes); // Encriptar

            String strreturn = DatatypeConverter.printBase64Binary(cipherText);

            // Para quitar caracteres de control
            strreturn.replaceAll("\\p{Cntrl}", "?");
            return strreturn;

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TresDES.class.getName()).log(Level.SEVERE, null, ex);

        } catch (NoSuchProviderException ex) {
            Logger.getLogger(TresDES.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public String DesencriptarLlave(String encrypted) throws Exception {
        byte[] message = DatatypeConverter.parseBase64Binary("w9tZGqvzv3WWx0g0AI0mdA==");
        System.out.println("ciframientoi " + encrypted.toString());
        System.out.println(message); // [B@63d4e2ba
        byte[] keyBytes = DatatypeConverter.parseBase64Binary(MD5);
        byte[] ivBytes = DatatypeConverter.parseBase64Binary(INI);

//        SecretKey key = new SecretKeySpec(keyBytes, "DESede");
        IvParameterSpec iv = new IvParameterSpec(ivBytes);
        Cipher decipher
                = Cipher.getInstance("DESede/CBC/PKCS5Padding", "SunJCE");
        decipher.init(Cipher.DECRYPT_MODE, key, iv);

        byte[] plainText = decipher.doFinal(message); // Desencriptar

        String strreturn = new String(plainText, "UTF-8");

        // Para quitar caracteres de control
        strreturn.replaceAll("\\p{Cntrl}", "?");

        return strreturn;
    }

}
