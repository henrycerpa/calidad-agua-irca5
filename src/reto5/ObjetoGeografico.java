/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

/**
 *
 * @author Bito
 */
public class ObjetoGeografico {
        
    private String nombre;
    private int id;
    private String municipio;
    private String tipoagua;
    private String Tipocuerpo;
    private Double irca;
    private int poblacion;
        
    public ObjetoGeografico (String nombre, int id, String municipio, String tipoagua, String Tipocuerpo, Double irca, int poblacion){
        this.nombre = nombre;
        this.id = id;
        this.municipio = municipio;
        this.tipoagua = tipoagua;
        this.Tipocuerpo = Tipocuerpo;
        this.irca = irca;
        this.poblacion = poblacion;
    }

    public ObjetoGeografico(){
    
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoagua() {
        return tipoagua;
    }

    public void setTipoagua(String tipoagua) {
        this.tipoagua = tipoagua;
    }

    public String getTipocuerpo() {
        return Tipocuerpo;
    }

    public void setTipocuerpo(String Tipocuerpo) {
        this.Tipocuerpo = Tipocuerpo;
    }

    public Double getIrca() {
        return irca;
    }

    public void setIrca(Double irca) {
        this.irca = irca;
    }
    
    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
    
}