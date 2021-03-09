/*
 * Catalogo de usuarios
 */
//VARIABLES GLOBALES

var usuarios = new array();
var contadorUsuarios = 0;

function agregarUsuario(entrada) {
    var usuario = entrada.value.trim();
    usuarios[contadorUsuarios++] = usuario;
    //desplegamos el catalogo actual de usuarios
    mostrarUsuarios();
    //Limpiamos el catalogo actual y la seleccionamos
    entrada.value = "";
    entrada.focus();
}

function mostrarUsuarios() {
    limpiar("listado");
    var usuario = null;
    for (i = 0; i < usuarios.length; i++) {
        usuario = usuarios[i];
        var resultado = i + " - " + usuario;
        imprimir(resultado, "listado");
    }
}

function buscarUsuario(entrada) {
    for (var i = 0; i < usuarios.length; i++) {
        if ((usuarios[i] === entrada.value)) {
            document.getElementById("busqueda").innerHTML = "El usuario tiene la posicion: " + [i];
            break;
        } else {
            document.getElementById("busqueda").innerHTML = "No se encontro ningun resultado";
        }
    }
}

function imprimir(valor, campo) {
    var resultado = document.getElementById(campo);
    resultado.innerHTML += valor + " <br/>";
}
function limpiar(campo) {
    document.getElementById(campo).innerHTML = "";
}