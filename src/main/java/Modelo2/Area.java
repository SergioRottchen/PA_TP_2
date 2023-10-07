/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo2;

/**
 *
 * @author marta
 */
public class Area {
int id;
String nomArea;
String telefono;

    public Area(String nomArea, String telefono){
       this.nomArea = nomArea;
        this.telefono = telefono; 
    }
    public Area(int id, String nomArea, String telefono) {
        this.id = id;
        this.nomArea = nomArea;
        this.telefono = telefono;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNomArea() {
        return nomArea;
    }

    public String getTelefono() {
        return telefono;
    }

}
