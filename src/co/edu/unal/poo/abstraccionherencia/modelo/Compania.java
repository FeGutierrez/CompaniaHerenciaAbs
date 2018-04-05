/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.abstraccionherencia.modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Compania {
    
    private String nombre;
    private ArrayList<Contrato> contratos;

    public Compania(String nombre) {
        this.nombre = nombre;
        this.contratos = new ArrayList<>();
    }
    
    public boolean addContrato(Contrato contrato){
        return this.contratos.add(contrato);
    }
    
    public double obtenerSalarioGlobal(){
        double total=0;        
        for (int i = 0; i < this.contratos.size(); i++) {
            total += this.contratos.get(i).obtenerSalario();
        }        
        return total;
    }
    
    public String reporteNomina(Contrato contrato){
        return contrato.listarInformacion() + contrato.obtenerSalario() ;
        
    }
    
    
}
