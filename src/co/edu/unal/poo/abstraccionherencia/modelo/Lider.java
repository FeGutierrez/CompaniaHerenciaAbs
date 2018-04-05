package co.edu.unal.poo.abstraccionherencia.modelo;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Lider extends Programador{
    private ArrayList<Programador> programadores;

    public Lider(String lenguaje, String nombre, double salario, String id) {
        super(lenguaje, nombre, salario, id);
        this.programadores = new ArrayList<>();
    }
    
    public boolean addProgramador(Programador programador){
        return this.programadores.add(programador);
    }
    
    @Override
    public double obtenerSalario(){
        return super.obtenerSalario() + 
                ( (super.obtenerSalario()/100)*(this.programadores.size()*10) );
    }
    
    public String listarPersonasACargo(){
        String a = "\nPersonas a cargo: \n";
        for (int i = 0; i < this.programadores.size(); i++) {
            a += this.programadores.get(i).listarInformacion() + "\n";
        }
        return a;
    };
    
    @Override
    public String listarInformacion(){
        return "Cargo: " + this.getClass().getSimpleName()+ ": " + super.listarInformacion() + listarPersonasACargo(); 
    }


    
    
}
