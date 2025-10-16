package com.tecsup.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "apellido", nullable = false)
    private String apellido;
    
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    
    @Column(name = "departamento")
    private String departamento;
    
    @Column(name = "salario")
    private Double salario;
    
    // Constructores
    public Empleado() {}
    
    public Empleado(String nombre, String apellido, String email, String departamento, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
    }
    
    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    
    public Double getSalario() { return salario; }
    public void setSalario(Double salario) { this.salario = salario; }
}