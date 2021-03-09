package it.com.en.servicio;

import it.com.en.datos.PalabrasDao;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "it.com.en.servicio.DecryptWS")
public class DecryptWSImpl implements DecryptWS {
    
    //wsdl: http://localhost:8080/DecryptWSImplService/DecryptWSImpl?wsdl
    
    @Inject
    PalabrasDao palabraDao;
    
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
    public String decrypt(Integer idToDec) {
        
        String strToDecrytp = (this.palabraDao.findPalabrasById(idToDec)).getPalabraEncriptada();
        try {
            setKey(secretKeyCode);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrytp)));

        } catch (Exception ex) {
            System.out.println("Error en decrypt");
            ex.printStackTrace(System.out);
            return null;
        }
    }
}
