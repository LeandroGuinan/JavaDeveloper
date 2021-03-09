function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.value === "" || usuario.value === "Escribir usuario"){
        alert("Debes proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if(password === "" || password.value.length<3){
        alert("Debe proporcionar un password al menos de tres caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for(var i = 0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    
    var genero = forma.generos;
    var radioSeleccionado = false;
    
    for (var i = 0; i < genero.length; i++) {
        if(genero[i].checked){
            radioSeleccionado = true;
        }
    }
    if(!radioSeleccionado){
        alert("Debes seleccionar un genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value ===""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    //Formulario es falso
    alert("Formulario valido, enviando al servidor");
    return true;
    
}


