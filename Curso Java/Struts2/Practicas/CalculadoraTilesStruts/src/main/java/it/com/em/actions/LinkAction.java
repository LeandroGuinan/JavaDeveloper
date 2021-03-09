package it.com.em.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name="cuadradoResult", location="cuadradoTile",type="tiles"),
    @Result(name="circuloResult", location="circuloTile",type="tiles"),
    @Result(name="entradaResult", location="inicial",type="tiles")
})
public class LinkAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LinkAction.class);
    
    @Action("cuadradoAction")
    public String cuadrado(){
        return "cuadradoResult";
    }
    
    @Action("circuloAction")
    public String circulo(){
        return "circuloResult";
    }
    @Action("entradaAction")
    public String entrada(){
        return "entradaResult";
    }
}
