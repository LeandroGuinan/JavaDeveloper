package it.com.em.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name = "success", location = "circuloTile",type = "tiles"),
    @Result(name = "input", location = "circuloTile",type = "tiles")
})
public class CalculoCirculoAction extends ActionSupport {

    Logger log = LogManager.getLogger(CalculoCirculoAction.class);

    private Double area;
    private Integer radio;
    private Double perimetro;

    @Override
    public void validate() {
        if (radio == null) {
            addFieldError("radio", "Invalid Value");
        }
    }

    @Action("calcularCirculo")
    @Override
    public String execute() throws Exception {
        try {
            area = Math.PI * (radio * radio);
            perimetro = 2*Math.PI*radio;
            return SUCCESS;
        } catch (Exception ex) {
            addFieldError("radio", "Invalid Value");
            return INPUT;
        }
    }

    public Double getArea() {
        return area;
    }

    public Double getPerimetro() {
        return perimetro;
    }
    
    public void setRadio(Integer radio) {
        this.radio = radio;
    }
}
