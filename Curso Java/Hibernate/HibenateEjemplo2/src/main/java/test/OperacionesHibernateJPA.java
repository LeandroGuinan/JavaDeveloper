package test;

import it.com.gm.dao.PersonaDao;
import it.com.gm.domain.Persona;

public class OperacionesHibernateJPA {

    public static void main(String[] args) {
        PersonaDao personaDao = new PersonaDao();
        personaDao.listar();

//        Persona persona = new Persona();
//        persona.setNombre("Leandro");
//        persona.setApellido("Guinan");
//        persona.setEmail("leandrog@mail.com");
//        persona.setTelefono("1122889955");
//        personaDao.insertar(persona);

        Persona persona = new Persona(18);
        persona = personaDao.buscarPersonaPorID(persona);
        System.out.println("persona = " + persona +"\n");
//        
//        persona.setNombre("leandro");
//        persona.setApellido("guinan");
//        persona.setEmail("leandroG@mail.com");
//        persona.setTelefono("1122889955");
        
//        personaDao.modificar(persona);
          
          personaDao.eliminar(persona);
          personaDao.listar();
    }
}
