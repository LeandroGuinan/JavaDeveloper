package it.com.em.service;

import it.com.em.data.CatalogoDao;
import it.com.em.data.DepartamentosDao;
import it.com.em.data.EmpleadoDao;
import it.com.em.domain.Catalogo;
import it.com.em.domain.Departamentos;
import it.com.em.domain.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private DepartamentosDao DepartamentosDAO;

    @Autowired
    private EmpleadoDao empleadoDAO;
    
    @Autowired
    private CatalogoDao catalogoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Departamentos> listarDepartamentos() {
        return (List<Departamentos>) DepartamentosDAO.findAll();
    }

    @Override
    @Transactional()
    public void modificarDepartamento(Departamentos departamento) {
        DepartamentosDAO.save(departamento);
    }

    @Override
    @Transactional(readOnly = true)
    public Departamentos encontrarDepartamento(Departamentos departamento) {
        return DepartamentosDAO.findById(departamento.getIdDepartamentos()).orElse(null);
    }
    
    @Override
    public Double presupuestoTotal(List<Departamentos> deps) {
        Double presupuestoTotal = 0.0;
        for(Departamentos p: deps){
            presupuestoTotal = p.getPresupuestoDepartamento() + presupuestoTotal;
        }
        return presupuestoTotal;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> listarEmpleado() {
        return (List<Empleado>) empleadoDAO.findAll();
    }

    @Override
    @Transactional()
    public void insertarEmpleado(Empleado empleado) {

        Departamentos dps;
        dps = empleado.getDepartamentos();
        dps = encontrarDepartamento(dps);

        if (empleado.getIdEmpleado() != null) {
            Empleado emp2 = encontrarEmpleado(empleado);
            
            double presupuestoAnterior = emp2.getDepartamentos().getPresupuestoDepartamento() - emp2.getSueldo();
            double presupuestoNuevo = presupuestoAnterior + empleado.getSueldo();
            dps.setPresupuestoDepartamento(presupuestoNuevo);
            modificarDepartamento(dps);
            empleadoDAO.save(empleado);

        } else {
            empleadoDAO.save(empleado);

            double presupuestoNuevo = dps.getPresupuestoDepartamento() + empleado.getSueldo();
            dps.setPresupuestoDepartamento(presupuestoNuevo);
            modificarDepartamento(dps);

        }

    }

    @Override
    @Transactional()
    public void eliminarEmpleado(Empleado empleado) {

        empleado = encontrarEmpleado(empleado);
        Departamentos dps = empleado.getDepartamentos();
        dps = encontrarDepartamento(dps);
        double presupuestoNuevo = dps.getPresupuestoDepartamento() - empleado.getSueldo();
        dps.setPresupuestoDepartamento(presupuestoNuevo);
        modificarDepartamento(dps);
        empleadoDAO.delete(empleado);
    }

    @Override
    public Empleado encontrarEmpleado(Empleado empleado) {
        return empleadoDAO.findById(empleado.getIdEmpleado()).orElse(null);
    }

    @Override
    public void agregarACatalogo(Catalogo catalogo) {
        catalogoDao.save(catalogo);
    }

    

}
