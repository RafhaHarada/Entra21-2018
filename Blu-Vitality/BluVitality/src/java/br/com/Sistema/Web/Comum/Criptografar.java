package br.com.Sistema.Web.Comum;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class Criptografar {
    
    public static String encriptografar(String senha){
        String senhaCriptografada = "";
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
            senhaCriptografada = hash.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return senhaCriptografada;
    }
}
