package com.tecsup.crud.service;

import com.tecsup.crud.model.Empleado;
import com.tecsup.crud.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;
    
    @Override
    public List<Empleado> obtenerTodos() {
        return empleadoRepository.findAll();
    }
    
    @Override
    public Empleado obtenerPorId(Long id) {
        Optional<Empleado> empleado = empleadoRepository.findById(id);
        return empleado.orElse(null);
    }
    
    @Override
    public Empleado guardar(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }
    
    @Override
    public Empleado actualizar(Long id, Empleado empleado) {
        if (empleadoRepository.existsById(id)) {
            empleado.setId(id);
            return empleadoRepository.save(empleado);
        }
        return null;
    }
    
    @Override
    public void eliminar(Long id) {
        empleadoRepository.deleteById(id);
    }
    
    @Override
    public List<Empleado> obtenerPorDepartamento(String departamento) {
        return empleadoRepository.findByDepartamento(departamento);
    }
}