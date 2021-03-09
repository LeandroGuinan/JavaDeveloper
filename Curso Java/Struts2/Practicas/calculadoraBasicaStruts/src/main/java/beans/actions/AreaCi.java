package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
    @Result(name="success", location="/WEB-INF/content/circulo.jsp"),
    @Result(name="input", location="/WEB-INF/content/circulo.jsp")
})
public class AreaCi extends ActionSupport{
    
    private Integer radio;
    private Double area;
    
    Logger log = LogManager.getLogger(AreaCi.class);

    @Override
    public void validate() {
        if(radio == null){
            addFieldError("radio","valor Invalido");
        }
    }
    
    @Action("areaCi")
    @Override
    public String execute() throws Exception {
        try{
            area = Math.PI*(radio*radio);
        return SUCCESS;
        }catch(Exception ex){
            addFieldError("radio","Valor invalido");
            return INPUT;
        }
    }
    
    
    
    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    public Double getArea() {
        return area;
    }
}
