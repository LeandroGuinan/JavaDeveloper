package Abstracto.Domain;



public class Circulo extends FiguraGeometrica{
    
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
    
    @Override
    public void dibujar(){
        //agregamos el comportamiento del metodo abstracto
        System.out.println("Aqui deberia dibujar " + this.getClass().getSimpleName());
        //super.dibujar();
    }
}
// no se esta modificando como tal, por ende no es una sobreescritura
// lo que se esta haciendo es asignarle comportamiento