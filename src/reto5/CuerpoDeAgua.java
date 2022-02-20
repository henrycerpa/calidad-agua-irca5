package reto5;


import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class CuerpoDeAgua extends ObjetoGeografico {

    public CuerpoDeAgua (String nombre, int id, String municipio, String tipoagua, String tipocuerpo, Double irca, int poblacion, String respuesta){
        super(nombre, id, municipio, tipoagua, tipocuerpo, irca, poblacion);
        
    }
    
    public CuerpoDeAgua(){
        super();
    }
      
    public static String nivel(List<String> nombre1, List<Double> irca1){
        
        String nivel1 = "";

        for(int i = 0, j = 0; i<nombre1.size() && j<irca1.size(); i++, j++){
            String provnombre = nombre1.get(i);
            Double provirca = irca1.get(i);
            if(provirca<=5){
                nivel1 += "SIN RIESGO " + provnombre + "\n";
                } else if(provirca>=5.1 && provirca<=14){ 
                    nivel1 += "BAJO " + provnombre + "\n";
                } else if(provirca>=14.1 && provirca<=35){
                    nivel1 += "MEDIO " + provnombre + "\n";
                } else if(provirca>=35.1 && provirca<=80){
                    nivel1 += "ALTO " + provnombre + "\n";
                } else {
                    nivel1 += "INVIABLE SANITARIAMENTE " + provnombre + "\n";
                }
            }
        return nivel1 + "\r";
    }

    public static String Analisis(List<Double> irca1){    

        Double suma = 0.00;
        for(int i = 0; i<irca1.size(); i++){
            Double provisional = irca1.get(i);
            if(provisional<=35.1){
                suma = suma + 1;
            }
        }
        String imprimir = String.format("%.2f", suma);
        return imprimir;
        
    }
  
    public static String Sinriesgo(List<String> nombre1, List<Double> irca1){
        String sinriesgo = "";
        
        for(int i = 0, j = 0; i<nombre1.size() && j<irca1.size(); i++, j++){
            Double provisional = irca1.get(i);
            if (provisional>14 && provisional<=35) {
                sinriesgo += String.format(nombre1.get(i)) + "\n";
            }
        }
         
        if(sinriesgo == "") {
            sinriesgo += "NA" + "\n";
        }
        return sinriesgo;
    }
   
    public static String Estadistica(List<Double> irca1){
        DoubleSummaryStatistics estadistica = irca1.stream().collect(Collectors.summarizingDouble(item -> item));
        String impresion = String.format("%.2f", estadistica.getAverage());
        return impresion;
    }
}
