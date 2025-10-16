package com.tecsup.crud.service;

import com.tecsup.crud.model.Empleado;
import java.util.List;

public interface EmpleadoService {
    List<Empleado> obtenerTodos();
    Empleado obtenerPorId(Long id);
    Empleado guardar(Empleado empleado);
    Empleado actualizar(Long id, Empleado empleado);
    void eliminar(Long id);
    List<Empleado> obtenerPorDepartamento(String departamento);
}
