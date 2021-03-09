package enumeraciones;

public enum Continentes {
        
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OSEANIA(14);
    
    //ATRIBUTO DE PAISES
    private final int paises;
    
    //constructor de cada elemento de la enumeracion
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
