package it.com.en.servicio;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface DecryptWS {
    
    @WebMethod
    public String decrypt(Integer idToDec);
}
