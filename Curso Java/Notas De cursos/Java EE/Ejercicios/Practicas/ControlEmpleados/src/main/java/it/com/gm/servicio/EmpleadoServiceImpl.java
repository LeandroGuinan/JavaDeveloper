package it.com.gm.servicio;

import it.com.gm.datos.EmpleadoDao;
import it.com.gm.domain.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Inject
    private EmpleadoDao empleadoDao;

    @Override
    public List<Empleado> encontrarEmpleados() {
        return this.empleadoDao.findAllEmpleado();
    }

    @Override
    public Empleado encontrarEmpleadoPorId(Empleado empleado) {
        return this.empleadoDao.findEmpleadoById(empleado);
    }

    @Override
    public void insertarEmpleado(Empleado empleado) {
        this.empleadoDao.insertEmpleado(empleado);
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        this.empleadoDao.updateEmpleado(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        this.empleadoDao.deleteEmpleado(empleado);
    }
    
    
}
