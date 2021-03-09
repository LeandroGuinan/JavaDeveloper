package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        
        //creamos el objeto que apunte a la clase principal
        PersonaJDBC personaJDBC = new PersonaJDBC();
        
        //y lo alojamos en la variable temporal de lista personas
       List<Persona> personas = personaJDBC.select();
       
       //aqui por cada dato introducido en la lista personas 
       //se imprimira el contenido de la variable persona
       for(Persona persona: personas){
           System.out.println("Persona: "+ persona);
       }
       
       //prueba insert:
       //insertamos los valores para agregarlos a la base de datos
       //ya que la clase que maneja los datos toma estos valores de
       //la clase persona y se llama al metodo que los inserta
       
      /* Persona persona = new Persona();
       persona.setNombre("maria");
       persona.setApellido("lara");
       persona.setEmail("emelara@gmail.com");
       persona.setTelefono("558777894");
       */
       //este metodo inserta los valores a la base de datos, por esto se debe llamar
       
     /* personaJDBC.insert(persona);*/
       
       //prueba update
       
      /* Persona persona =new Persona();
       persona.setIdPersona(3);
       persona.setNombre("Mayra");
       persona.setApellido("lara");
       persona.setEmail("mlara@gmail.com");
       persona.setTelefono("55668899");
       
       personaJDBC.update(persona);*/
            
        Persona persona = new Persona();
        persona.setIdPersona(3);
        personaJDBC.delete(persona);
    }
}
