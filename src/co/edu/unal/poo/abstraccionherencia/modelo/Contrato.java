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
public abstract class Contrato {
    private String id;

    public Contrato(String id) {
        this.id = id;
    }
    
    public abstract double obtenerSalario();
    
    public abstract String listarInformacion();
    
}
