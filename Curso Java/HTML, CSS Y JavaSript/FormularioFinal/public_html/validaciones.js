/*
 * funcion para vaidar los elementos requeridos
 * @param {Object} Leandro 
 */
function validaForma(forma) {
    //validamos el usuario
    var usuario = forma.usuario;

    if (usuario.value === "" || usuario.value === "Escribir usuario") {

        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    //validamos el password
    var password = forma.password;
    if (password.value === "" || password.length < 3) {
        alert("Debe proporcionar un password al menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }

    //validamos las tecnologias de interes
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;

    //revisamos si se selecciono algun checkbox

    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
        if (!checkSeleccionado) {
            alert("Debe proporcionar una tecnologia");
            return false;
        }
    }

    var generos = forma.genero;
    var radioSeleccionado = false;

    //revisamos si se selecciono algun radiobutton
    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    var musica = forma.musica;
    var musicaSeleccionada = false;


    if (musica.value === "") {
        if (musicaSeleccionada === false) {
            alert("debe seleccionar el genero de musica");
            musicaSeleccionada = false;
        }else{
            musicaSeleccionada = true;
        }
        


    }

    //validamos la ocupacion
    var ocupacion = forma.ocupacion;
    if (ocupacion.value === "") {
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    //formulario valido
    alert("Formulario valido, enviando datos...");
    return true;
}

