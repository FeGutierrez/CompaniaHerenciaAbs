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
public class Administrador extends Empleado{

    public Administrador(String nombre, double salario, String id) {
        super(nombre, salario, id);
    }
    
    @Override
    public double obtenerSalario(){
        return 100;
    }
    
}
