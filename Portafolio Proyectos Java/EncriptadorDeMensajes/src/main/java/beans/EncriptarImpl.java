package beans;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.ejb.Stateless;

@Stateless
public class EncriptarImpl implements Encriptar {

    private static final String UNICODE_FORMAT = "UTF-8";
    private static String text;
    private static String encriptedText;
    private static Cipher cipher;
    private static byte[] encrytedData;
    private static SecretKey key;

    public EncriptarImpl() {
    }
    
    @Override
    public void insertText(String text){
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

    @Override
    public SecretKey generateKey(String encriptationType) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(encriptationType);
            SecretKey myKey = keyGenerator.generateKey();
            return myKey;
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public byte[] encryptString(String textToEncrypt, SecretKey myKey, Cipher cipher) {
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
    public String getEncriptedText() {
        return this.encriptedText;
    }

}
