/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerStrategia;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.StringTokenizer;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Tonny
 */
public class ElGamal extends LLavePublica {

    private BigInteger p, g, a, y, y1, y2;
    private Random r;

    public ElGamal() {

        r = new Random();
        p = new BigInteger("14893003337626352152463254152616458181260144281");
        g = new BigInteger("4893003337626352152463254152616458181260144281");
        a = new BigInteger("843900337326351225463254152616458181260144281");
        y = g.modPow(a, p);
        y1 = new BigInteger("0");
        y2 = new BigInteger("0");
    }

    public String bigEncrypt(String message, String key) {
        StringTokenizer st = new StringTokenizer(key, "(),");
        p = new BigInteger(st.nextToken());
        g = new BigInteger(st.nextToken());
        y = new BigInteger(st.nextToken());
        return bigEncrypt(message);
    }

    @Override
    public String EncriptarLlave(String cleartext) throws NoSuchAlgorithmException,
            InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException,
            NoSuchPaddingException, BadPaddingException {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String DesencriptarLlave(String encrypted) throws Exception {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String bigEncrypt(String message) {

        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
