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
public class Programador extends Empleado{
    
    protected String lenguaje;

    public Programador(String lenguaje, String nombre, double salario, String id) {
        super(nombre, salario, id);
        this.lenguaje = lenguaje;
    }
    
    @Override
    public double obtenerSalario(){
        if (this.lenguaje.equals("Java")||this.lenguaje.equals("java")) {
            return super.obtenerSalario() + (super.obtenerSalario()*20/100);
        }
        return super.obtenerSalario();
    }
    
    @Override
    public String listarInformacion(){        
        return super.listarInformacion() + " Lenguaje: " + this.lenguaje;
    };
    
    
}
