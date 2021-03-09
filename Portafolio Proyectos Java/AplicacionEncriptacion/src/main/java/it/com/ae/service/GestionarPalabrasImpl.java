package it.com.ae.service;

import it.com.ae.domain.Palabra;
import it.com.ae.domain.PalabraEncriptada;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.ejb.Stateless;

@Stateless
public class GestionarPalabrasImpl implements GestionarPalabras {
    
    private static final String UNICODE_FORMAT = "UTF-8";
    private String text;
    private String encriptedText;
    private Cipher cipher;
    private byte[] encrytedData;
    private SecretKey key;
    
    @Override
    public List<Palabra> cargarListaDePalabras() {
        List<Palabra> palabras = new ArrayList<>();
        palabras.add(new Palabra("hola"));
        palabras.add(new Palabra("Adios"));
        return palabras;
    }
    
    private void insertText(String text){
        try {

            this.text = text;
            key = generateKey("AES");
            cipher = Cipher.getInstance("AES");
            encrytedData = encryptString(text, key, cipher);
            encriptedText = new String(encrytedData);

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    private SecretKey generateKey(String encriptationType) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(encriptationType);
            SecretKey myKey = keyGenerator.generateKey();
            return myKey;
        } catch (Exception ex) {
            return null;
        }
    }

    private byte[] encryptString(String textToEncrypt, SecretKey myKey, Cipher cipher) {
        try {
            byte[] text = textToEncrypt.getBytes(UNICODE_FORMAT);
            cipher.init(Cipher.ENCRYPT_MODE, myKey);
            byte[] textEncripted = cipher.doFinal(text);
            return textEncripted;
        } catch (Exception ex) {
            return null;
        }
    }


    @Override
    public List<PalabraEncriptada> encriptarPalabras() {
        
        
        List<Palabra> palabras = new ArrayList<>();
        palabras = cargarListaDePalabras();
        List<PalabraEncriptada> palabrasE = new ArrayList<>();

        for (Palabra p : palabras) {
            insertText(p.getPalabra());
            palabrasE.add(new PalabraEncriptada(encriptedText));
        }

        return palabrasE;
    }

}
