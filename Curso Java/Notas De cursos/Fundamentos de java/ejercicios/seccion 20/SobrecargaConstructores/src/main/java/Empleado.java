public class Empleado extends Persona {
    
    private  double sueldo;
    
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public Empleado(String nombre,int edad,double sueldo){
        //tambien se puede heredar con la palabra super:
        
        //super(nombre,edad);
        
        //pero solo puede ser una de las dos
        
        this(nombre,edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
}
