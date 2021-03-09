/*
 * @author Leandro
 */

window.onload = iniciaDatos;

/*
 * funcion que se manda a llamar
 * al cargar la pagina HTML
 */
function iniciaDatos(){
    document.getElementById("link").onclick = validaSalir;
    document.getElementById("linkSearch").onclick=busqueda;
}
/*
 * funcion que valida si el usuario quiere salir del sitio o no
 */
function validaSalir(){
    if(confirm("Desea salir del sitio")){
        alert("Nos vamos a google");
        return true; //regresamos verdadero para salir
    }else{
        alert("Nos quedamos en este sitio");
        return false;
    }
}
/*
 * Funcion que pide una cadena a buscar en google
 */

function busqueda(){
    //con la funcion prompt capturamos informacion del usuario
    var respuesta = prompt("Escribe la cadena a buscar:", "");
    //si hubo una respuesta concatenamos la cadena a buscar al link de google
    if(respuesta){
        alert("Tu respuesta fue:"+respuesta);
       /*
        * el operador this nos sirve para referenciar
        * el elemento que provoco el evento, en este caso
        * el elemento con identificador "linkSearch"
        * y concatenamos la respuesta como un parametro
        * de una peticion get
        */
       var nuevoLink = this +"search?q="+respuesta;
       alert("Nuevo link:"+nuevoLink);
       //redireccionamos el link
       window.location = nuevoLink;
       //regresamos false, sino nos lleva al link originalmente
       //registrado el elemento "linkSearch"
        return false;
    }
    else{
        alert("No proporcionaste ninguna cadena a buscar");
        return false;
    }
}