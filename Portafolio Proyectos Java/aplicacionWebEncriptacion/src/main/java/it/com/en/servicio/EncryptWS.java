package it.com.en.servicio;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EncryptWS {
    
    @WebMethod
    public String encrypt(String strToE);
    
    
}
