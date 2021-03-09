function sumar() {
    //envolvemos todo el codigo en un bloque try y catch
    //para procesar la excepcion en caso que haya alguna
    try {
        //pedimos el valor del operando
        var a = prompt("Valor a: ", "");
        //validamos parametro a, !a revisa si la cadena esta vacia o nula
        if (!a || isNaN(a)) {
            throw new Error("Valor invalido de a: " + a);
        }

        //pedimos el valor de b
        var b = prompt("Valor b: ", "");

        //vaidamos nuestro parametro b, !b revisa si la cadena esta vacia o nula
        if (!b || isNaN(b)) {
            throw new Error("Valor invalido de b: " + b);
        }
        /*
         * si no hay problema, hacemos la suma nececiamos
         * convertir a int los parametros parseInt convierte a entero
         * si no es entero no va a realizar la suma sino concatena los valore
         */
        var c = parseInt(a) + parseInt(b);
        alert("La suma es: " + c);

    } catch (e) {
        alert("El error es: " + e);
    }
}


