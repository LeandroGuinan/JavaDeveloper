package it.com.em.service;

import it.com.em.domain.Catalogo;
import it.com.em.domain.Departamentos;
import it.com.em.domain.Empleado;
import java.util.List;

public interface EmpresaService {

    public List<Departamentos> listarDepartamentos();
    
    public Departamentos encontrarDepartamento(Departamentos departamento);
    
    public void modificarDepartamento(Departamentos departamento);
    
    public Double presupuestoTotal(List<Departamentos> deps);
    
    public List<Empleado> listarEmpleado();
    
    public Empleado encontrarEmpleado(Empleado empleado);
    
    public void insertarEmpleado(Empleado empleado);
    
    public void eliminarEmpleado(Empleado empleado);
    
    public void agregarACatalogo(Catalogo catalogo);
}
