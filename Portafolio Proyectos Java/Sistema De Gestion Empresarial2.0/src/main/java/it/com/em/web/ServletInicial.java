package it.com.em.web;

import it.com.em.domain.Departamentos;
import it.com.em.domain.Empleado;
import it.com.em.service.EmpresaService;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ServletInicial {

    @Autowired
    private EmpresaService src;

    @GetMapping("/")
    public String inicio(Model mode) {
        List<Departamentos> deps = src.listarDepartamentos();
        Double presupuesto = src.presupuestoTotal(deps);
        mode.addAttribute("pres", presupuesto);
        return "index";
    }

    @GetMapping("/deps")
    public String redirigir1(Model mode) {
        List<Departamentos> dps = src.listarDepartamentos();
        mode.addAttribute("departs", dps);
        return "departamentos";
    }

    @GetMapping("/empleados")
    public String redirigir2(Model mode) {
        List<Empleado> emps = src.listarEmpleado();
        mode.addAttribute("emp", emps);
        return "empleados";
    }

    @GetMapping("/agregar")
    public String redirigir3(Empleado empleado) {
        return "agregar";
    }

    @GetMapping("/pEliminar")
    public String redirigir3(Model mode, Empleado empleado) {
        List<Empleado> emps = src.listarEmpleado();
        mode.addAttribute("emp", emps);
        return "eliminarEmp";
    }

    @GetMapping("/pEditar")
    public String redirigir4(Model mode, Empleado empleado) {
        List<Empleado> emps = src.listarEmpleado();
        mode.addAttribute("emp", emps);
        return "editarEmp";
    }

    @GetMapping("/editar")
    public String redirigir5(Empleado empleado, Model mode) {
        empleado = src.encontrarEmpleado(empleado);
        mode.addAttribute("empleado", empleado);
        return "agregar";
    }

    @GetMapping("/eliminar")
    public String delete(Empleado empleado) {
        System.out.println(empleado);
        src.eliminarEmpleado(empleado);

        return "redirect:/empleados";
    }

    @PostMapping("/agregarEmp")
    public String agregar(@Valid Empleado empleado, Errors error) {
        if (error.hasErrors()) {
            return "agregar";
        } else {
            src.insertarEmpleado(empleado);
            return "redirect:/empleados";
        }

    }

}
