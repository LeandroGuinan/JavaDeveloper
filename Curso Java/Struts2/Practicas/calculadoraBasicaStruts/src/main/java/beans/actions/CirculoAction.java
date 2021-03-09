package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;

@Result(name="success",location="/WEB-INF/content/circulo.jsp")
public class CirculoAction extends ActionSupport{
    
    @Override
    public String execute(){
        return SUCCESS;
    }
}
