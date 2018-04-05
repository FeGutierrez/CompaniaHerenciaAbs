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
public class Consultor extends Contrato{
    
    protected String nombre;
    protected String labor;

    public Consultor(String nombre, String labor, String id) {
        super(id);
        this.nombre = nombre;
        this.labor = labor;
    }
    
    
    @Override
    public double obtenerSalario(){
        return 220;
    }
    
    @Override
    public String listarInformacion(){
        return " Nombre: " + this.nombre + " Labor: " + this.labor 
                + "Salario: " + obtenerSalario();
    }
    
    
}
