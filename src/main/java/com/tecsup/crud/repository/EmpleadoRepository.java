package com.tecsup.crud.repository;

import com.tecsup.crud.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findByDepartamento(String departamento);
    Empleado findByEmail(String email);
}