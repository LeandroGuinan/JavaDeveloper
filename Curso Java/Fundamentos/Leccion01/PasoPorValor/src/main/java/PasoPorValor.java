//ambas son variables locales, las cuales se destruyen al finalizar el respectivo metodo
public class PasoPorValor {
    public static void main(String[]args){
        var i =10;
        System.out.println("i = " + i);
        
        cambiarValor(i);
        System.out.println("i = " + i);
        
    }
//esto es lo que se conoce como paso por valor, en este metodo no se modifica la variable del metodo main
//porque lo que se esta enviando al metodo cambiar valor es una copia de la variable original
//por ende no se cambia el valor de esta variable
//solo se esta cambiando el valor de la copia hecha en este metodo    
    private static void cambiarValor(int arg) {
        arg = 20;
        System.out.println("arg = " + arg);
    }
}
