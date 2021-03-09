public class Aritmetica {
    
    //atributos de la clase
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Ejecutando contructor vacio");  
    }
    public Aritmetica(int a,int b){
        System.out.println("Ejecutanco constructor con dos argumentos");
        //dado el caso que se este usando la misma variable para locales, con la palabra this en un metodo hacemos referencia a a variable local establecida en el metodo
      this.a = a;
      this.b = b;
    }
    
    public int sumar(){
        return this.a+this.b; 
    }
    
    public int restar(){
        return this.a-this.b;
    }
    public int multiplicar(){
        return this.a*this.b;
    }
    public int dividir(){
        return this.a/this.b;
    }
}
