package it.com.em.beans;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.ejb.Remote;

@Remote
public interface Encriptar {
    
    public void insertText(String text);
    
    public SecretKey generateKey(String encriptationType);
    
    public byte[] encryptString(String textToEncrypt, SecretKey myKey, Cipher cipher);
    
    public String getEncriptedText();
}
