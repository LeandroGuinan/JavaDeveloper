package it.com.sf.servicio;

import it.com.sf.domain.Datos;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class DataServiceImpl implements DataServiceRemote {

    @Override
    public List<Datos> calcularFuerzas() {
        List<Datos> datos = new ArrayList<>();

        datos.add(new Datos(1, 10));
        datos.add(new Datos(2, 20));

        List fuerzas = new ArrayList();
        for (Datos d : datos) {
            double dato = (d.getMasa() * 9.8);
            fuerzas.add(dato);
        }

        return fuerzas;
    }

}
