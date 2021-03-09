/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.em.datos;

import it.com.em.domain.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmpleadoDaoImpl implements EmpleadoDao{
    
    @PersistenceContext(unitName="EmpresaPU")
    EntityManager em;

    @Override
    public List<Empleado> getAllEmpleado() {
        return em.createNamedQuery("Empleado.findAll").getResultList();
    }
}
