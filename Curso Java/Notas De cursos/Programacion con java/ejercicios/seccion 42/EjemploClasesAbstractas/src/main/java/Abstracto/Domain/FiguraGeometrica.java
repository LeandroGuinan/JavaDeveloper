package Abstracto.Domain;

public abstract class FiguraGeometrica {

    //abstracto en java: no podremos crear objetos ni instancias de esta clase
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;

    }

    //la clase padre no define el comportamiento
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }

}
