package it.com.em.beans;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.ejb.Stateless;

@Stateless
public class EncriptarImpl implements Encriptar{
    
    private static final String UNICODE_FORMAT = "UTF-8";
    private static String text;
    private static String encriptedText;
    private static Cipher cipher;
    private static byte[] encryptedData;
    private static SecretKey Key;

    public EncriptarImpl() {
    }
    
    
    
    @Override
    public void insertText(String text) {
        try {
            this.text = text;
            Key = generateKey("AES");
            cipher = Cipher.getInstance("AES");
            encryptedData = encryptString(text, Key, cipher);
            encriptedText = new String (encryptedData);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(EncriptarImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(EncriptarImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public SecretKey generateKey(String encriptationType) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(encriptationType);
            SecretKey myKey = keyGenerator.generateKey();
            return myKey;
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace(System.out);
            return null;
        }
    }

    @Override
    public byte[] encryptString(String textToEncrypt, SecretKey myKey, Cipher cipher) {
        try {
            byte[] text = textToEncrypt.getBytes(UNICODE_FORMAT);
            cipher.init(Cipher.ENCRYPT_MODE, myKey);
            byte[] textEncipted = cipher.doFinal();
            return textEncipted;
            
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace(System.out);
            return null;
        } catch (InvalidKeyException ex) {
            ex.printStackTrace(System.out);
            return null;        
        } catch (IllegalBlockSizeException ex) {
            ex.printStackTrace(System.out);
            return null;
        } catch (BadPaddingException ex) {
            ex.printStackTrace(System.out);
            return null;
        }
    }

    @Override
    public String getEncriptedText() {
        return this.encriptedText;
    }
    
}
