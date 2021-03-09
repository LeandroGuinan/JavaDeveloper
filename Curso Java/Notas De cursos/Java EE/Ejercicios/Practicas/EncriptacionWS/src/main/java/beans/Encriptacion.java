package beans;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Encriptacion {
    
    @WebMethod
    public String encrypt(String strToEncrypt);
    
    @WebMethod
    public String decrypt(String strToDecrypt);
    
    
}
