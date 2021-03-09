package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
    @Result(name = "success", location = "/WEB-INF/content/cuadrado.jsp"),
    @Result(name="input", location="/WEB-INF/content/cuadrado.jsp")
})

public class AreaCuaAction extends ActionSupport {

    private Integer lado1;
    private Integer lado2;
    private Integer res;

    @Override
    public void validate() {
        if (lado1 == null) {
            addFieldError("lado1", "valor invalido");
        }
        if (lado2 == null) {
            addFieldError("lado2", "valor invalido");
        }

    }

    @Action("areaCua")
    @Override
    public String execute() throws Exception {
        try {
            res = lado1 * lado2;
            return SUCCESS;
        } catch (Exception ex) {
//            addFieldError("lado1", "valor invalido");
//            addFieldError("lado2", "valor invalido");
            return INPUT;
        }

    }

    public Integer getLado1() {
        return lado1;
    }

    public void setLado1(Integer lado1) {
        this.lado1 = lado1;
    }

    public Integer getLado2() {
        return lado2;
    }

    public void setLado2(Integer lado2) {
        this.lado2 = lado2;
    }

    public Integer getRes() {
        return res;
    }
}
