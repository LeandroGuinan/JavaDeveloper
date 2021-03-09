window.onload = cargarImagenes;

function cargarImagenes() {
    for (var i = 0; i < document.images.length; i++) {
        if (document.images[i].parentNode.tagName == "A") {
            configuraRollover(document.images[i]);
        }
    }
}

function configuraRollover(imagen) {
    imagen.imagenOff = new Image();
    imagen.imagenOff.src = "boton_off.jpg";
    imagen.onmouseout = cambiaOff;

    imagen.imagenOn = new Image();
    imagen.imagenOn.src = "boton_on.jpg";
    imagen.onmouseout = cambiaOn;
}
/*
 * Estas funciones se ejecutan segun el evento que se dispara
 * pero no es al iniciar la pagina, sino dependen del
 * boton que se presionen, son conocidos como handlers
 */
//se asocio al evento onmouseout
function cambiaOff() {
    this.src = this.imagenOff.src; //tomamos los valores ya asociados
}

//se asocio al evento onmouseover
function cambiaOn(){
    this.src = this.imagenOn.src; //tomamos los valores ya asociados
}
