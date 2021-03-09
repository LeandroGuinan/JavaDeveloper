package datos;

import exepciones.*;

public class ImplementacionMySql implements AccesoDatos {

    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEX {
        if (simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        } else {
            System.out.println("Insertar desde MySql");
        }

    }

    @Override
    public void listar() throws LecturaDatosEx {
        if (simularError) {
            throw new LecturaDatosEx("Error Lectura De Datos");

        } else {
            System.out.println("Listar desde MySql");
        }

    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

    public boolean isSimularError() {
        return this.simularError;
    }

}
