/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import java.util.List;

/**
 *
 * @author Bito
 */
public class DensidadPoblacional extends ObjetoGeografico {

    public DensidadPoblacional  (String nombre, int id, String municipio, String tipoagua, String tipocuerpo, Double irca, int poblacion){
        super(nombre, id, municipio, tipoagua, tipocuerpo, irca, poblacion);
    }
    
    public DensidadPoblacional(){
        super();
    }
      
    public static String Afeccion(List<Integer> poblacion1){
        
        String impresion = "";      
        
        for(int i = 0; i<poblacion1.size(); i++){
            int provisional = poblacion1.get(i);
            if(provisional<10000){
            impresion += "Afeccion 0" + "\n";
            } else if(provisional>=10000 && provisional<=50000){ 
                impresion += "Afeccion 1" + "\n";
            } else {
                impresion += "Afeccion 2" + "\n";
            }
        }
        return impresion;
    }
    
}