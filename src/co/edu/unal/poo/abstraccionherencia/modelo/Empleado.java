package co.edu.unal.poo.abstraccionherencia.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empleado extends Contrato{
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario, String id) {
        super(id);
        this.nombre = nombre;
        this.salario = salario;
    }
    
    @Override
    public double obtenerSalario(){
        return this.salario;
    }
    
    @Override
    public String listarInformacion(){
        return "Nombre: " + this.nombre + " Salario: " + obtenerSalario();
        
    }
    
    
    
}
