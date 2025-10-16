package com.tecsup.crud.controller;

import com.tecsup.crud.model.Empleado;
import com.tecsup.crud.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping
    public String listarEmpleados(Model model) {
        List<Empleado> empleados = empleadoService.obtenerTodos();
        model.addAttribute("empleados", empleados);
        return "empleados";
    }
    
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "agregar-empleado";
    }
    
    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado) {
        empleadoService.guardar(empleado);
        return "redirect:/empleados";
    }
    
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Empleado empleado = empleadoService.obtenerPorId(id);
        model.addAttribute("empleado", empleado);
        return "editar-empleado";
    }
    
    @PostMapping("/actualizar/{id}")
    public String actualizarEmpleado(@PathVariable Long id, @ModelAttribute Empleado empleado) {
        empleadoService.actualizar(id, empleado);
        return "redirect:/empleados";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarEmpleado(@PathVariable Long id) {
        empleadoService.eliminar(id);
        return "redirect:/empleados";
    }
}