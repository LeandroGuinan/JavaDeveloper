package it.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

//aqui definimos las accions de tiles, y por ende nececitamos resultados tipo tiles:
@Results({
    @Result(name="bienvenidoResult",location="bienvenidoTile", type = "tiles"),
    @Result(name="personasResult", location="personasTile",type = "tiles")
})
//nota: se debe crear tambien el archivo de struts.xml
public class LinkAction extends ActionSupport{
    
    //en esta clase definimos los resultados segun la accion que se ejecute
    
    
    @Action(value="bienvenidoAction")
    public String bienvenido(){
       return "bienvenidoResult"; 
    }
    
    @Action(value="personasAction")
    public String personas(){
        return "personasResult";
    }
    
    //segun el metodo que se ejecute, se obtiene una un resultado, y este resultado lo procesa
    //struts.xml para hacer el redireccionamiento a la pagina solicitda
    
    //al trabajar con tiles se hace obligatorio el uso de struts.xml para procesar las acciones
    //esto devido a que no tienen soporte de anotaciones como tal
}

/*
Uso De Tiles:

1.Importamos las dependencias de maven
2.configuramos el web.xml para el uso de tiles
3.creamos el archivo tiles.xml, donde definimos las acciones que haran referencia en la clase action, en location
4.creamos la clase action que procesara las acciones del archivo tiles.xml, haciendo sus acciones tipo tiles
5.creamos el archivo struts.xml que procesara la accion de el archivo Action, por ende debe estar configurado
para recibir tipos tiles
6.creamos los jsp respectivos para cada redireccionamiento
*/
