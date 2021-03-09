package it.com.em.service;

import it.com.em.datos.EmpleadoDao;
import it.com.em.domain.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Inject
    EmpleadoDao empleadoDao;

    @Override
    public List<Empleado> getListaDeEmpleados() {
        return empleadoDao.getAllEmpleado();
    }
    
    
}
