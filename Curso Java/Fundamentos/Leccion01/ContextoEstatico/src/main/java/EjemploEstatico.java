public class EjemploEstatico {
    public static void main(String[]args){
        Persona p1 = new Persona("Juan");
        System.out.println(p1);
        
        Persona p2 = new Persona("Karla");
        System.out.println(p2);
        
        Persona p3 = new Persona("Carlos");
        System.out.println(p3);
        
        System.out.println("Contador Personas: "+ Persona.getContadorPersonas());
    }
}
