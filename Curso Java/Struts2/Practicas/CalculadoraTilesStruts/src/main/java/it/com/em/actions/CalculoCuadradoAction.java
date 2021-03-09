package it.com.em.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name="success",location="cuadradoTile",type = "tiles"),
    @Result(name="input",location="cuadradoTile",type = "tiles")
})
public class CalculoCuadradoAction extends ActionSupport{
    Logger log = LogManager.getLogger(CalculoCuadradoAction.class);
    
    private Integer lado1;
    private Integer lado2;
    private Integer area;
    private Integer perimetro;
    
    @Override
    public void validate() {
        if(lado1 == null){
            addFieldError("lado1", "Invalid Value");
        }
        if(lado2 == null){
            addFieldError("lado2", "Invalid Value");
        }
    }
    
    @Action("CalcularCuadrado")
    @Override
    public String execute() throws Exception {
        try{
           area = lado1 * lado2;
           perimetro = 2*(lado1 + lado2);
            return SUCCESS;
        }catch(Exception ex){
            addFieldError("lado1", "Invalid Value");
            addFieldError("lado2", "Invalid Value");
            return INPUT;
        }
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getArea() {
        return area;
    }

    public Integer getPerimetro() {
        return perimetro;
    }
    
    
}
