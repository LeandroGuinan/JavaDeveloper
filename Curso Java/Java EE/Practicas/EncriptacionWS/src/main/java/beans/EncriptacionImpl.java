package beans;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "beans.Encriptacion")
public class EncriptacionImpl implements Encriptacion {

    static final String secretKeyCode = "ssshhhhhhhhhhh!!!!";

    private static SecretKeySpec secretKey;
    private static byte[] key;

    private static void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (Exception ex) {
            System.out.println("Error en SetKey");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public String encrypt(String strToEncrypt) {
        try {
            setKey(secretKeyCode);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));

        } catch (Exception ex) {
            System.out.println("Error en encriptacion ");
            ex.printStackTrace(System.out);
            return null;
        }
    }

    @Override
    public String decrypt(String strToDecrypt) {
        try {
            setKey(secretKeyCode);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));

        } catch (Exception ex) {
            System.out.println("Error en decrypt");
            ex.printStackTrace(System.out);
            return null;
        }
    }

}
