/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class Coordinador {
    private ArrayList<Persona> lista=new ArrayList<Persona>();
    
    public int getTamano(){
        return lista.size();
    }
    
    public void setAgregar(Persona p){
        lista.add(p);
    }
    
    public Persona getPersona(){
        return lista.get(getTamano());
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,Arrays.toString(lista.toArray()));
    }
}
