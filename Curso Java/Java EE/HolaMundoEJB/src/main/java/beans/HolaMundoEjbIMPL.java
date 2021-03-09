package beans;

import javax.ejb.Stateless;

@Stateless
public class HolaMundoEjbIMPL implements HolaMundoEjbRemote {
    
    @Override
    public int sumar(int a, int b){
        System.out.println("Ejecutando Metodo Suma en el Server");
        return a+b;
    }
}
