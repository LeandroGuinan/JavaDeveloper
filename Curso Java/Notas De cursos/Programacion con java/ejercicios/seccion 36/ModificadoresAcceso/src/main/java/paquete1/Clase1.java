package paquete1;

public class Clase1 {

    //Definicion de atributos
    public String aributoPublico = "Valor atributo public";
    protected String atributoProtegido = "Valor atributo protegido";
    String atributoDefault = "Valor atributo default o package";
    private String atributoPrivado = "Valor Atributo privado";

    public Clase1() {
        System.out.println("Constructor publico vacio");
    }

    public Clase1(String texto) {
        System.out.println("Constructor con un argumento " + texto);
    }

    protected Clase1(String texto1, String texto2) {
        System.out.println("Constructor protected con dos argumentos " + texto1 + texto2);
    }

    Clase1(String texto1, String texto2, String texto3) {
        System.out.println("Constructor default o package");
    }

    private Clase1(String texto1, String texto2, String texto3, String texto4) {
        System.out.println("Modificador de acceso privado");

    }

    public String metodoPublico() {
        return "Metodo Publico";
    }
    protected String metodoProtegido(){
        return "Metodo Protegido";
    }
    String metodoDefault(){
        return "Metodo Default";
    }
    
    private String metodoPrivado(){
        return "Metodo privado";
    }
}
