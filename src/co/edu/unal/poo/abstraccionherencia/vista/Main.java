/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.poo.abstraccionherencia.vista;

import co.edu.unal.poo.abstraccionherencia.modelo.*;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args) {
        Compania comp1= new Compania("compania uno a");
                
        Programador programador1 = new Programador("Java", "Diana", 800000, "1");
        comp1.addContrato(programador1);
        Programador programador2 = new Programador("Java", "Juliana", 850000, "2");
        comp1.addContrato(programador2);
        //System.out.println(programador1.listarInformacion());
        
        Lider lider1 = new Lider("C++", "Andrea", 1000000, "2");
        comp1.addContrato(lider1);
        lider1.addProgramador(programador1);
        lider1.addProgramador(programador2);
        
        System.out.println(lider1.listarInformacion());
        
        System.out.println(comp1.obtenerSalarioGlobal());
        
        System.out.println("NOMINA");
        System.out.println(comp1.reporteNomina(lider1));
        
    }
    
}
