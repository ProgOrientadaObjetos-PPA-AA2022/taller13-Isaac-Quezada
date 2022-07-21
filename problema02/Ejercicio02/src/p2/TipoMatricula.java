/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;



/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioMatriculas;
     private ArrayList<Matricula> Matricula;
    
    public void establecerMatricula(ArrayList<Matricula> t) {
        Matricula = t;
    }
    
    public ArrayList<Matricula> obtenerMatricula() {
        return Matricula;
    }
    
    public void establecerPromedioTarifas(){
        for (int i = 0; i < 10; i++) {
            
        }
        promedioMatriculas = ;0
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
    @Override
    public String toString() {

        String listado = String.format("Tipos De Matriculas:"
                + "T: %.2f\n"
                + "T: %.2f\n"
                + "T: %.2f\n"
                + "T: %.2f\n"
                + "P: %.2f\n",
                obtenerPromedioTarifas(),
                obtenerPromedioTarifas(),
                obtenerPromedioTarifas(),
                obtenerPromedioTarifas(),
                obtenerPromedioTarifas());
        return listado;

    }
}
