package it.com.em.service;

import it.com.em.data.DepartamentosDao;
import it.com.em.data.EmpleadoDao;
import it.com.em.domain.Departamentos;
import it.com.em.domain.Empleado;
import java.util.List;
import javax.inject.Inject;

public class GestionEmpleadoImpl implements GestionEmpleado{

    @Inject
    EmpleadoDao emp;
    
    @Inject
    DepartamentosDao deo;

    @Override
    public List<Empleado> listarEmpleados() {
        return emp.findAllEmpleado();
    }

    @Override
    public void insertarEmpleado(Empleado empleado) {
        double nuevoP = (empleado.getSueldo() + empleado.getIdDepartamento().getPresupuestoDepartamento());
        Departamentos neD = new Departamentos(empleado.getIdEmpleado());
        neD.setPresupuestoDepartamento(nuevoP);
        
        emp.insertEmpleado(empleado);
        deo.updateDepartamentos(empleado.getIdDepartamento());
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        emp.deleteEmpleado(empleado);
    }
}
