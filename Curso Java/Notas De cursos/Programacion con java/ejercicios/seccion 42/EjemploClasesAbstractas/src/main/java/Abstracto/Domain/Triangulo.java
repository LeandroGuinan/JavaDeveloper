
package Abstracto.Domain;


public class Triangulo extends FiguraGeometrica{
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    
    @Override
    public void dibujar(){
        //agregamos el comportamiento del metodo abstracto
        System.out.println("Aqui deberia dibujar " + this.getClass().getSimpleName());
    }
}
