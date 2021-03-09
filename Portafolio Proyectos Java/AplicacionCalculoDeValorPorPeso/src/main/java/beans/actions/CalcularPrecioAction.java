package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class CalcularPrecioAction extends ActionSupport {

    Logger log = LogManager.getLogger(CalcularPrecioAction.class);

    private static final double TARIFA_REGULAR = 3;

    private static final double TARIFA_ESPECIAL_PESO_REAL = 1.5;

    private static final double TARIFA_ESPECIAL_PESO_VOLUMETRICO = 1.5;

    private static final int PESO_VOLUMETRICO_UNIDAD = 5000;

    private double pesoReal;

    private double alto;

    private double largo;

    private double ancho;

    private double pesoVolumetrico;

    private double precioDeEnvio;

    private String tipoDeProducto;

    @Override
    public String execute() throws Exception {
        this.pesoVolumetrico = (alto * ancho * largo) / PESO_VOLUMETRICO_UNIDAD;

        if (this.pesoReal < 10) {

            if (pesoVolumetrico > pesoReal) {
                this.precioDeEnvio = pesoVolumetrico * TARIFA_REGULAR;
                log.info("Precio Calculado");
                return SUCCESS;
            } else {
                this.precioDeEnvio = pesoReal * TARIFA_REGULAR;
                log.info("Precio Calculado");
                return SUCCESS;
            }

        } else if (this.pesoReal >= 10 && pesoVolumetrico > pesoReal * 2) {

            pesoReal = this.pesoReal * TARIFA_ESPECIAL_PESO_REAL;
            pesoVolumetrico = this.pesoVolumetrico * TARIFA_ESPECIAL_PESO_VOLUMETRICO;

            this.precioDeEnvio = pesoReal + pesoVolumetrico;
            log.info("Precio Calculado");
            return SUCCESS;

        } else if (this.pesoReal >= 10 && pesoVolumetrico < pesoReal * 2) {
            this.precioDeEnvio = pesoReal * TARIFA_REGULAR;
            log.info("Precio Calculado");
            return SUCCESS;
        } else {
            return SUCCESS;
        }
    }

    public void setPesoReal(double pesoReal) {
        this.pesoReal = pesoReal;
    }

    public void setAlto(double alt) {
        this.alto = alto;
    }

    public void setLargo(double larg) {
        this.largo = larg;
    }

    public void setAncho(double anch) {
        this.ancho = anch;
    }

    public double getPrecioDeEnvio() {
        return precioDeEnvio;
    }

    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }

    public String getCabezero() {
        return getText("precio.cabezero");
    }

    public String getTitulo() {
        return getText("precio.titulo");
    }

    public String getTitulo2() {
        return getText("precio.titulo2");
    }

    public String getPes() {
        return getText("precio.pes");
    }

    public String getAlt() {
        return getText("precio.alt");
    }

    public String getLarg() {
        return getText("precio.larg");
    }

    public String getAnch() {
        return getText("precio.anch");
    }

    public String getBoton() {
        return getText("precio.boton");
    }

    public String getTitulo3() {
        return getText("precio.titulo3");
    }

    public String getMoneda() {
        return getText("precio.moneda");
    }

    public String getTitulo4() {
        return getText("precio.titulo4");
    }
}
